#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
ادغام JSON های چهار خانواده و تولید PlantDatabase.kt نهایی
"""

import json
from datetime import datetime

# تنظیمات
FAMILIES = ['fabaceae', 'lamiaceae', 'liliaceae', 'rosaceae']
FAMILY_NAMES = {
    "fabaceae": "Fabaceae (باقلائیان)",
    "lamiaceae": "Lamiaceae (نعنائیان)",
    "liliaceae": "Liliaceae (سوسنیان)",
    "rosaceae": "Rosaceae (گل‌سرخیان)"
}

# خواندن داده‌ها
all_data = {}
total = 0
for family in FAMILIES:
    try:
        with open(f'{family}.json', 'r', encoding='utf-8') as f:
            content = f.read().strip()
            # حذف markdown در صورت وجود
            if content.startswith('```'):
                content = '\n'.join(content.split('\n')[1:-1])
            all_data[family] = json.loads(content)
            count = len(all_data[family].get('species_data', []))
            total += count
            print(f"✅ {family}: {count} گونه")
    except Exception as e:
        print(f"❌ خطا در {family}.json: {e}")

# تولید کد Kotlin
lines = []
lines.append('package com.example.plantdetector.data')
lines.append('')
lines.append('import com.example.plantdetector.detector.PlantInfo')
lines.append('')
lines.append('/**')
lines.append(' * 🌱 پایگاه داده گونه‌های گیاهی استان چهارمحال و بختیاری')
lines.append(f' * تولید شده در تاریخ: {datetime.now().strftime("%Y-%m-%d %H:%M")}')
lines.append(f' * تعداد گونه‌ها: {total}')
lines.append(' */')
lines.append('object PlantDatabase {')
lines.append('    fun getInfo(className: String): PlantInfo {')
lines.append('        return when (className) {')

# نگاشت نام علمی به کلید (Astragalus albispinus → Astragalus_albispinus)
species_to_key = {}
for family in FAMILIES:
    for item in all_data[family].get('species_data', []):
        sci = item.get('scientificName', '')
        key = sci.replace(' ', '_')
        species_to_key[key] = {
            'family_key': family,
            'data': item
        }

current_family = None
for key, info in species_to_key.items():
    family_key = info['family_key']
    item = info['data']
    family_display = FAMILY_NAMES[family_key]
    
    if family_key != current_family:
        current_family = family_key
        lines.append('')
        lines.append('            // ═══════════════════════════════════════════')
        lines.append(f'            // {family_display}')
        lines.append('            // ═══════════════════════════════════════════')
    
    # escape کردن نقل‌قول‌ها در متن‌ها
    def safe(s):
        return str(s).replace('"', '\\"') if s else '-'
    
    lines.append(f'            "{key}" -> PlantInfo(')
    lines.append(f'                name = "{safe(item.get("persianName", key.replace("_", " ")))}",')
    lines.append(f'                scientificName = "{safe(item.get("scientificName", key.replace("_", " ")))}",')
    lines.append(f'                family = "{family_display}",')
    lines.append(f'                description = "{safe(item.get("description"))}",')
    lines.append(f'                habitat = "{safe(item.get("habitat"))}",')
    lines.append(f'                uses = "{safe(item.get("uses"))}",')
    lines.append(f'                flowering = "{safe(item.get("flowering"))}",')
    lines.append(f'                isEndangered = {str(item.get("isEndangered", False)).lower()},')
    lines.append(f'                interestingFacts = "{safe(item.get("interestingFacts"))}"')
    lines.append(f'            )')
    lines.append('')

lines.append('            // ═══════════════════════════════════════════')
lines.append('            // مقدار پیش‌فرض')
lines.append('            // ═══════════════════════════════════════════')
lines.append('            else -> PlantInfo(')
lines.append('                name = className.replace("_", " "),')
lines.append('                scientificName = className.replace("_", " "),')
lines.append('                family = "نامشخص",')
lines.append('                description = "اطلاعات بیشتری در دسترس نیست",')
lines.append('                habitat = "استان چهارمحال و بختیاری",')
lines.append('                uses = "-",')
lines.append('                flowering = "-",')
lines.append('                isEndangered = false,')
lines.append('                interestingFacts = "-"')
lines.append('            )')
lines.append('        }')
lines.append('    }')
lines.append('}')

# ذخیره
output_path = "app/src/main/java/com/example/plantdetector/data/PlantDatabase.kt"
content = '\n'.join(lines)
with open(output_path, 'w', encoding='utf-8') as f:
    f.write(content)

print(f"\n✅ فایل نهایی ساخته شد: {output_path}")
print(f"📊 تعداد کل گونه‌ها: {total}")





