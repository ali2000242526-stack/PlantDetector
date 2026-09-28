#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
تحلیل کامل مدل TFLite و استخراج ترتیب کلاس‌ها
"""
import os
import json
import zipfile
import pandas as pd
from pathlib import Path

MODEL_PATH = "app/src/main/assets/best_float16.tflite"

print("=" * 70)
print("🔍 تحلیل مدل TFLite")
print("=" * 70)

# بررسی وجود فایل
if not os.path.exists(MODEL_PATH):
    print(f"❌ فایل مدل پیدا نشد: {MODEL_PATH}")
    exit(1)

file_size_mb = os.path.getsize(MODEL_PATH) / (1024*1024)
print(f"\n📊 حجم مدل: {file_size_mb:.2f} MB")

# ═══════════════════════════════════════════════════════
# بخش ۱: بررسی ساختار مدل با TensorFlow Lite
# ═══════════════════════════════════════════════════════
print("\n" + "=" * 70)
print("📥 بخش ۱: بررسی ساختار مدل")
print("=" * 70)

try:
    import tensorflow as tf
    interpreter = tf.lite.Interpreter(model_path=MODEL_PATH)
    interpreter.allocate_tensors()
    
    input_details = interpreter.get_input_details()
    output_details = interpreter.get_output_details()
    
    print("\n📥 ورودی:")
    for i, detail in enumerate(input_details):
        print(f"   [{i}] Shape: {detail['shape']}")
        print(f"       Type: {detail['dtype']}")
        print(f"       Name: {detail['name']}")
        
        # استخراج INPUT_SIZE
        shape = detail['shape']
        if len(shape) == 4:
            input_size = shape[1]
            print(f"       🎯 INPUT_SIZE = {input_size}")
    
    print("\n📤 خروجی:")
    for i, detail in enumerate(output_details):
        print(f"   [{i}] Shape: {detail['shape']}")
        print(f"       Type: {detail['dtype']}")
        print(f"       Name: {detail['name']}")
        
        # استخراج تعداد کلاس‌ها
        shape = detail['shape']
        if len(shape) == 2:
            num_classes = shape[1]
            print(f"       🎯 تعداد کلاس‌ها = {num_classes}")
        elif len(shape) == 1:
            num_classes = shape[0]
            print(f"       🎯 تعداد کلاس‌ها = {num_classes}")
            
except Exception as e:
    print(f"❌ خطا در TensorFlow Lite: {e}")
    num_classes = None
    input_size = None

# ═══════════════════════════════════════════════════════
# بخش ۲: استخراج Metadata (لیبل‌ها)
# ═══════════════════════════════════════════════════════
print("\n" + "=" * 70)
print("🏷️  بخش ۲: بررسی Metadata برای لیبل‌ها")
print("=" * 70)

model_labels = None
try:
    from tflite_support.metadata import MetadataDisplayer
    
    with open(MODEL_PATH, 'rb') as f:
        model_buffer = f.read()
    
    displayer = MetadataDisplayer.from_model_buffer(model_buffer)
    
    # لیست فایل‌های مرتبط
    assoc_files = displayer.get_associated_files()
    print(f"\n📁 فایل‌های مرتبط با مدل: {assoc_files}")
    
    # جستجوی فایل لیبل
    label_files = [f for f in assoc_files if 'label' in f.lower() or 'class' in f.lower()]
    
    if label_files:
        label_file = label_files[0]
        print(f"🏷️  پیدا شد: {label_file}")
        label_buffer = displayer.get_associated_file_buffer(label_file)
        model_labels = label_buffer.decode('utf-8').strip().split('\n')
        print(f"\n✅ تعداد کلاس‌ها در metadata: {len(model_labels)}")
        print(f"\n📋 ترتیب کلاس‌ها در مدل:")
        for i, label in enumerate(model_labels):
            print(f"   {i:3d}: {label}")
        
        # ذخیره
        with open('model_labels_from_metadata.txt', 'w', encoding='utf-8') as f:
            f.write('\n'.join(model_labels))
        print(f"\n💾 ذخیره شد: model_labels_from_metadata.txt")
    else:
        print("⚠️  فایل لیبل در metadata پیدا نشد")
        
        # سعی در استخراج مستقیم از buffer
        print("\n🔍 جستجوی الگوی لیبل در مدل...")
        
except ImportError:
    print("⚠️  tflite_support نصب نیست - نصب می‌کنیم...")
    os.system("pip install tflite-support -q")
    print("💡 دوباره اسکریپت را اجرا کنید")
except Exception as e:
    print(f"⚠️  Metadata در دسترس نیست: {e}")

# ═══════════════════════════════════════════════════════
# بخش ۳: تولید لیست الفبایی (روش استاندارد YOLO)
# ═══════════════════════════════════════════════════════
print("\n" + "=" * 70)
print("🔤 بخش ۳: لیست الفبایی (روش استاندارد YOLO)")
print("=" * 70)

try:
    df = pd.read_csv('dataset_report.csv')
    alphabetical_list = sorted(df['Species'].tolist())
    print(f"\n📋 تعداد گونه‌ها: {len(alphabetical_list)}")
    print(f"\n🔤 ۱۰ کلاس اول (الفبایی):")
    for i, sp in enumerate(alphabetical_list[:10]):
        print(f"   {i:3d}: {sp}")
    print(f"   ...")
    print(f"\n🔤 ۱۰ کلاس آخر (الفبایی):")
    for i, sp in enumerate(alphabetical_list[-10:], len(alphabetical_list)-10):
        print(f"   {i:3d}: {sp}")
    
    with open('alphabetical_order.txt', 'w', encoding='utf-8') as f:
        f.write('\n'.join(alphabetical_list))
    print(f"\n💾 ذخیره شد: alphabetical_order.txt")
    
except Exception as e:
    print(f"❌ خطا در خواندن dataset_report.csv: {e}")
    alphabetical_list = None

# ═══════════════════════════════════════════════════════
# بخش ۴: مقایسه ترتیب‌ها
# ═══════════════════════════════════════════════════════
print("\n" + "=" * 70)
print("📊 بخش ۴: مقایسه ترتیب‌ها")
print("=" * 70)

if model_labels and alphabetical_list:
    print(f"\nتعداد در metadata: {len(model_labels)}")
    print(f"تعداد در dataset: {len(alphabetical_list)}")
    
    if len(model_labels) == len(alphabetical_list):
        # بررسی تطابق
        matches = sum(1 for a, b in zip(model_labels, alphabetical_list) if a == b)
        print(f"\nتطابق مستقیم: {matches}/{len(model_labels)}")
        
        if matches == len(model_labels):
            print("✅ ترتیب metadata دقیقاً با ترتیب الفبایی یکی است!")
            print("🎯 نتیجه: از ترتیب الفبایی استفاده کنید")
        else:
            print(f"⚠️  ترتیب متفاوت است ({matches}/{len(model_labels)})")
            print("\n🔍 ۵ تفاوت اول:")
            diff_count = 0
            for i, (a, b) in enumerate(zip(model_labels, alphabetical_list)):
                if a != b:
                    print(f"   [{i}] metadata: {a} | الفبایی: {b}")
                    diff_count += 1
                    if diff_count >= 5:
                        break
    else:
        print("⚠️  تعداد کلاس‌ها متفاوت است!")

# ═══════════════════════════════════════════════════════
# بخش ۵: توصیه نهایی
# ═══════════════════════════════════════════════════════
print("\n" + "=" * 70)
print("💡 توصیه نهایی")
print("=" * 70)

if model_labels:
    print("\n✅ ترتیب کلاس‌ها از metadata استخراج شد")
    print("📁 فایل: model_labels_from_metadata.txt")
    print("🎯 این ترتیب را در Constants.kt استفاده کنید")
elif alphabetical_list:
    print("\n⚠️  metadata موجود نبود")
    print("💡 پیشنهاد: از ترتیب الفبایی استفاده کنید")
    print("📁 فایل: alphabetical_order.txt")
    print("🎯 YOLO معمولاً پوشه‌ها را به ترتیب الفبایی مرتب می‌کند")

print("\n" + "=" * 70)
