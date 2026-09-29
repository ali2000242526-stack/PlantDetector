import os, re
import numpy as np
from PIL import Image
import tensorflow as tf

MODEL_PATH = "app/src/main/assets/best_float16.tflite"
CONSTANTS  = "app/src/main/java/com/example/plantdetector/utils/Constants.kt"

# خواندن لیست کلاس‌ها مستقیم از Constants.kt (همیشه هماهنگ با اپ)
names = re.findall(r'"([A-Za-z_\-]+)"', open(CONSTANTS, encoding="utf-8").read())
print(f"📚 تعداد کلاس‌ها از Constants.kt: {len(names)}")

interp = tf.lite.Interpreter(model_path=MODEL_PATH)
interp.allocate_tensors()
in_d  = interp.get_input_details()[0]
out_d = interp.get_output_details()[0]
SIZE  = int(in_d['shape'][1])

def predict(arr):
    interp.set_tensor(in_d['index'], arr.astype(np.float32))
    interp.invoke()
    o = interp.get_tensor(out_d['index'])[0]
    i = int(np.argmax(o))
    return i, float(o[i])

def variants(img):
    r = lambda im: np.asarray(im.resize((SIZE, SIZE), Image.BILINEAR), np.float32) / 255.0
    base = r(img)
    return {
        "A_resize_RGB (حالت درست پایتون)": base,
        "B_charkhesh_90":  r(img.transpose(Image.ROTATE_90)),
        "C_charkhesh_180": r(img.transpose(Image.ROTATE_180)),
        "D_charkhesh_270": r(img.transpose(Image.ROTATE_270)),
        "E_BGR_jabejayi_kanal": base[..., ::-1].copy(),
        "F_ayenei_flip":   np.asarray(Image.fromarray((base*255).astype(np.uint8)).transpose(Image.FLIP_LEFT_RIGHT), np.float32)/255.0,
        "G_bedune_normalization": base * 255.0,
    }

print("\n🔬 شروع کالبدشکافی... دنبال حالتی بگردید که ایندکس 12 (برای ebenoides) و 109 (برای caragana) می‌سازد\n")

for folder in sorted(os.listdir("test_images")):
    d = os.path.join("test_images", folder)
    if not os.path.isdir(d): continue
    true_idx = names.index(folder) if folder in names else -1
    for f in [x for x in os.listdir(d) if x.lower().endswith((".jpg",".jpeg",".png"))][:2]:
        img = Image.open(os.path.join(d, f)).convert("RGB")
        print(f"📷 {folder}/{f}   (ایندکس واقعی: {true_idx})")
        for vname, arr in variants(img).items():
            i, c = predict(arr[None, ...])
            mark = "✅" if i == true_idx else ("📱←" if folder=="Astragalus_ebenoides" and i==12 or folder=="Astragalus_caragana" and i==109 else "   ")
            print(f"   {mark} {vname:32s} → idx {i:3d}  {names[i]:30s} conf {c:.3f}")
        print()
