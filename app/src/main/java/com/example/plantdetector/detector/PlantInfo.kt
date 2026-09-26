package com.example.plantdetector.detector

/**
 * 🌱 مدل داده‌ای اطلاعات گیاهان
 * هر گونه گیاهی دارای این فیلدها است
 */
data class PlantInfo(
    val name: String,              // نام رایج فارسی
    val scientificName: String,    // نام علمی کامل
    val family: String,            // خانواده گیاهی
    val description: String,       // توضیحات ۱-۲ خطی
    val habitat: String,           // زیستگاه
    val uses: String,              // کاربردها (دارویی، خوراکی و...)
    val flowering: String,         // زمان گلدهی
    val isEndangered: Boolean,     // آیا در معرض خطر است؟
    val interestingFacts: String   // نکات جالب
)
