import json

# خواندن فایل ترتیب کلاس‌ها
with open('species_family_map.json', 'r', encoding='utf-8') as f:
    species_map = json.load(f)

# استخراج ترتیب کلاس‌ها (حفظ ترتیب درج)
class_names = list(species_map.keys())

print(f"📊 تعداد کلاس‌ها: {len(class_names)}")
print(f"\n📋 ۵ کلاس اول:")
for i, name in enumerate(class_names[:5]):
    print(f"   {i}: {name} ({species_map[name]})")
print(f"\n📋 ۵ کلاس آخر:")
for i, name in enumerate(class_names[-5:], len(class_names)-5):
    print(f"   {i}: {name} ({species_map[name]})")

# تولید Constants.kt با INPUT_SIZE = 256 (مطابق args.yaml)
lines = []
lines.append('package com.example.plantdetector.utils')
lines.append('')
lines.append('object Constants {')
lines.append('    // ⚙️ اندازه ورودی مدل (از args.yaml استخراج شده)')
lines.append('    const val INPUT_SIZE = 256')
lines.append('    const val CONFIDENCE_THRESHOLD = 0.25f')
lines.append('    ')
lines.append('    /**')
lines.append(f'     * 🌱 لیست {len(class_names)} گونه گیاهی')
lines.append('     * ترتیب مطابق با species_family_map.json')
lines.append('     * ⚠️ تغییر ترتیب = تشخیص اشتباه!')
lines.append('     */')
lines.append('    val CLASS_NAMES = listOf(')

# اضافه کردن کلاس‌ها
for i, name in enumerate(class_names):
    family = species_map[name]
    comma = ',' if i < len(class_names) - 1 else ''
    lines.append(f'        "{name}"{comma}  // {i}: {family}')

lines.append('    )')
lines.append('}')

# ذخیره
output_path = "app/src/main/java/com/example/plantdetector/utils/Constants.kt"
with open(output_path, 'w', encoding='utf-8') as f:
    f.write('\n'.join(lines))

print(f"\n✅ فایل به‌روز شد: {output_path}")
print(f"📊 تعداد کل کلاس‌ها: {len(class_names)}")
print(f"📊 INPUT_SIZE = 256")
