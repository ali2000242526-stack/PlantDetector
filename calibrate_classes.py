#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
🔬 اسکریپت کالیبراسیون ترتیب کلاس‌ها در مدل TFLite
هدف: پیدا کردن ترتیب واقعی کلاس‌ها در مدل
"""
import os
import sys
import json
import subprocess
import numpy as np
from pathlib import Path

MODEL_PATH = "app/src/main/assets/best_float16.tflite"
TEST_IMAGES_DIR = "test_images"  # پوشه تصاویر تست

# ═══════════════════════════════════════════════════════
# لیست ۱۵۱ گونه (ترتیب الفبایی - از best.pt)
# ═══════════════════════════════════════════════════════
ALPHABETICAL_ORDER = [
    "Acinos_graveolens", "Agrimonia_eupatoria", "Ajuga_chamaecistus",
    "Allium_atroviolaceum", "Allium_hirtifolium", "Allium_longisepalum",
    "Allium_scabriscapum", "Allium_vineale", "Amygdalus_arabica",
    "Amygdalus_communis", "Amygdalus_lycioides", "Amygdalus_orientalis",
    "Armeniaca_vulgaris", "Astragalus_albispinus", "Astragalus_angustiflorus",
    "Astragalus_argyrostachys", "Astragalus_asterias", "Astragalus_campylanthus",
    "Astragalus_campylorhynchus", "Astragalus_caragana", "Astragalus_cephalanthus",
    "Astragalus_cyclophyllon", "Astragalus_ebenoides", "Astragalus_effesus",
    "Astragalus_fasciculifolius", "Astragalus_fragiferus", "Astragalus_gossypinus",
    "Astragalus_hamosus", "Astragalus_ibicinus", "Astragalus_kirrindicus",
    "Astragalus_macrocephalus", "Astragalus_macroplematus", "Astragalus_microcephalus",
    "Astragalus_oleifolius", "Astragalus_ovinus", "Astragalus_oxyglottis",
    "Astragalus_podolobus", "Astragalus_rhodosemius", "Astragalus_sp",
    "Astragalus_teheranicus", "Astragalus_verus", "Bellevalia_macrobotrys",
    "Cerasus_avium", "Cerasus_mahaleb", "Cerasus_microcarpa", "Cerasus_vulgaris",
    "Colchicum_kotschyi", "Coronilla_varia", "Crataegus_persica",
    "Crataegus_pseudoheterophylla", "Eremostachys_macrophylla",
    "Eremurus_inderiensis", "Eremurus_persicus", "Eremurus_spectabilis",
    "Fritillaria_gibbosa", "Fritillaria_imperialis", "Fritillaria_persica",
    "Glycyrrhiza_glabra", "Lallemantia_iberica", "Lallemantia_peltata",
    "Lamium_album", "Lamium_amplexicaule", "Lathyrus_aphaca", "Lathyrus_cassius",
    "Lathyrus_inconspicuus", "Lens_orientalis", "Lotus_corniculatus",
    "Malus_domestica", "Marrubium_astracanicum", "Marrubium_cuneatum",
    "Marrubium_vulgare", "Medicago_coronata", "Medicago_lupulina",
    "Medicago_minima", "Medicago_polymorpha", "Medicago_radiata",
    "Medicago_rigidula", "Medicago_sativa", "Medicago_scutellata",
    "Melilotus_albus", "Melilotus_indicus", "Melilotus_officinalis",
    "Mentha_longifolia", "Micromeria_myrtifolia", "Muscari_inconstrictum",
    "Muscari_neglectum", "Nectaroscordum_tripedale", "Nepeta_glomerulosa_carmanica",
    "Onobrychis_cornuta", "Onobrychis_crista-galli", "Onobrychis_melanotricha",
    "Ononis_reclinata", "Ononis_spinosa", "Ornithogalum_arcuatum",
    "Ornithogalum_narbonense", "Ornithogalum_orthophyllum", "Ornithogalum_recurvum",
    "Persica_vulgaris", "Phlomis_olivieri", "Phlomis_persica", "Pisum_sativum",
    "Potentilla_reptans", "Potentilla_speciosa", "Prunus_domestica",
    "Pyracantha_coccinea", "Pyrus_communis", "Pyrus_elaeagnifolia",
    "Pyrus_syriaca", "Rosa_canina", "Rosa_foetida", "Rosa_orientalis",
    "Salvia_ceratophylla", "Salvia_hydrangea", "Salvia_multicaulis",
    "Salvia_nemorosa", "Salvia_palaestina", "Salvia_sclarea", "Salvia_syriaca",
    "Salvia_virgata", "Sanguisorba_minor", "Scorpiurus_muricatus",
    "Sophora_alopecuroides", "Sorbus_persica", "Spartium_junceum",
    "Stachys_inflata", "Stachys_lavandulifolia", "Stachys_spectabilis",
    "Teucrium_orientale", "Teucrium_polium", "Teucrium_scordium",
    "Trifolium_campestre", "Trifolium_pratense", "Trifolium_purpureum",
    "Trifolium_repens", "Trifolium_resupinatum", "Trifolium_tomentosum",
    "Trigonella_Spruneriana", "Trigonella_caerulescens", "Trigonella_monantha",
    "Trigonella_stellata", "Tulipa_biebersteiniana", "Tulipa_biflora",
    "Tulipa_systola", "Vicia_amphicarpa", "Vicia_narbonensis", "Vicia_peregrina",
    "Vicia_variabilis", "Vicia_villosa", "Ziziphora_capitata",
    "Ziziphora_clinopodioides", "Ziziphora_tenuior"
]

print("=" * 70)
print("🔬 اسکریپت کالیبراسیون ترتیب کلاس‌ها")
print("=" * 70)

# ═══════════════════════════════════════════════════════
# بخش ۱: بررسی وجود مدل
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۱: بررسی مدل...")

if not os.path.exists(MODEL_PATH):
    print(f"   ❌ فایل مدل پیدا نشد: {MODEL_PATH}")
    sys.exit(1)

file_size_mb = os.path.getsize(MODEL_PATH) / (1024 * 1024)
print(f"   ✅ مدل پیدا شد: {MODEL_PATH}")
print(f"   📊 حجم: {file_size_mb:.2f} MB")

# ═══════════════════════════════════════════════════════
# بخش ۲: بارگذاری مدل و بررسی ساختار
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۲: بارگذاری مدل...")

try:
    import tensorflow as tf
    
    interpreter = tf.lite.Interpreter(model_path=MODEL_PATH)
    interpreter.allocate_tensors()
    
    input_details = interpreter.get_input_details()
    output_details = interpreter.get_output_details()
    
    print(f"\n   📥 ورودی:")
    for detail in input_details:
        print(f"      Shape: {detail['shape']}")
        print(f"      Type: {detail['dtype']}")
        print(f"      Name: {detail['name']}")
    
    print(f"\n   📤 خروجی:")
    for detail in output_details:
        print(f"      Shape: {detail['shape']}")
        print(f"      Type: {detail['dtype']}")
        print(f"      Name: {detail['name']}")
    
    input_shape = input_details[0]['shape']
    output_shape = output_details[0]['shape']
    input_size = input_shape[1]
    num_classes = output_shape[1] if len(output_shape) == 2 else output_shape[0]
    
    print(f"\n   🎯 INPUT_SIZE = {input_size}")
    print(f"   🎯 NUM_CLASSES = {num_classes}")
    
except Exception as e:
    print(f"   ❌ خطا در بارگذاری مدل: {e}")
    sys.exit(1)

# ═══════════════════════════════════════════════════════
# بخش ۳: بررسی لیست تمام tensor ها
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۳: بررسی tensor ها...")

tensor_details = interpreter.get_tensor_details()
print(f"   📊 تعداد کل tensor ها: {len(tensor_details)}")

# جستجوی tensor هایی که ممکن است لیبل داشته باشند
label_candidates = []
for tensor in tensor_details:
    name = tensor['name'].lower()
    if any(keyword in name for keyword in ['label', 'class', 'name', 'category']):
        label_candidates.append(tensor)
        print(f"   🏷️  کاندیدای لیبل: {tensor['name']} shape={tensor['shape']}")

if not label_candidates:
    print(f"   ⚠️  tensor لیبل پیدا نشد")

# ═══════════════════════════════════════════════════════
# بخش ۴: تلاش برای استخراج metadata
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۴: بررسی metadata...")

labels_from_metadata = None
try:
    from tflite_support.metadata import MetadataDisplayer
    
    with open(MODEL_PATH, 'rb') as f:
        model_buffer = f.read()
    
    displayer = MetadataDisplayer.from_model_buffer(model_buffer)
    assoc_files = displayer.get_associated_files()
    print(f"   📁 فایل‌های مرتبط: {assoc_files}")
    
    label_files = [f for f in assoc_files if 'label' in f.lower()]
    if label_files:
        label_buffer = displayer.get_associated_file_buffer(label_files[0])
        labels_from_metadata = label_buffer.decode('utf-8').strip().split('\n')
        print(f"   ✅ لیبل‌ها از metadata استخراج شد: {len(labels_from_metadata)}")
except ImportError:
    print(f"   ⚠️  tflite_support نصب نیست")
except Exception as e:
    print(f"   ⚠️  metadata در دسترس نیست: {e}")

# ═══════════════════════════════════════════════════════
# بخش ۵: جستجوی strings در مدل
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۵: جستجوی strings در مدل...")

try:
    result = subprocess.run(['strings', MODEL_PATH], capture_output=True, text=True)
    all_strings = result.stdout.split('\n')
    
    found_species = []
    for species in ALPHABETICAL_ORDER:
        if species in all_strings:
            found_species.append(species)
    
    print(f"   🔍 تعداد گونه‌های پیدا شده در strings: {len(found_species)}/{len(ALPHABETICAL_ORDER)}")
    
    if len(found_species) > 0:
        print(f"   ⚠️  توجه: strings ترتیب را نشان نمی‌دهد، فقط وجود را تأیید می‌کند")
except Exception as e:
    print(f"   ❌ خطا: {e}")

# ═══════════════════════════════════════════════════════
# بخش ۶: کالیبراسیون با تصاویر تست
# ═══════════════════════════════════════════════════════
print("\n📖 بخش ۶: کالیبراسیون با تصاویر تست...")

# بررسی وجود پوشه تصاویر تست
if not os.path.exists(TEST_IMAGES_DIR):
    os.makedirs(TEST_IMAGES_DIR)
    print(f"\n   📁 پوشه '{TEST_IMAGES_DIR}' ساخته شد")
    print(f"\n   ╔══════════════════════════════════════════════════════╗")
    print(f"   ║  ⚠️  برای کالیبراسیون، تصاویر تست لازم است!        ║")
    print(f"   ║                                                      ║")
    print(f"   ║  لطفاً تصاویر را در پوشه test_images/ قرار دهید:    ║")
    print(f"   ║                                                      ║")
    print(f"   ║  ساختار مورد نیاز:                                  ║")
    print(f"   ║  test_images/                                        ║")
    print(f"   ║  ├── Astragalus_ebenoides/                           ║")
    print(f"   ║  │   ├── img1.jpg                                    ║")
    print(f"   ║  │   └── img2.jpg                                    ║")
    print(f"   ║  ├── Medicago_radiata/                               ║")
    print(f"   ║  │   ├── img1.jpg                                    ║")
    print(f"   ║  │   └── img2.jpg                                    ║")
    print(f"   ║  └── ... (هرچه بیشتر، بهتر)                         ║")
    print(f"   ║                                                      ║")
    print(f"   ║  💡 حداقل ۱۰ گونه مختلف با ۳-۵ تصویر هر کدام       ║")
    print(f"   ║  💡 نام پوشه = نام دقیق گونه (Genus_species)        ║")
    print(f"   ║                                                      ║")
    print(f"   ║  سپس دوباره اسکریپت را اجرا کنید:                  ║")
    print(f"   ║  python3 calibrate_classes.py                        ║")
    print(f"   ╚══════════════════════════════════════════════════════╝")

# بررسی تصاویر موجود
test_folders = [d for d in os.listdir(TEST_IMAGES_DIR) 
                if os.path.isdir(os.path.join(TEST_IMAGES_DIR, d))]

if len(test_folders) == 0:
    print(f"\n   ⚠️  هیچ تصویر تستی پیدا نشد")
    print(f"   💡 بدون تصویر تست، کالیبراسیون ممکن نیست")
    print(f"\n   🔧 اما می‌توانیم با اطلاعات موجود تحلیل کنیم...")
    
    # ═══════════════════════════════════════════════════════
    # بخش ۶-الف: تحلیل بدون تصویر تست
    # ═══════════════════════════════════════════════════════
    print(f"\n📖 بخش ۶-الف: تحلیل با ورودی تصادفی...")
    
    # اجرای مدل با ورودی تصادفی برای بررسی ساختار خروجی
    np.random.seed(42)
    random_input = np.random.rand(1, input_size, input_size, 3).astype(np.float32)
    
    interpreter.set_tensor(input_details[0]['index'], random_input)
    interpreter.invoke()
    
    output_data = interpreter.get_tensor(output_details[0]['index'])[0]
    
    print(f"\n   📊 خروجی با ورودی تصادفی:")
    print(f"      Shape: {output_data.shape}")
    print(f"      جمع: {output_data.sum():.4f}")
    print(f"      بیشترین: {output_data.max():.4f}")
    print(f"      کمترین: {output_data.min():.4f}")
    print(f"      میانگین: {output_data.mean():.4f}")
    print(f"      انحراف معیار: {output_data.std():.4f}")
    
    is_prob = (abs(output_data.sum()) - 1.0) < 0.1
    print(f"\n   آیا خروجی احتمال است؟ {'بله ✅' if is_prob else 'خیر (logits) ❌'}")
    
    # ═══════════════════════════════════════════════════════
    # بخش ۶-ب: تحلیل دو نمونه کاربر
    # ═══════════════════════════════════════════════════════
    print(f"\n📖 بخش ۶-ب: تحلیل بر اساس گزارش کاربر...")
    
    print(f"""
   📋 اطلاعات موجود از تست کاربر:
   
   ┌─────────────────────────┬──────────────────────┬─────────────────────┐
   │ تصویر واقعی             │ اپلیکیشن می‌گوید     │ Index در Constants  │
   ├─────────────────────────┼──────────────────────┼─────────────────────┤
   │ Astragalus_ebenoides    │ Medicago_coronata    │ واقعی:22 → نمایش:71 │
   │ Medicago_radiata        │ Salvia_syriaca       │ واقعی:75 → نمایش:117│
   └─────────────────────────┴──────────────────────┴─────────────────────┘
   
   🔍 تحلیل:
   - Astragalus_ebenoides: index الفبایی = 22
   - Medicago_coronata: index الفبایی = 71
   - Medicago_radiata: index الفبایی = 75
   - Salvia_syriaca: index الفبایی = 117
   
   ⚠️  اگر مدل واقعاً index 22 را تشخیص می‌دهد ولی ما 71 را نشان می‌دهیم:
       → ترتیب Constants.kt اشتباه است
   
   ⚠️  اگر مدل واقعاً index 71 را تشخیص می‌دهد:
       → مدل اشتباه تشخیص می‌دهد (مشکل پیش‌پردازش)
    """)
    
    print(f"\n   ╔══════════════════════════════════════════════════════╗")
    print(f"   ║  🎯 برای تشخیص دقیق، به تصاویر تست نیاز داریم!    ║")
    print(f"   ║                                                      ║")
    print(f"   ║  لطفاً چند تصویر از گونه‌های مختلف آپلود کنید     ║")
    print(f"   ║  و اسکریپت را دوباره اجرا کنید.                    ║")
    print(f"   ║                                                      ║")
    print(f"   ║  💡 می‌توانید از Kaggle هم استفاده کنید:            ║")
    print(f"   ║  ۱. نوتبوک Kaggle بسازید                           ║")
    print(f"   ║  ۲. دیتاست تست را بارگذاری کنید                    ║")
    print(f"   ║  ۳. مدل TFLite را آپلود کنید                       ║")
    print(f"   ║  ۴. اسکریپت کالیبراسیون را اجرا کنید              ║")
    print(f"   ╚══════════════════════════════════════════════════════╝")

else:
    # ═══════════════════════════════════════════════════════
    # بخش ۶-ج: کالیبراسیون واقعی با تصاویر
    # ═══════════════════════════════════════════════════════
    print(f"\n   ✅ {len(test_folders)} پوشه تصویر تست پیدا شد!")
    
    try:
        from PIL import Image
    except ImportError:
        os.system("pip install Pillow -q")
        from PIL import Image
    
    def preprocess_image(image_path, input_size):
        """پیش‌پردازش تصویر مانند مدل"""
        img = Image.open(image_path).convert('RGB')
        img = img.resize((input_size, input_size), Image.BILINEAR)
        img_array = np.array(img, dtype=np.float32) / 255.0
        img_array = np.expand_dims(img_array, axis=0)
        return img_array
    
    def run_inference(interpreter, input_details, output_details, image_path, input_size):
        """اجرای استنتاج روی یک تصویر"""
        input_data = preprocess_image(image_path, input_size)
        interpreter.set_tensor(input_details[0]['index'], input_data)
        interpreter.invoke()
        output_data = interpreter.get_tensor(output_details[0]['index'])[0]
        
        # بررسی اینکه آیا خروجی احتمال است یا logits
        output_sum = output_data.sum()
        if abs(output_sum - 1.0) > 0.1:
            # logits است، softmax بزن
            exp_vals = np.exp(output_data - output_data.max())
            output_data = exp_vals / exp_vals.sum()
        
        return output_data
    
    # کالیبراسیون
    print(f"\n📖 شروع کالیبراسیون...")
    
    calibration_results = {}
    
    for folder_name in sorted(test_folders):
        folder_path = os.path.join(TEST_IMAGES_DIR, folder_name)
        images = [f for f in os.listdir(folder_path) 
                  if f.lower().endswith(('.jpg', '.jpeg', '.png', '.bmp'))]
        
        if len(images) == 0:
            print(f"   ⚠️  {folder_name}: تصویری پیدا نشد")
            continue
        
        print(f"\n   🔬 بررسی {folder_name} ({len(images)} تصویر)...")
        
        predicted_indices = []
        predicted_confidences = []
        
        for img_name in images[:5]:  # حداکثر ۵ تصویر
            img_path = os.path.join(folder_path, img_name)
            try:
                output = run_inference(interpreter, input_details, output_details, img_path, input_size)
                top_idx = np.argmax(output)
                top_conf = output[top_idx]
                predicted_indices.append(top_idx)
                predicted_confidences.append(top_conf)
                
                # ۵ نتیجه برتر
                top5_indices = np.argsort(output)[::-1][:5]
                print(f"      📷 {img_name}:")
                print(f"         پیش‌بینی: index={top_idx} conf={top_conf:.4f}")
                print(f"         نام الفبایی: {ALPHABETICAL_ORDER[top_idx]}")
                print(f"         ۵ برتر: {[(ALPHABETICAL_ORDER[i], f'{output[i]:.4f}') for i in top5_indices]}")
                
            except Exception as e:
                print(f"      ❌ خطا در {img_name}: {e}")
        
        if predicted_indices:
            # پیدا کردن رایج‌ترین index
            from collections import Counter
            most_common_idx = Counter(predicted_indices).most_common(1)[0][0]
            avg_conf = np.mean([c for i, c in zip(predicted_indices, predicted_confidences) if i == most_common_idx])
            
            calibration_results[folder_name] = {
                'predicted_index': int(most_common_idx),
                'confidence': float(avg_conf),
                'alphabetical_name': ALPHABETICAL_ORDER[most_common_idx],
                'all_predictions': predicted_indices
            }
            
            print(f"\n   📊 نتیجه {folder_name}:")
            print(f"      Index واقعی در مدل: {most_common_idx}")
            print(f"      نام الفبایی: {ALPHABETICAL_ORDER[most_common_idx]}")
            print(f"      اطمینان میانگین: {avg_conf:.4f}")
            print(f"      همه پیش‌بینی‌ها: {predicted_indices}")
            
            if folder_name != ALPHABETICAL_ORDER[most_common_idx]:
                print(f"      ⚠️  عدم تطابق! انتظار: {folder_name} | دریافت: {ALPHABETICAL_ORDER[most_common_idx]}")
            else:
                print(f"      ✅ تطابق!")
    
    # ═══════════════════════════════════════════════════════
    # بخش ۷: تحلیل نتایج کالیبراسیون
    # ═══════════════════════════════════════════════════════
    print(f"\n{'=' * 70}")
    print(f"📊 بخش ۷: تحلیل نتایج کالیبراسیون")
    print(f"{'=' * 70}")
    
    if len(calibration_results) == 0:
        print(f"   ❌ هیچ نتیجه‌ای برای تحلیل نیست")
    else:
        print(f"\n   تعداد گونه‌های کالیبره شده: {len(calibration_results)}")
        
        # بررسی الگو
        print(f"\n   📋 جدول کالیبراسیون:")
        print(f"   {'گونه واقعی':<35} {'Index مدل':>10} {'نام الفبایی':<35} {'تطابق':>6}")
        print(f"   {'-'*35} {'-'*10} {'-'*35} {'-'*6}")
        
        matches = 0
        mismatches = 0
        
        for species, result in sorted(calibration_results.items()):
            alpha_name = result['alphabetical_name']
            match = "✅" if species == alpha_name else "❌"
            if species == alpha_name:
                matches += 1
            else:
                mismatches += 1
            print(f"   {species:<35} {result['predicted_index']:>10} {alpha_name:<35} {match:>6}")
        
        print(f"\n   📊 آمار:")
        print(f"      ✅ تطابق: {matches}/{len(calibration_results)}")
        print(f"      ❌ عدم تطابق: {mismatches}/{len(calibration_results)}")
        
        if mismatches > 0:
            print(f"\n   ⚠️  ترتیب کلاس‌ها در Constants.kt اشتباه است!")
            print(f"   🔧 باید ترتیب را اصلاح کنیم")
        else:
            print(f"\n   ✅ ترتیب کلاس‌ها درست است!")
            print(f"   💡 مشکل احتمالاً از پیش‌پردازش تصویر است")
        
        # ذخیره نتایج
        with open('calibration_results.json', 'w', encoding='utf-8') as f:
            json.dump(calibration_results, f, ensure_ascii=False, indent=2)
        print(f"\n   💾 نتایج ذخیره شد: calibration_results.json")

# ═══════════════════════════════════════════════════════
# بخش ۸: خلاصه و توصیه
# ═══════════════════════════════════════════════════════
print(f"\n{'=' * 70}")
print(f"📋 خلاصه")
print(f"{'=' * 70}")

print(f"""
   📊 اطلاعات مدل:
      INPUT_SIZE: {input_size}
      NUM_CLASSES: {num_classes}
      حجم: {file_size_mb:.2f} MB
   
   🔍 روش‌های بررسی شده:
      {'✅' if labels_from_metadata else '❌'} Metadata
      {'✅' if len(found_species) > 0 else '❌'} Strings ({len(found_species)} گونه)
      {'✅' if len(test_folders) > 0 else '❌'} کالیبراسیون با تصاویر ({len(test_folders)} گونه)
""")

print("=" * 70)
