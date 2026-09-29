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
            
            val inputTensor = interpreter!!.getInputTensor(0)
            val outputTensor = interpreter!!.getOutputTensor(0)
            Log.d(TAG, "📥 ورودی: ${inputTensor.shape().contentToString()}")
            Log.d(TAG, "📤 خروجی: ${outputTensor.shape().contentToString()}")
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
            val inputBuffer = bitmapToByteBuffer(resizedBitmap)
            
            val outputBuffer = Array(1) { FloatArray(classNames.size) }
            interpreter!!.run(inputBuffer, outputBuffer)
            
            val rawOutput = outputBuffer[0]
            
            // ═══════════════════════════════════════════
            // بررسی نوع خروجی
            // ═══════════════════════════════════════════
            val sum = rawOutput.sum()
            val maxVal = rawOutput.max() ?: 0f
            val minVal = rawOutput.min() ?: 0f
            
            Log.d(TAG, "═══════════════════════════════════")
            Log.d(TAG, "📊 خروجی خام مدل:")
            Log.d(TAG, "   جمع: ${String.format("%.4f", sum)}")
            Log.d(TAG, "   بیشترین: ${String.format("%.4f", maxVal)}")
            Log.d(TAG, "   کمترین: ${String.format("%.4f", minVal)}")
            
            // اگر جمع ≈ 1.0 است، یعنی قبلاً softmax شده
            val isAlreadyProbability = (sum > 0.9f && sum < 1.1f && minVal >= 0f)
            Log.d(TAG, "   نوع خروجی: ${if (isAlreadyProbability) "احتمال ✅" else "logits ❌"}")
            
            val probabilities: FloatArray = if (isAlreadyProbability) {
                Log.d(TAG, "   ✅ بدون softmax (خروجی از قبل احتمال است)")
                rawOutput
            } else {
                Log.d(TAG, "   🔄 اعمال softmax...")
                softmax(rawOutput)
            }
            
            // پیدا کردن بهترین نتیجه
            var maxIdx = 0
            var maxProb = 0f
            for (i in probabilities.indices) {
                if (probabilities[i] > maxProb) {
                    maxProb = probabilities[i]
                    maxIdx = i
                }
            }
            
            Log.d(TAG, "🎯 تشخیص:")
            Log.d(TAG, "   Index: $maxIdx")
            Log.d(TAG, "   نام: ${classNames[maxIdx]}")
            Log.d(TAG, "   اطمینان: ${String.format("%.2f", maxProb * 100)}٪")
            
            // ۵ نتیجه برتر
            val top5 = probabilities.indices
                .sortedByDescending { probabilities[it] }
                .take(5)
            Log.d(TAG, "📋 پنج نتیجه برتر:")
            for ((rank, idx) in top5.withIndex()) {
                Log.d(TAG, "   ${rank+1}. ${classNames[idx]}: ${String.format("%.2f", probabilities[idx]*100)}٪")
            }
            Log.d(TAG, "═══════════════════════════════════")
            
            // آستانه
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
            Log.e(TAG, "❌ خطا در تشخیص: ${e.message}", e)
            return emptyList()
        }
    }
    
    private fun softmax(logits: FloatArray): FloatArray {
        val maxLogit = logits.max() ?: 0f
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
