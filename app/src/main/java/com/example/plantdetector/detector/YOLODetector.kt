package com.example.plantdetector.detector

import android.content.Context
import android.graphics.Bitmap
import android.graphics.RectF
import android.util.Log
import com.example.plantdetector.data.PlantDatabase
import com.example.plantdetector.utils.Constants
import org.tensorflow.lite.Interpreter
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.FileChannel

class YOLODetector(private val context: Context) {
    
    private var interpreter: Interpreter? = null
    private val inputSize = Constants.INPUT_SIZE
    private val classNames = Constants.CLASS_NAMES
    
    companion object {
        private const val TAG = "YOLODetector"
        private const val CONFIDENCE_THRESHOLD = 0.30f
    }
    
    init {
        loadModel()
    }
    
    private fun loadModel() {
        try {
            Log.d(TAG, "🌱 بارگذاری مدل...")
            
            val modelFile = File(context.cacheDir, "best_float16.tflite")
            if (!modelFile.exists()) {
                context.assets.open("best_float16.tflite").use { input ->
                    FileOutputStream(modelFile).use { output ->
                        input.copyTo(output)
                    }
                }
            }
            
            val fileInputStream = FileInputStream(modelFile)
            val channel = fileInputStream.channel
            val modelBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size())
            fileInputStream.close()
            
            val options = Interpreter.Options().apply { setNumThreads(4) }
            interpreter = Interpreter(modelBuffer, options)
            
            Log.d(TAG, "🌱 مدل آماده است")
            
        } catch (e: Exception) {
            Log.e(TAG, "❌ خطا: ${e.message}", e)
            throw e
        }
    }
    
    fun detect(bitmap: Bitmap): List<DetectionResult> {
        if (interpreter == null) return emptyList()
        
        try {
            val resizedBitmap = Bitmap.createScaledBitmap(bitmap, inputSize, inputSize, true)
            
            // 💾 ذخیره تصویر ورودی برای دیباگ
            val debugDir = File(context.getExternalFilesDir(null), "debug")
            debugDir.mkdirs()
            val debugFile = File(debugDir, "model_input_${System.currentTimeMillis()}.jpg")
            java.io.FileOutputStream(debugFile).use { out ->
                resizedBitmap.compress(Bitmap.CompressFormat.JPEG, 95, out)
            }
            Log.d(TAG, "💾 تصویر ورودی ذخیره شد: ${debugFile.absolutePath}")
            
            val inputBuffer = bitmapToByteBuffer(resizedBitmap)
            
            val outputBuffer = Array(1) { FloatArray(classNames.size) }
            interpreter!!.run(inputBuffer, outputBuffer)
            
            val rawOutput = outputBuffer[0]
            
            var maxIdx = 0
            var maxProb = 0f
            for (i in rawOutput.indices) {
                if (rawOutput[i] > maxProb) {
                    maxProb = rawOutput[i]
                    maxIdx = i
                }
            }
            
            Log.d(TAG, "🎯 تشخیص: ${classNames[maxIdx]} (index=$maxIdx, conf=${String.format("%.2f", maxProb*100)}٪)")
            
            if (maxProb >= CONFIDENCE_THRESHOLD && maxIdx < classNames.size) {
                val fullBox = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())
                val result = DetectionResult(
                    className = classNames[maxIdx],
                    confidence = maxProb,
                    boundingBox = fullBox,
                    classId = maxIdx
                )
                resizedBitmap.recycle()
                return listOf(result)
            }
            
            resizedBitmap.recycle()
            return emptyList()
            
        } catch (e: Exception) {
            Log.e(TAG, "❌ خطا: ${e.message}", e)
            return emptyList()
        }
    }
    
    private fun bitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {
        val buffer = ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3)
        buffer.order(ByteOrder.nativeOrder())
        val pixels = IntArray(inputSize * inputSize)
        bitmap.getPixels(pixels, 0, inputSize, 0, 0, inputSize, inputSize)
        for (pixel in pixels) {
            buffer.putFloat(((pixel shr 16 and 0xFF) / 255.0f))
            buffer.putFloat(((pixel shr 8 and 0xFF) / 255.0f))
            buffer.putFloat(((pixel and 0xFF) / 255.0f))
        }
        buffer.rewind()
        return buffer
    }
    
    fun getPlantInfo(className: String): PlantInfo {
        return PlantDatabase.getInfo(className)
    }
    
    fun close() {
        try {
            interpreter?.close()
        } catch (e: Exception) {
            Log.e(TAG, "❌ خطا: ${e.message}", e)
        }
    }
}
