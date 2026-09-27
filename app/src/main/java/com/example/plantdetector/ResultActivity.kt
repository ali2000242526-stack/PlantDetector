package com.example.plantdetector

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.plantdetector.databinding.ActivityResultBinding
import com.example.plantdetector.detector.YOLODetector
import com.example.plantdetector.utils.DataRecorder
import com.example.plantdetector.utils.LocationHelper
import java.text.DecimalFormat
import java.util.concurrent.Executors

class ResultActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityResultBinding
    private lateinit var detector: YOLODetector
    private lateinit var locationHelper: LocationHelper
    private lateinit var dataRecorder: DataRecorder
    private val executor = Executors.newSingleThreadExecutor()
    
    companion object {
        private const val TAG = "ResultActivity"
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        locationHelper = LocationHelper(this)
        dataRecorder = DataRecorder(this)
        
        try {
            detector = YOLODetector(this)
        } catch (e: Exception) {
            Log.e(TAG, "خطا: ${e.message}", e)
            Toast.makeText(this, "خطا: ${e.message}", Toast.LENGTH_LONG).show()
            finish()
            return
        }
        
        val imageUri = intent.getStringExtra("image_uri")
        val className = intent.getStringExtra("class_name")
        val confidence = intent.getFloatExtra("confidence", 0f)
        val primaryKey = intent.getStringExtra("primary_key")
        
        val latitude = intent.getDoubleExtra("latitude", 0.0)
        val longitude = intent.getDoubleExtra("longitude", 0.0)
        val fromCamera = intent.getBooleanExtra("from_camera", false)
        
        Log.d(TAG, "imageUri: $imageUri, className: $className, fromCamera: $fromCamera")
        
        if (imageUri != null) {
            try {
                val bitmap = loadBitmapFromUri(imageUri)
                
                if (bitmap != null) {
                    binding.ivPlantImage.setImageBitmap(bitmap)
                    
                    binding.overlayView.setImageDimensions(bitmap.width, bitmap.height)
                    binding.overlayView.setCameraMode(false)
                    
                    if (className == null || className.isEmpty()) {
                        detectInImage(bitmap)
                    } else if (fromCamera) {
                        drawBoundingBoxFromImage(bitmap)
                        displayResults(className, confidence, latitude, longitude, primaryKey)
                    } else {
                        displayResults(className, confidence, latitude, longitude, primaryKey)
                    }
                } else {
                    Log.e(TAG, "Bitmap null است")
                    Toast.makeText(this, "خطا در بارگذاری تصویر", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Log.e(TAG, "خطا در بارگذاری تصویر: ${e.message}", e)
                Toast.makeText(this, "خطا: ${e.message}", Toast.LENGTH_LONG).show()
            }
        } else if (className != null) {
            displayResults(className, confidence, latitude, longitude, primaryKey)
        }
        
        binding.btnBack.setOnClickListener { finish() }
    }
    
    /**
     * 🌱 بارگذاری Bitmap از URI (پشتیبانی از file:// و content://)
     */
    private fun loadBitmapFromUri(uriString: String): Bitmap? {
        return try {
            if (uriString.startsWith("file://")) {
                val filePath = Uri.parse(uriString).path
                Log.d(TAG, "بارگذاری از فایل: $filePath")
                BitmapFactory.decodeFile(filePath)
            } else {
                Log.d(TAG, "بارگذاری از گالری: $uriString")
                val inputStream = contentResolver.openInputStream(Uri.parse(uriString))
                val bitmap = BitmapFactory.decodeStream(inputStream)
                inputStream?.close()
                bitmap
            }
        } catch (e: Exception) {
            Log.e(TAG, "خطا در بارگذاری bitmap: ${e.message}", e)
            null
        }
    }
    
    /**
     * 🌱 تشخیص از تصویر (از گالری)
     */
    private fun detectInImage(bitmap: Bitmap) {
        binding.progressBar.isVisible = true
        
        executor.execute {
            try {
                val results = detector.detect(bitmap)
                
                runOnUiThread {
                    binding.progressBar.isVisible = false
                    
                    if (results.isNotEmpty()) {
                        val topResult = results[0]
                        
                        binding.overlayView.setDetections(results)
                        
                        if (topResult.confidence >= 0.50f) {
                            val prefs = getSharedPreferences("app_prefs", MODE_PRIVATE)
                            val userName = prefs.getString("user_name", "نامشخص") ?: "نامشخص"
                            
                            val latitude = intent.getDoubleExtra("latitude", 0.0)
                            val longitude = intent.getDoubleExtra("longitude", 0.0)
                            
                            val recordResult = dataRecorder.recordDetection(
                                bitmap = bitmap,
                                className = topResult.className,
                                confidence = topResult.confidence,
                                latitude = latitude,
                                longitude = longitude,
                                userName = userName
                            )
                            
                            if (recordResult.success) {
                                Toast.makeText(
                                    this,
                                    "✅ ثبت شد: ${topResult.className}\nکلید: ${recordResult.primaryKey}",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                            
                            displayResults(
                                topResult.className,
                                topResult.confidence,
                                latitude,
                                longitude,
                                recordResult.primaryKey
                            )
                        } else {
                            Toast.makeText(
                                this,
                                "درصد تشخیص پایین است: ${String.format("%.1f", topResult.confidence * 100)}٪",
                                Toast.LENGTH_LONG
                            ).show()
                            binding.tvClassName.text = "تشخیص پایین: ${String.format("%.1f", topResult.confidence * 100)}٪"
                        }
                    } else {
                        Toast.makeText(this, getString(R.string.no_plant_detected), Toast.LENGTH_SHORT).show()
                        binding.tvClassName.text = getString(R.string.no_plant_detected)
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "خطا: ${e.message}", e)
                runOnUiThread {
                    binding.progressBar.isVisible = false
                    Toast.makeText(this, "خطا: ${e.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    
    /**
     * 🌱 رسم Bounding Box برای تصاویر از دوربین
     */
    private fun drawBoundingBoxFromImage(bitmap: Bitmap) {
        executor.execute {
            try {
                val results = detector.detect(bitmap)
                
                runOnUiThread {
                    if (results.isNotEmpty()) {
                        binding.overlayView.setDetections(results)
                        Log.d(TAG, "✅ Bounding Box رسم شد: ${results.size} تشخیص")
                    } else {
                        Log.w(TAG, "⚠️ تشخیصی برای رسم Bounding Box یافت نشد")
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "خطا در رسم Bounding Box: ${e.message}", e)
            }
        }
    }
    
    /**
     * 🌱 نمایش نتایج تشخیص
     */
    private fun displayResults(
        className: String,
        confidence: Float,
        latitude: Double,
        longitude: Double,
        primaryKey: String?
    ) {
        try {
            val plantInfo = detector.getPlantInfo(className)
            val df = DecimalFormat("#.##")
            val confidencePercent = (confidence * 100)
            
            binding.apply {
                tvClassName.text = plantInfo.name
                tvScientificName.text = plantInfo.scientificName
                tvConfidence.text = getString(R.string.confidence_format, df.format(confidencePercent))
                tvFamily.text = getString(R.string.family_format, plantInfo.family)
                tvDescription.text = plantInfo.description
                tvHabitat.text = getString(R.string.habitat_format, plantInfo.habitat)
                tvUses.text = getString(R.string.uses_format, plantInfo.uses)
                tvFlowering.text = getString(R.string.flowering_format, plantInfo.flowering)
                tvFacts.text = plantInfo.interestingFacts
                
                // نمایش کلید اصلی
                if (!primaryKey.isNullOrEmpty()) {
                    primaryKeyCard.isVisible = true
                    tvPrimaryKey.text = "🔑 $primaryKey"
                } else {
                    primaryKeyCard.isVisible = false
                }
                
                // نمایش موقعیت مکانی
                if (latitude != 0.0 && longitude != 0.0) {
                    locationCard.isVisible = true
                    tvLocation.text = String.format(
                        "📍 %.6f, %.6f",
                        latitude,
                        longitude
                    )
                    
                    val mapsLink = "https://maps.google.com/?q=$latitude,$longitude"
                    tvMapsLink.setOnClickListener {
                        val intent = android.content.Intent(
                            android.content.Intent.ACTION_VIEW,
                            Uri.parse(mapsLink)
                        )
                        startActivity(intent)
                    }
                } else {
                    locationCard.isVisible = false
                }
                
                // ⚠️ هشدار برای گونه‌های در معرض خطر
                if (plantInfo.isEndangered) {
                    warningCard.isVisible = true
                    tvWarning.text = getString(R.string.warning_endangered)
                } else {
                    warningCard.isVisible = false
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "خطا: ${e.message}", e)
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        executor.shutdown()
        detector.close()
    }
}
