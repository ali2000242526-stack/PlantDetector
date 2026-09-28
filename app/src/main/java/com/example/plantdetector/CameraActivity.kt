package com.example.plantdetector

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageProxy
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.plantdetector.databinding.ActivityCameraBinding
import com.example.plantdetector.detector.DetectionResult
import com.example.plantdetector.detector.YOLODetector
import com.example.plantdetector.utils.DataRecorder
import com.example.plantdetector.utils.ServerUploader
import java.io.File
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean

class CameraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameraBinding
    private lateinit var detector: YOLODetector
    private lateinit var dataRecorder: DataRecorder
    private lateinit var serverUploader: ServerUploader

    private var imageCapture: ImageCapture? = null
    private var cameraExecutor: ExecutorService = Executors.newSingleThreadExecutor()
    private val analysisExecutor: ExecutorService = Executors.newSingleThreadExecutor()

    private val isProcessing = AtomicBoolean(false)
    private var frameCount = 0
    private var lastDetectionTime = 0L
    private var lastValidDetection: DetectionResult? = null
    private var currentPhotoFile: File? = null
    private lateinit var prefs: android.content.SharedPreferences

    companion object {
        private const val TAG = "CameraActivity"
        private const val DETECTION_INTERVAL_MS = 500L
        private const val REQUEST_CODE_PERMISSIONS = 10
        private val REQUIRED_PERMISSIONS = arrayOf(
            Manifest.permission.CAMERA
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)

        try {
            detector = YOLODetector(this)
        } catch (e: Exception) {
            Log.e(TAG, "خطا در بارگذاری مدل: ${e.message}", e)
            Toast.makeText(this, "خطا در بارگذاری مدل", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        dataRecorder = DataRecorder(this)
        serverUploader = ServerUploader(this)

        if (allPermissionsGranted()) {
            startCamera()
        } else {
            ActivityCompat.requestPermissions(
                this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS
            )
        }

        binding.btnCancel.setOnClickListener { finish() }
        binding.btnBack.setOnClickListener { finish() }
        binding.btnCapture.setOnClickListener { captureAndSave() }
    }

    private fun startCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            try {
                val cameraProvider = cameraProviderFuture.get()
                val preview = Preview.Builder().build().also {
                    it.setSurfaceProvider(binding.previewView.surfaceProvider)
                }

                imageCapture = ImageCapture.Builder()
                    .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                    .build()

                val imageAnalysis = ImageAnalysis.Builder()
                    .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                    .setOutputImageFormat(ImageAnalysis.OUTPUT_IMAGE_FORMAT_YUV_420_888)
                    .build()
                    .also {
                        it.setAnalyzer(analysisExecutor, ::analyzeImage)
                    }

                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(
                    this,
                    CameraSelector.DEFAULT_BACK_CAMERA,
                    preview,
                    imageCapture,
                    imageAnalysis
                )

                runOnUiThread {
                    binding.btnCapture.isEnabled = true
                    binding.btnCapture.backgroundTintList =
                        ContextCompat.getColorStateList(this, android.R.color.holo_green_light)
                }

            } catch (e: Exception) {
                Log.e(TAG, "خطا در شروع دوربین: ${e.message}", e)
            }
        }, ContextCompat.getMainExecutor(this))
    }

    private fun analyzeImage(imageProxy: ImageProxy) {
        val currentTime = System.currentTimeMillis()

        if (currentTime - lastDetectionTime < DETECTION_INTERVAL_MS) {
            imageProxy.close()
            return
        }

        if (isProcessing.get()) {
            imageProxy.close()
            return
        }

        isProcessing.set(true)
        frameCount++

        try {
            val bitmap = imageProxy.toBitmap()
            val results = detector.detect(bitmap)

            lastDetectionTime = currentTime

            if (results.isNotEmpty()) {
                val topResult = results[0]
                if (topResult.confidence >= 0.10f) {
                    lastValidDetection = topResult

                    runOnUiThread {
                        binding.cardDetectionInfo.visibility = android.view.View.VISIBLE
                        binding.tvDetectedClass.text = "✅ ${topResult.className}"
                        binding.tvDetectedConfidence.text =
                            "اطمینان: ${String.format("%.1f", topResult.confidence * 100)}٪"
                        binding.overlayView.setImageDimensions(bitmap.width, bitmap.height)
                        binding.overlayView.setCameraMode(true)
                        binding.overlayView.setDetections(results)
                    }
                } else {
                    runOnUiThread {
                        binding.cardDetectionInfo.visibility = android.view.View.GONE
                    }
                }
            } else {
                lastValidDetection = null
                runOnUiThread {
                    binding.cardDetectionInfo.visibility = android.view.View.GONE
                    binding.overlayView.setDetections(emptyList())
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "خطا در تحلیل: ${e.message}", e)
        } finally {
            isProcessing.set(false)
            imageProxy.close()
        }
    }

    private fun captureAndSave() {
        val detection = lastValidDetection
        if (detection == null) {
            Toast.makeText(this, "ابتدا یک گیاه را تشخیص دهید", Toast.LENGTH_SHORT).show()
            return
        }

        binding.btnCapture.isEnabled = false

        val imageCapture = imageCapture ?: return
        val photoFile = File(
            externalCacheDir,
            SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault())
                .format(System.currentTimeMillis()) + ".jpg"
        )
        currentPhotoFile = photoFile

        val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()

        imageCapture.takePicture(
            outputOptions,
            ContextCompat.getMainExecutor(this),
            object : ImageCapture.OnImageSavedCallback {
                override fun onError(exc: androidx.camera.core.ImageCaptureException) {
                    Log.e(TAG, "خطا در ذخیره: ${exc.message}", exc)
                    runOnUiThread {
                        binding.btnCapture.isEnabled = true
                        Toast.makeText(this@CameraActivity, "خطا در عکس‌برداری", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onImageSaved(output: ImageCapture.OutputFileResults) {
                    val userName = prefs.getString("user_name", "نامشخص") ?: "نامشخص"
                    // GPS موقتاً غیرفعال - مقدار پیش‌فرض
                    val latitude = 0.0
                    val longitude = 0.0

                    val bitmap = BitmapFactory.decodeFile(photoFile.absolutePath)

                    val recordResult = dataRecorder.recordDetection(
                        bitmap = bitmap,
                        className = detection.className,
                        confidence = detection.confidence,
                        latitude = latitude,
                        longitude = longitude,
                        userName = userName
                    )

                    if (recordResult.success) {
                        runOnUiThread {
                            Toast.makeText(
                                this@CameraActivity,
                                "✅ ثبت شد: ${detection.className}\nکلید: ${recordResult.primaryKey}",
                                Toast.LENGTH_LONG
                            ).show()
                        }

                    }

                    val intent = Intent(this@CameraActivity, ResultActivity::class.java).apply {
                        putExtra("image_uri", Uri.fromFile(photoFile).toString())
                        putExtra("class_name", detection.className)
                        putExtra("confidence", detection.confidence)
                        putExtra("latitude", latitude)
                        putExtra("longitude", longitude)
                        putExtra("from_camera", true)
                        putExtra("primary_key", recordResult.primaryKey)
                    }
                    startActivity(intent)

                    runOnUiThread {
                        binding.btnCapture.isEnabled = true
                    }
                }
            }
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (allPermissionsGranted()) {
                startCamera()
            } else {
                Toast.makeText(this, "مجوزها اعطا نشدند", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }

    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraExecutor.shutdown()
        analysisExecutor.shutdown()
        detector.close()
    }
}
