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

/**
 * 🌱 تشخیص‌دهنده گیاهان با استفاده از مدل YOLO Classification
 * این کلاس برای مدل‌های classification طراحی شده است (نه detection)
 */
class YOLODetector(private val context: Context) {
    
    private var interpreter: Interpreter? = null
    private val inputSize = Constants.INPUT_SIZE  // 256
    private val confidenceThreshold = Constants.CONFIDENCE_THRESHOLD
    private val classNames = Constants.CLASS_NAMES
    
    companion object {
        private const val TAG = "YOLODetector"
    }
    
    init {
        loadModel()
    }
    
    private fun loadModel() {
        try {
            Log.d(TAG, "🌱 شروع بارگذاری مدل classification...")
            
            val modelFile = File(context.cacheDir, "best_float16.tflite")
            
            if (!modelFile.exists()) {
                Log.d(TAG, "📋 کپی فایل از assets به cache...")
                context.assets.open("best_float16.tflite").use { input ->
                    FileOutputStream(modelFile).use { output ->
                        input.copyTo(output)
                    }
                }
            }
            
            Log.d(TAG, "📊 اندازه مدل: ${modelFile.length()} bytes")
            
            val fileInputStream = FileInputStream(modelFile)
            val channel = fileInputStream.channel
            val modelBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size())
            fileInputStream.close()
            
            val options = Interpreter.Options().apply {
                setNumThreads(4)
            }
            
            interpreter = Interpreter(modelBuffer, options)
            
            // بررسی shape ورودی و خروجی
            val inputTensor = interpreter!!.getInputTensor(0)
            val outputTensor = interpreter!!.getOutputTensor(0)
            
            Log.d(TAG, "📥 Shape ورودی: ${inputTensor.shape().contentToString()}")
            Log.d(TAG, "📤 Shape خروجی: ${outputTensor.shape().contentToString()}")
            Log.d(TAG, "🌱 مدل classification با موفقیت بارگذاری شد")
            Log.d(TAG, "📊 تعداد کلاس‌ها: ${classNames.size}")
            
        } catch (e: Exception) {
            Log.e(TAG, "❌ خطا در بارگذاری مدل: ${e.message}", e)
            throw e
        }
    }
    
    /**
     * 🌱 تشخیص گیاه در تصویر
     * خروجی: لیستی با یک تشخیص (بهترین کلاس)
     */
    fun detect(bitmap: Bitmap): List<DetectionResult> {
        if (interpreter == null) {
            Log.e(TAG, "❌ Interpreter null است!")
            return emptyList()
        }
        
        try {
            // تغییر اندازه تصویر به 256x256
            val resizedBitmap = Bitmap.createScaledBitmap(bitmap, inputSize, inputSize, true)
            val inputBuffer = bitmapToByteBuffer(resizedBitmap)
            
            // بافر خروجی برای classification: [1, num_classes]
            val outputBuffer = Array(1) { FloatArray(classNames.size) }
            
            interpreter!!.run(inputBuffer, outputBuffer)
            
            // تبدیل خروجی به probabilities با softmax
            val probabilities = softmax(outputBuffer[0])
            
            // پیدا کردن کلاس با بیشترین احتمال
            var maxIdx = 0
            var maxProb = 0f
            for (i in probabilities.indices) {
                if (probabilities[i] > maxProb) {
                    maxProb = probabilities[i]
                    maxIdx = i
                }
            }
            
            Log.d(TAG, "🎯 تشخیص: ${classNames[maxIdx]} با اطمینان ${String.format("%.2f", maxProb * 100)}٪")
            
            // اگر اطمینان بالای آستانه بود، برگردان
            if (maxProb >= confidenceThreshold && maxIdx < classNames.size) {
                // bounding box کل تصویر (چون classification است)
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
            Log.e(TAG, "❌ خطا در تشخیص: ${e.message}", e)
            return emptyList()
        }
    }
    
    /**
     * 🔄 Softmax برای تبدیل logits به probabilities
     */
    private fun softmax(logits: FloatArray): FloatArray {
        val maxLogit = logits.maxOrNull() ?: 0f
        val exps = FloatArray(logits.size)
        var sum = 0f
        
        for (i in logits.indices) {
            exps[i] = Math.exp((logits[i] - maxLogit).toDouble()).toFloat()
            sum += exps[i]
        }
        
        for (i in exps.indices) {
            exps[i] /= sum
        }
        
        return exps
    }
    
    /**
     * 📸 تبدیل Bitmap به ByteBuffer برای TFLite
     * نرمال‌سازی: پیکسل‌ها به بازه [0, 1]
     */
    private fun bitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {
        val buffer = ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3)
        buffer.order(ByteOrder.nativeOrder())
        
        val pixels = IntArray(inputSize * inputSize)
        bitmap.getPixels(pixels, 0, inputSize, 0, 0, inputSize, inputSize)
        
        for (pixel in pixels) {
            // استخراج RGB و نرمال‌سازی به [0, 1]
            buffer.putFloat(((pixel shr 16 and 0xFF) / 255.0f))
            buffer.putFloat(((pixel shr 8 and 0xFF) / 255.0f))
            buffer.putFloat(((pixel and 0xFF) / 255.0f))
        }
        
        buffer.rewind()
        return buffer
    }
    
    /**
     * 🌱 دریافت اطلاعات گیاه از PlantDatabase
     */
    fun getPlantInfo(className: String): PlantInfo {
        return PlantDatabase.getInfo(className)
    }
    
    /**
     * 🔒 بستن interpreter
     */
    fun close() {
        try {
            interpreter?.close()
            Log.d(TAG, "🔒 Interpreter بسته شد")
        } catch (e: Exception) {
            Log.e(TAG, "❌ خطا در بستن: ${e.message}", e)
        }
    }
}
