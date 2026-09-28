#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
استخراج لیبل‌ها از مدل TFLite با لیست hard-coded شده
"""
import os
import json
import subprocess

MODEL_PATH = "app/src/main/assets/best_float16.tflite"

# ═══════════════════════════════════════════════════════
# لیست ۱۵۱ گونه (از dataset_report.csv استخراج شده)
# ═══════════════════════════════════════════════════════
EXPECTED_SPECIES = [
    # Fabaceae (69 گونه)
    "Astragalus_albispinus", "Astragalus_angustiflorus", "Astragalus_argyrostachys",
    "Astragalus_asterias", "Astragalus_campylanthus", "Astragalus_campylorhynchus",
    "Astragalus_caragana", "Astragalus_cephalanthus", "Astragalus_cyclophyllon",
    "Astragalus_ebenoides", "Astragalus_effesus", "Astragalus_fasciculifolius",
    "Astragalus_fragiferus", "Astragalus_gossypinus", "Astragalus_hamosus",
    "Astragalus_ibicinus", "Astragalus_kirrindicus", "Astragalus_macrocephalus",
    "Astragalus_macroplematus", "Astragalus_microcephalus", "Astragalus_oleifolius",
    "Astragalus_ovinus", "Astragalus_oxyglottis", "Astragalus_podolobus",
    "Astragalus_rhodosemius", "Astragalus_sp", "Astragalus_teheranicus",
    "Astragalus_verus", "Coronilla_varia", "Glycyrrhiza_glabra",
    "Lathyrus_aphaca", "Lathyrus_cassius", "Lathyrus_inconspicuus",
    "Lens_orientalis", "Lotus_corniculatus", "Medicago_coronata",
    "Medicago_lupulina", "Medicago_minima", "Medicago_polymorpha",
    "Medicago_radiata", "Medicago_rigidula", "Medicago_sativa",
    "Medicago_scutellata", "Melilotus_albus", "Melilotus_indicus",
    "Melilotus_officinalis", "Onobrychis_cornuta", "Onobrychis_crista-galli",
    "Onobrychis_melanotricha", "Ononis_reclinata", "Ononis_spinosa",
    "Pisum_sativum", "Scorpiurus_muricatus", "Sophora_alopecuroides",
    "Trifolium_campestre", "Trifolium_pratense", "Trifolium_purpureum",
    "Trifolium_repens", "Trifolium_resupinatum", "Trifolium_tomentosum",
    "Trigonella_caerulescens", "Trigonella_monantha", "Trigonella_Spruneriana",
    "Trigonella_stellata", "Vicia_amphicarpa", "Vicia_narbonensis",
    "Vicia_peregrina", "Vicia_variabilis", "Vicia_villosa",
    
    # Lamiaceae (32 گونه)
    "Acinos_graveolens", "Ajuga_chamaecistus", "Eremostachys_macrophylla",
    "Lallemantia_iberica", "Lallemantia_peltata", "Lamium_album",
    "Lamium_amplexicaule", "Marrubium_astracanicum", "Marrubium_cuneatum",
    "Marrubium_vulgare", "Mentha_longifolia", "Micromeria_myrtifolia",
    "Nepeta_glomerulosa_carmanica", "Phlomis_olivieri", "Phlomis_persica",
    "Salvia_ceratophylla", "Salvia_hydrangea", "Salvia_multicaulis",
    "Salvia_nemorosa", "Salvia_palaestina", "Salvia_sclarea",
    "Salvia_syriaca", "Salvia_virgata", "Stachys_inflata",
    "Stachys_lavandulifolia", "Stachys_spectabilis", "Teucrium_orientale",
    "Teucrium_polium", "Teucrium_scordium", "Ziziphora_capitata",
    "Ziziphora_clinopodioides", "Ziziphora_tenuior",
    
    # Liliaceae (23 گونه)
    "Allium_atroviolaceum", "Allium_hirtifolium", "Allium_longisepalum",
    "Allium_scabriscapum", "Allium_vineale", "Bellevalia_macrobotrys",
    "Colchicum_kotschyi", "Eremurus_inderiensis", "Eremurus_persicus",
    "Eremurus_spectabilis", "Fritillaria_gibbosa", "Fritillaria_imperialis",
    "Fritillaria_persica", "Muscari_inconstrictum", "Muscari_neglectum",
    "Nectaroscordum_tripedale", "Ornithogalum_arcuatum", "Ornithogalum_narbonense",
    "Ornithogalum_orthophyllum", "Ornithogalum_recurvum", "Tulipa_biebersteiniana",
    "Tulipa_biflora", "Tulipa_systola",
    
    # Rosaceae (27 گونه)
    "Agrimonia_eupatoria", "Amygdalus_arabica", "Amygdalus_communis",
    "Amygdalus_lycioides", "Amygdalus_orientalis", "Armeniaca_vulgaris",
    "Cerasus_avium", "Cerasus_mahaleb", "Cerasus_microcarpa",
    "Cerasus_vulgaris", "Crataegus_persica", "Crataegus_pseudoheterophylla",
    "Malus_domestica", "Persica_vulgaris", "Potentilla_reptans",
    "Potentilla_speciosa", "Prunus_domestica", "Pyracantha_coccinea",
    "Pyrus_communis", "Pyrus_elaeagnifolia", "Pyrus_syriaca",
    "Rosa_canina", "Rosa_foetida", "Rosa_orientalis",
    "Sanguisorba_minor", "Sorbus_persica", "Spartium_junceum"
]

print("=" * 70)
print("🏷️  استخراج لیبل‌های مدل TFLite")
print("=" * 70)

# ═══════════════════════════════════════════════════════
# مرحله ۱: بررسی لیست گونه‌ها
# ═══════════════════════════════════════════════════════
print(f"\n📊 تعداد گونه‌های مورد انتظار: {len(EXPECTED_SPECIES)}")
print(f"   توزیع: Fabaceae (69), Lamiaceae (32), Liliaceae (23), Rosaceae (27)")

# ═══════════════════════════════════════════════════════
# مرحله ۲: استخراج رشته‌ها از مدل
# ═══════════════════════════════════════════════════════
print(f"\n🔄 استخراج رشته‌ها از مدل...")
result = subprocess.run(['strings', MODEL_PATH], capture_output=True, text=True)
all_strings = result.stdout.split('\n')
print(f"   ✅ تعداد کل رشته‌ها در مدل: {len(all_strings)}")

# ═══════════════════════════════════════════════════════
# مرحله ۳: جستجوی گونه‌ها در مدل
# ═══════════════════════════════════════════════════════
print(f"\n🔍 جستجوی ۱۵۱ گونه در مدل...")

found_in_order = []
not_found = []

for species in EXPECTED_SPECIES:
    if species in all_strings:
        idx = all_strings.index(species)
        found_in_order.append((idx, species))
    else:
        not_found.append(species)

print(f"\n📊 نتیجه جستجو:")
print(f"   ✅ پیدا شده: {len(found_in_order)}/{len(EXPECTED_SPECIES)}")
print(f"   ❌ پیدا نشده: {len(not_found)}/{len(EXPECTED_SPECIES)}")

if not_found:
    print(f"\n   گونه‌های گمشده:")
    for sp in not_found[:10]:
        print(f"      - {sp}")
    if len(not_found) > 10:
        print(f"      ... و {len(not_found) - 10} مورد دیگر")

# ═══════════════════════════════════════════════════════
# مرحله ۴: مرتب‌سازی بر اساس موقعیت در مدل
# ═══════════════════════════════════════════════════════
found_in_order.sort(key=lambda x: x[0])
model_order = [sp for _, sp in found_in_order]

print(f"\n📋 ترتیب واقعی مدل (۱۰ تای اول):")
for i, sp in enumerate(model_order[:10]):
    print(f"   {i:3d}: {sp}")

print(f"\n📋 ترتیب واقعی مدل (۱۰ تای آخر):")
for i, sp in enumerate(model_order[-10:], len(model_order)-10):
    print(f"   {i:3d}: {sp}")

# ذخیره ترتیب واقعی
with open('model_order.txt', 'w', encoding='utf-8') as f:
    f.write('\n'.join(model_order))
print(f"\n💾 ذخیره شد: model_order.txt")

# ═══════════════════════════════════════════════════════
# مرحله ۵: مقایسه با species_family_map.json
# ═══════════════════════════════════════════════════════
print(f"\n🔄 مقایسه با species_family_map.json...")

try:
    with open('species_family_map.json', 'r', encoding='utf-8') as f:
        species_map = json.load(f)
    json_order = list(species_map.keys())
    
    if len(model_order) == len(json_order):
        matches = sum(1 for a, b in zip(model_order, json_order) if a == b)
        print(f"   تطابق با ترتیب JSON: {matches}/{len(json_order)}")
        
        if matches == len(json_order):
            print(f"\n🎉 عالی! ترتیب مدل دقیقاً با species_family_map.json یکی است!")
            print(f"   ✅ Constants.kt فعلی درست است - هیچ تغییری لازم نیست")
        else:
            print(f"\n⚠️  ترتیب مدل متفاوت است!")
            print(f"   🔄 باید Constants.kt با ترتیب واقعی مدل به‌روز شود")
            
            # تولید Constants.kt جدید
            print(f"\n🔧 تولید Constants.kt جدید...")
            
            lines = []
            lines.append('package com.example.plantdetector.utils')
            lines.append('')
            lines.append('object Constants {')
            lines.append('    // ⚙️ اندازه ورودی مدل')
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
            
            print(f"   ✅ Constants.kt به‌روز شد")
            
    else:
        print(f"   ⚠️  تعداد متفاوت: مدل {len(model_order)}, JSON {len(json_order)}")
        
except Exception as e:
    print(f"   ❌ خطا: {e}")

print("\n" + "=" * 70)
print("🎯 خلاصه:")
print("   - ترتیب واقعی مدل در: model_order.txt")
print("   - اگر ترتیب متفاوت بود، Constants.kt به‌روز شده است")
print("=" * 70)
