import os

file_path = "app/src/main/java/com/example/plantdetector/CameraActivity.kt"

print("🔍 در حال بررسی فایل CameraActivity.kt...")

with open(file_path, 'r', encoding='utf-8') as f:
    content = f.read()

lines = content.split('\n')
new_lines = []
changed = False

for line in lines:
    # پیدا کردن خطی که نام گیاه را در کارت تشخیص نمایش می‌دهد
    if 'tvDetectedClass.text' in line and 'topResult.className' in line and 'ID:' not in line:
        # اضافه کردن ایندکس به انتهای نام گیاه
        line = line.replace('${topResult.className}', '${topResult.className} \\n🔢 Index: ${topResult.classId}')
        changed = True
    new_lines.append(line)

if changed:
    new_content = '\n'.join(new_lines)
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(new_content)
    print("✅ فایل با موفقیت به‌روزرسانی شد! حالا Index روی صفحه نمایش داده می‌شود.")
else:
    print("⚠️ نتوانستم خط مورد نظر را پیدا کنم. خطوط مربوط به tvDetectedClass:")
    for i, line in enumerate(new_lines):
        if 'tvDetectedClass' in line:
            print(f"   خط {i+1}: {line.strip()}")
