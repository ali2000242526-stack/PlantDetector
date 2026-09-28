#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
استخراج لیبل‌ها از مدل TFLite با روش بهبودیافته
"""
import os
import json
import subprocess
import pandas as pd

MODEL_PATH = "app/src/main/assets/best_float16.tflite"

print("=" * 70)
print("🏷️  استخراج لیبل‌های مدل TFLite")
print("=" * 70)

# ═══════════════════════════════════════════════════════
# مرحله ۱: خواندن لیست گونه‌ها از dataset_report.csv
# ═══════════════════════════════════════════════════════
print("\n📖 مرحله ۱: خواندن لیست گونه‌ها از دیتاست...")

try:
    df = pd.read_csv('dataset_report.csv')
    expected_species = df['Species'].tolist()
    print(f"   ✅ تعداد گونه‌ها در دیتاست: {len(expected_species)}")
    
    print(f"\n📋 توزیع خانواده‌ها:")
    for family, count in df['Family'].value_counts().sort_index().items():
        print(f"   - {family}: {count} گونه")
        
    # مرتب‌سازی به ترتیب دیتاست (احتمالاً ترتیب آموزش)
    print(f"\n📋 ۵ گونه اول در دیتاست:")
    for i, sp in enumerate(expected_species[:5]):
        print(f"   {i}: {sp}")
        
except Exception as e:
    print(f"   ❌ خطا در خواندن dataset_report.csv: {e}")
    expected_species = []

# ═══════════════════════════════════════════════════════
# مرحله ۲: استخراج رشته‌ها از مدل با دستور strings
# ═══════════════════════════════════════════════════════
print("\n📖 مرحله ۲: استخراج رشته‌ها از مدل...")

try:
    result = subprocess.run(['strings', MODEL_PATH], capture_output=True, text=True)
    all_strings = result.stdout.split('\n')
    print(f"   ✅ تعداد کل رشته‌ها در مدل: {len(all_strings)}")
    
    # جستجوی دقیق گونه‌های دیتاست در مدل
    found_in_order = []
    not_found = []
    
    for species in expected_species:
        if species in all_strings:
            # پیدا کردن موقعیت این گونه در خروجی
            idx = all_strings.index(species)
            found_in_order.append((idx, species))
        else:
            not_found.append(species)
    
    print(f"\n📊 نتیجه جستجو:")
    print(f"   ✅ پیدا شده: {len(found_in_order)}/{len(expected_species)}")
    print(f"   ❌ پیدا نشده: {len(not_found)}/{len(expected_species)}")
    
    # مرتب‌سازی بر اساس موقعیت در مدل (این ترتیب واقعی مدل است!)
    found_in_order.sort(key=lambda x: x[0])
    model_order = [sp for _, sp in found_in_order]
    
    print(f"\n📋 ترتیب واقعی مدل (۱۰ تای اول):")
    for i, sp in enumerate(model_order[:10]):
        print(f"   {i:3d}: {sp}")
        
    print(f"\n📋 ترتیب واقعی مدل (۱۰ تای آخر):")
    for i, sp in enumerate(model_order[-10:], len(model_order)-10):
        print(f"   {i:3d}: {sp}")
    
    # ذخیره ترتیب واقعی مدل
    with open('model_order.txt', 'w', encoding='utf-8') as f:
        f.write('\n'.join(model_order))
    print(f"\n💾 ذخیره شد: model_order.txt")
    
    # ═══════════════════════════════════════════════════════
    # مرحله ۳: مقایسه با ترتیب دیتاست و species_family_map
    # ═══════════════════════════════════════════════════════
    print("\n📖 مرحله ۳: مقایسه ترتیب‌ها...")
    
    # مقایسه با ترتیب دیتاست
    if len(model_order) == len(expected_species):
        matches_dataset = sum(1 for a, b in zip(model_order, expected_species) if a == b)
        print(f"   تطابق با ترتیب دیتاست: {matches_dataset}/{len(expected_species)}")
    
    # مقایسه با species_family_map.json
    try:
        with open('species_family_map.json', 'r', encoding='utf-8') as f:
            species_map = json.load(f)
        json_order = list(species_map.keys())
        
        if len(model_order) == len(json_order):
            matches_json = sum(1 for a, b in zip(model_order, json_order) if a == b)
            print(f"   تطابق با ترتیب JSON: {matches_json}/{len(json_order)}")
            
            if matches_json == len(json_order):
                print(f"\n🎉 عالی! ترتیب مدل دقیقاً با species_family_map.json یکی است!")
                print(f"   ✅ Constants.kt فعلی درست است")
            else:
                print(f"\n⚠️  ترتیب مدل متفاوت است!")
                print(f"   🔄 باید Constants.kt با ترتیب واقعی مدل به‌روز شود")
                
                # تولید Constants.kt جدید با ترتیب واقعی مدل
                print(f"\n🔧 تولید Constants.kt جدید با ترتیب واقعی مدل...")
                
                lines = []
                lines.append('package com.example.plantdetector.utils')
                lines.append('')
                lines.append('object Constants {')
                lines.append('    // ⚙️ اندازه ورودی مدل (از مدل استخراج شده)')
                lines.append('    const val INPUT_SIZE = 256')
                lines.append('    const val CONFIDENCE_THRESHOLD = 0.25f')
                lines.append('    ')
                lines.append('    /**')
                lines.append(f'     * 🌱 لیست {len(model_order)} گونه گیاهی')
                lines.append('     * ترتیب واقعی استخراج شده از مدل TFLite')
                lines.append('     * ⚠️ تغییر ترتیب = تشخیص اشتباه!')
                lines.append('     */')
                lines.append('    val CLASS_NAMES = listOf(')
                
                for i, name in enumerate(model_order):
                    family = species_map.get(name, "نامشخص")
                    comma = ',' if i < len(model_order) - 1 else ''
                    lines.append(f'        "{name}"{comma}  // {i}: {family}')
                
                lines.append('    )')
                lines.append('}')
                
                output_path = "app/src/main/java/com/example/plantdetector/utils/Constants.kt"
                with open(output_path, 'w', encoding='utf-8') as f:
                    f.write('\n'.join(lines))
                
                print(f"   ✅ Constants.kt به‌روز شد: {output_path}")
                
    except Exception as e:
        print(f"   ⚠️  خطا در مقایسه با JSON: {e}")
        
except Exception as e:
    print(f"   ❌ خطا: {e}")

print("\n" + "=" * 70)
print("🎯 خلاصه:")
print("   - ترتیب واقعی مدل در: model_order.txt")
print("   - اگر ترتیب متفاوت بود، Constants.kt به‌روز شده است")
print("=" * 70)
