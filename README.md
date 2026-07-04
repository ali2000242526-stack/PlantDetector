# 🐛 Insect Detector

<p align="center">
  <strong>پایش و تشخیص هوشمند حشرات و آفات با الگوریتم YOLOv26_n</strong>
</p>

<p align="center">
  <a href="#"><img src="https://img.shields.io/badge/Android-7.0+-3DDC84?logo=android&logoColor=white" alt="Android"></a>
  <a href="#"><img src="https://img.shields.io/badge/YOLO-v26_n-FF6B6B?logo=python&logoColor=white" alt="YOLOv26_n"></a>
  <a href="#"><img src="https://img.shields.io/badge/Species-69-4CAF50?logo=biolite&logoColor=white" alt="69 Species"></a>
  <a href="#"><img src="https://img.shields.io/badge/GPS-Enabled-2196F3?logo=googlemaps&logoColor=white" alt="GPS"></a>
  <a href="#"><img src="https://img.shields.io/badge/Language-Persian-FF9800?logo=translate&logoColor=white" alt="Persian"></a>
  <a href="#"><img src="https://img.shields.io/badge/Cloud-Supabase+HuggingFace-1B5E20?logo=supabase&logoColor=white" alt="Cloud"></a>
</p>

<p align="center">
  اپلیکیشن اندروید تشخیص ۶۹ گونه حشره با استفاده از مدل <strong>YOLOv26_n</strong> و <strong>TensorFlow Lite</strong><br>
  طراحی شده برای پژوهشگران، جنگل‌بانان و متخصصان کشاورزی
</p>

<p align="center">
  ✅ تشخیص آفلاین • ✅ همگام‌سازی ابری • ✅ داشبورد تحلیلی تحت وب
</p>

---

## 📑 فهرست مطالب

- [🎯 معرفی اپلیکیشن](#-معرفی-اپلیکیشن)
- [🎯 اهداف پروژه](#-اهداف-پروژه)
- [🌟 ویژگی‌های کلیدی](#-ویژگیهای-کلیدی)
- [⚠️ تذکرات مهم](#️-تذکرات-مهم)
- [📂 محل ذخیره‌سازی داده‌ها](#-محل-ذخیرهسازی-دادهها)
- [📥 نصب و راه‌اندازی](#-نصب-و-راهاندازی)
- [📖 راهنمای استفاده](#-راهنمای-استفاده)
- [🎯 گونه‌های قابل تشخیص](#-گونههای-قابل-تشخیص-۶۹-گونه)
- [🧬 دسته‌بندی علمی](#-دسته‌بندی-علمی)
- [⚠️ حشرات خطرناک](#️-حشرات-خطرناک)
- [🛠️ تکنولوژی‌های استفاده‌شده](#️-تکنولوژیهای-استفادهشده)
- [☁️ معماری سرور و داشبورد](#️-معماری-سرور-و-داشبورد)
- [📁 ساختار پروژه](#-ساختار-پروژه)
- [🔮 برنامه‌های آینده](#-برنامههای-آینده)
- [📤 انتقال داده‌ها](#-انتقال-دادهها-به-کامپیوتر)
- [🤝 مشارکت](#-مشارکت)
- [📄 لایسنس](#-لایسنس)
- [📞 پشتیبانی](#-پشتیبانی-و-تماس)
- [👨‍🔬 توسعه‌دهنده](#-توسعه‌دهنده)

---

## 🎯 معرفی اپلیکیشن

اپلیکیشن **Insect Detector** یک ابزار تخصصی برای پایش و شناسایی حشرات و آفات است که با هدف حمایت از پژوهشگران حوزه‌های کشاورزی، جنگل و مرتع طراحی و توسعه یافته است.

> ✅ **وضعیت فعلی پروژه:**
> - تشخیص آفلاین ۶۹ گونه حشره با YOLOv26_n روی موبایل
> - همگام‌سازی خودکار داده‌ها با سرور ابری (Hugging Face + Supabase)
> - داشبورد تحلیلی تحت وب با نمودارها، نقشه و هشدارهای هوشمند
> - API کامل برای یکپارچه‌سازی با سامانه‌های خارجی

این اپلیکیشن با بهره‌گیری از الگوریتم‌های پیشرفته هوش مصنوعی و فناوری TensorFlow Lite، امکان شناسایی سریع و دقیق گونه‌های حشره را به‌صورت کاملاً آفلاین روی گوشی موبایل فراهم می‌کند. داده‌های جمع‌آوری‌شده به‌صورت خودکار با سرور ابری همگام‌سازی شده و در داشبورد مدیریتی قابل تحلیل و مشاهده هستند.

---

## 🎯 اهداف پروژه

- 🌿 تسریع فرآیند پایش آفات در عرصه‌های طبیعی
- 📊 جمع‌آوری داده‌های مکانی‌دار از پراکندگی حشرات
- 🔬 ارائه ابزار دقیق برای پژوهش‌های علمی و اکولوژیک
- 📱 امکان استفاده در مناطق دورافتاده بدون اینترنت (آفلاین)
- ☁️ همگام‌سازی خودکار با سرور ابری برای تحلیل‌های کلان
- 🗂️ مستندسازی خودکار نمونه‌های جمع‌آوری‌شده با کلید یکتا
- 🗺️ ترسیم نقشه پراکندگی حشرات بر اساس مختصات GPS
- 🔔 ارائه هشدارهای هوشمند برای طغیان آفات

---

## 🌟 ویژگی‌های کلیدی

| دسته | قابلیت‌ها |
|------|-----------|
| 🎯 **تشخیص** | ✅ تشخیص ۶۹ گونه حشره با دقت بالا<br>✅ نمایش درصد اطمینان تشخیص<br>✅ فیلتر هوشمند تشخیص‌های بالای ۵۰٪<br>✅ اطلاعات کامل هر حشره (نام علمی، فارسی، خانواده) |
| 📱 **کاربری** | 📷 عکس‌برداری با دوربین گوشی<br>🖼️ انتخاب تصویر از گالری<br>🌐 رابط کاربری کاملاً فارسی و RTL<br>📴 اجرای آفلاین (بدون نیاز به اینترنت) |
| 📍 **مکانی** | 📍 ثبت خودکار مختصات GPS<br>🗺️ لینک مستقیم به Google Maps<br>📊 نمایش موقعیت روی نقشه در داشبورد<br>🎯 ذخیره نقاط نمونه‌برداری با کلید یکتا |
| ☁️ **ابری** | 🔄 همگام‌سازی خودکار با Supabase<br>📤 آپلود تصاویر به Storage ابری<br>📊 داشبورد تحلیلی تحت وب<br>🔔 سیستم هشدار هوشمند طغیان آفات |

---

## ⚠️ تذکرات مهم

> [!IMPORTANT]
> ### 📸 نکات طلایی عکس‌برداری
> - **کیفیت بالا:** از حشرات با کیفیت عکس بالا تصویربرداری نمایید
> - **زوایای متعدد:** از هر حشره چندین عکس از زوایای مختلف تهیه کنید
> - **نور مناسب:** در نور کافی عکس بگیرید تا جزئیات بهتر مشخص شود
> - **فاصله مناسب:** حشره را در مرکز کادر و با فاصله مناسب قرار دهید

> [!NOTE]
> ### 📍 فعال‌سازی GPS
> در هنگام فعالیت در طبیعت، GPS موبایل را فعال نگه دارید تا نقاط نمونه‌برداری به‌صورت خودکار ثبت گردد. این اطلاعات برای تحلیل‌های پراکندگی حشرات بسیار ارزشمند است.

> [!TIP]
> ### 🎯 فیلتر هوشمند
> اپلیکیشن فقط تشخیص‌های با احتمال بالای ۵۰٪ را ثبت می‌کند؛ توصیه می‌شود چندین عکس با کیفیت تهیه شود تا بهترین نتیجه حاصل گردد.

> [!WARNING]
> ### 🗑️ مدیریت حافظه
> آدرس ذخیره عکس‌ها در بخش [محل ذخیره‌سازی](#-محل-ذخیرهسازی-دادهها) آمده است. پس از همگام‌سازی موفق با سرور، می‌توانید فایل‌های پوشه cache را حذف نمایید تا فضای موبایل آزاد شود.

---

## 📂 محل ذخیره‌سازی داده‌ها

### 📍 مسیر اصلی در موبایل
```
/sdcard/Android/data/com.example.insectdetector/files/InsectRecords/
```

### 🗂️ ساختار پوشه‌ها
```
InsectRecords/
│
├── 📊 records.csv                       ← فایل اصلی اطلاعات
│
├── 📁 Danaus_plexippus/                 ← پوشه اختصاصی هر گونه
│   ├── Danaus_plexippus_INS_20260626_123456_7890.jpg
│   └── Danaus_plexippus_INS_20260626_145623_1234.jpg
│
├── 📁 Vespa_crabro/
│   └── Vespa_crabro_INS_20260626_150000_5678.jpg
│
└── 📁 Nezara_viridula/
    └── ...
```

### 📊 فرمت فایل CSV
```csv
ID,ClassName,Confidence,Latitude,Longitude,DateTime,UserName,ImagePath,Uploaded
INS_20260626_123456_7890,"Danaus plexippus",85.50,32.325674,51.654321,"2026-06-26 12:34:56","تورج مختارپور","/path/to/image.jpg",true
```

### 🔑 ساختار کلید اصلی
```
INS_YYYYMMDD_HHMMSS_XXXX
مثال: INS_20260626_123456_7890
```
این کلید برای ارتباط بین فایل CSV، تصویر ذخیره‌شده و رکورد ابری استفاده می‌شود.

---

## 📥 نصب و راه‌اندازی

### روش ۱: دانلود APK (ساده‌ترین)
1. به بخش [Releases](../../releases) مراجعه کنید
2. آخرین نسخه APK را دانلود کنید
3. فایل را روی موبایل نصب کنید
4. مجوزهای لازم (دوربین، GPS، ذخیره‌سازی) را اعطا کنید

### روش ۲: ساخت از سورس کد
```bash
# کلون کردن مخزن
git clone https://github.com/tourajmokhtarpour/App_Insects.git
cd App_Insects

# ساخت APK
./gradlew assembleDebug

# مسیر فایل خروجی
# app/build/outputs/apk/debug/app-debug.apk
```

### روش ۳: نصب با ADB
```bash
# اتصال موبایل و نصب
adb install app/build/outputs/apk/debug/app-debug.apk

# اعطای مجوزها
adb shell pm grant com.example.insectdetector android.permission.CAMERA
adb shell pm grant com.example.insectdetector android.permission.ACCESS_FINE_LOCATION
adb shell pm grant com.example.insectdetector android.permission.ACCESS_COARSE_LOCATION
```

### 📋 پیش‌نیازها
- اندروید 7.0 (API 24) یا بالاتر
- حداقل 200MB فضای خالی
- دسترسی به دوربین و GPS
- اتصال اینترنت برای همگام‌سازی اولیه (اختیاری برای استفاده آفلاین)

---

## 📖 راهنمای استفاده

### 🚀 شروع کار
1. اپلیکیشن را باز کنید
2. در اولین اجرا، نام خود را وارد کنید
3. مجوزهای لازم را اعطا کنید
4. برای همگام‌سازی ابری، اتصال اینترنت را فعال نمایید

### 📷 عکس‌برداری از حشره
1. روی دکمه "📷 باز کردن دوربین" کلیک کنید
2. GPS به‌صورت خودکار فعال می‌شود
3. حشره را در مرکز کادر قرار دهید
4. دکمه عکس را بزنید
5. نتیجه تشخیص همراه با درصد اطمینان نمایش داده می‌شود
6. داده‌ها به‌صورت خودکار ذخیره و در صورت اتصال، به سرور ارسال می‌شوند

### 🖼️ انتخاب از گالری
1. روی دکمه "🖼️ انتخاب از گالری" کلیک کنید
2. تصویر مورد نظر را انتخاب کنید
3. نتیجه تشخیص نمایش داده می‌شود

### 📊 مشاهده نتایج
- نام فارسی و علمی حشره
- درصد اطمینان تشخیص
- خانواده و زیستگاه
- موقعیت GPS با لینک به Google Maps
- کلید اصلی ثبت (برای ردیابی در CSV و سرور)
- وضعیت همگام‌سازی با سرور (✅/⏳)

### ☁️ مشاهده داده‌ها در داشبورد
1. به آدرس داشبورد مراجعه کنید: `https://touraj732-insect-detector-server.hf.space`
2. نمودارهای روند تشخیص، توزیع گونه‌ها و نقشه پراکندگی را مشاهده کنید
3. هشدارهای هوشمند و شاخص‌های کلیدی عملکرد (KPI) را بررسی نمایید

---

## 🎯 گونه‌های قابل تشخیص (۶۹ گونه)

| # | نام علمی | نام فارسی | وضعیت |
|---|----------|-----------|--------|
| 0 | *Acherontia atropos* | پروانه مرگ | ❌ |
| 1 | *Acherontia atropos* (Larve) | لارو پروانه مرگ | ❌ |
| 2 | *Acrosternum millierei* | سن سبز مدیترانه‌ای | ⚠️ آفت |
| 3 | *Agrilus hastulifer* | سوسک شاخدار باریک | ⚠️ آفت |
| 4 | *Anarsia lineatella* | بید شاخه‌خوار هلو | ⚠️ آفت |
| 5 | *Anoplophora chinensis* | سوسک شاخدار بلند آسیایی | ⚠️ قرنطینه‌ای |
| 6 | *Apantesis vittata* | شب‌پره راه‌راه | ❌ |
| 7 | *Arctia caja* (Adult) | شب‌پره خرس بزرگ (بالغ) | ❌ |
| 8 | *Arctia caja* (Larve) | شب‌پره خرس بزرگ (لارو) | ❌ |
| 9 | *Argema mittrei* | پروانه ابریشمی ماداگاسکار | ❌ |
| 10 | *Argema mittrei* (Larve) | لارو پروانه ابریشمی ماداگاسکار | ❌ |
| 11 | *Attacus atlas* | پروانه اطلس | ❌ |
| 12 | *Cabera variolaria* | شب‌پره هندسی | ❌ |
| 13 | *Cerambyx cerdo* | سوسک شاخدار بزرگ بلوط | ❌ |
| 14 | *Cerroneuroterus lanuginosus* | زنبور پشمی | ❌ |
| 15 | *Cryptolaemus montrouzieri* | کفشدوزک شکارگر | ✅ مفید |
| 16 | *Curculio glandium* | خرطومی بلوط | ❌ |
| 17 | *Cydia latiferreana* | بید میوه بلوط | ❌ |
| 18 | *Cydia pomonella* | کرم سیب | ⚠️ آفت |
| 19 | *Danaus plexippus* | پروانه مونارک | ❌ |
| 20 | *Deilephila elpenor* | شب‌پره فیل صورتی | ❌ |
| 21 | *Dicranura ulmi* | شب‌پره دمدار نارون | ❌ |
| 22 | *Dicycla oo* | شب‌پره حرف یونانی | ❌ |
| 23 | *Dinoptera collaris* | سوسک شاخدار کوچک | ❌ |
| 24 | *Diprion pini* | زنبور اره‌ای کاج | ⚠️ آفت |
| 25 | *Epicometis hirta* | سوسک گل‌خوار | ⚠️ آفت |
| 26 | *Euproctis chrysorrhoea* | شب‌پره قهوه‌ای دم‌طلایی | ⚠️ حساسیت‌زا |
| 27 | *Gypsonoma aceriana* | بید جوانه‌خوار افرا | ❌ |
| 28 | *Harpyia milhauseri* | شب‌پره هارپی | ❌ |
| 29 | *Hesperophanes sericeus* | سوسک شاخدار ابریشمی | ❌ |
| 30 | *Hyles lineata* | شب‌پره خط‌دار | ❌ |
| 31 | *Hylesinus varius* | سوسک پوست‌خوار زبان‌گنجشک | ⚠️ آفت |
| 32 | *Lachnus roboris* | شته بلوط | ❌ |
| 33 | *Lampetis mimosa* | سوسک جواهری | ❌ |
| 34 | *Lyctus brunneus* | سوسک پودرچوب | ⚠️ آفت |
| 35 | *Macroglossum stellatarum* | شب‌پره بال‌شفاف | ❌ |
| 36 | *Metamasius hemipterus* | خرطومی نیشکر | ⚠️ آفت |
| 37 | *Nezara viridula* | سن سبز | ⚠️ آفت |
| 38 | *Nycteola asiatica* | شب‌پره آسیایی | ❌ |
| 39 | *Opodiphthera astrophela* | پروانه ابریشمی استرالیایی | ❌ |
| 40 | *Opodiphthera eucalypti* | پروانه ابریشمی اکالیپتوس | ❌ |
| 41 | *Osphranteria coerulescens* | سوسک چوب آبی | ❌ |
| 42 | *Otiorhynchus sulcatus* | خرطومی شیاردار | ⚠️ آفت |
| 43 | *Palpita unionalis* | بید یاس | ⚠️ آفت |
| 44 | *Papilio glaucus* | پروانه دم‌چلچله‌ای زرد | ❌ |
| 45 | *Platypus cylindrus* | سوسک پلاتیپوس | ⚠️ آفت |
| 46 | *Psalmocharias alhageos* | زنجره خرخر | ❌ |
| 47 | *Rhagoletis pomonella* | مگس سیب | ⚠️ آفت |
| 48 | *Saturnia pavonia* | پروانه ابریشمی کوچک | ❌ |
| 49 | *Schinia arcigera* | شب‌پره گل‌خوار | ❌ |
| 50 | *Sirex noctilio* | زنبور چوب‌خوار کاج | ⚠️ آفت |
| 51 | *Smerinthus ocellata* | شب‌پره چشم‌دار | ❌ |
| 52 | *Sphrageidus similis* | شب‌پره شبیه | ❌ |
| 53 | *Spodoptera exigua* | کرم برگ‌خوار چغندر | ⚠️ آفت |
| 54 | *Spoladea recurvalis* | بید برگ‌خوار | ⚠️ آفت |
| 55 | *Stromatium auratum* | سوسک شاخدار طلایی | ❌ |
| 56 | *Synanthedon pyri* | بید شاخه‌خوار گلابی | ⚠️ آفت |
| 57 | *Tabanus atratus* | مگس اسب سیاه | ⚠️ نیش‌زن |
| 58 | *Tortrix viridana* | بید سبز بلوط | ❌ |
| 59 | *Tyria jacobaeae* | شب‌پره کرمی جاکوبیا | ❌ |
| 60 | *Tyria jacobaeae* (Adult) | شب‌پره کرمی جاکوبیا (بالغ) | ❌ |
| 61 | *Vanessa atalanta* | پروانه آتالانتا | ❌ |
| 62 | *Vespa crabro* | زنبور سرخ اروپایی | ⚠️ نیش‌زن |
| 63 | *Vespula maculifrons* | زنبور زرد پیشانی‌خال‌دار | ⚠️ نیش‌زن |
| 64 | *Xanthogaleruca luteola* | سوسک برگ‌خوار نارون | ⚠️ آفت |
| 65 | *Xylocopa valga* | زنبور نجار | ✅ گرده‌افشان |
| 66 | *Yponomeuta padella* | بید تارتن ارغوانی | ⚠️ آفت |
| 67 | *Yponomeuta padella* (Larve) | لارو بید تارتن ارغوانی | ⚠️ آفت |
| 68 | *Zeuzera pyrina* | بید چوب‌خوار | ⚠️ آفت |

> **راهنمای وضعیت:**  
> ⚠️ **آفت**: گونه آفت یا خطرناک • ✅ **مفید**: گونه مفید (کنترل بیولوژیک/گرده‌افشانی) • ❌ **خنثی**: گونه خنثی/زیبایی‌شناختی

---

## 🧬 دسته‌بندی علمی

### 🦋 راسته پروانه‌سانان (Lepidoptera) - ۳۵ گونه (۵۰.۷٪)

| خانواده | نام فارسی | کلاس‌ها |
|----------|-----------|---------|
| Sphingidae | شب‌پره‌های اسپفنگس | 0, 1, 20, 30, 35, 51 |
| Saturniidae | پروانه‌های ابریشمی | 9, 10, 11, 39, 40, 48 |
| Nymphalidae | فرچه‌پایان | 19, 61 |
| Papilionidae | پروانه‌های دم‌چلچله‌ای | 44 |
| Erebidae | خرس‌ها و ارکتیینا | 6, 7, 8, 26, 59, 60 |
| Noctuidae | شب‌پره‌های جغد | 22, 49, 53 |
| Geometridae | شب‌پره‌های هندسی | 12 |
| Tortricidae | بیدهای پیچ‌پیچ | 17, 18, 27, 58 |
| Gelechiidae | بیدهای کوچک | 4 |
| Notodontidae | شب‌پره‌های دندان‌دار | 21, 28 |
| Nolidae | بیدهای نو | 38 |
| Crambidae | علف‌بیدان | 43, 54 |
| Sesiidae | بیدهای شیشه‌بال | 56 |
| Yponomeutidae | بیدهای ارمنی | 66, 67 |
| Cossidae | بیدهای چوب‌خوار | 68 |
| Lymantriidae | شب‌پره‌های کاکلی | 52 |

### 🪲 راسته سوسک‌سانان (Coleoptera) - ۱۸ گونه (۲۶.۱٪)

| خانواده | نام فارسی | کلاس‌ها |
|----------|-----------|---------|
| Cerambycidae | سوسک‌های شاخدار | 5, 13, 23, 29, 41, 55 |
| Curculionidae | سوسک‌های خرطومی | 16, 31, 36, 42, 45 |
| Buprestidae | سوسک‌های جواهری | 3, 33 |
| Scarabaeidae | سوسک‌های اسکاراب | 25 |
| Coccinellidae | کفشدوزک‌ها | 15 |
| Chrysomelidae | سوسک‌های برگ‌خوار | 64 |
| Bostrichidae | سوسک‌های پودرچوب | 34 |

### 🐝 راسته پرده‌بالان (Hymenoptera) - ۵ گونه (۷.۲٪)

| خانواده | نام فارسی | کلاس‌ها |
|----------|-----------|---------|
| Vespidae | زنبورهای واقعی | 62, 63 |
| Apidae | زنبورهای عسل | 65 |
| Siricidae | زنبورهای چوب | 50 |
| Diprionidae | زنبورهای اره‌ای | 24 |
| Tenthredinidae | زنبورهای اره‌ای برگ‌خوار | 14 |

### 🪰 راسته دوبالان (Diptera) - ۲ گونه (۲.۹٪)

| خانواده | نام فارسی | کلاس‌ها |
|----------|-----------|---------|
| Tabanidae | مگس‌های اسب | 57 |
| Tephritidae | مگس‌های میوه | 47 |

### 🐛 راسته نیم‌بالان (Hemiptera) - ۳ گونه (۴.۳٪)

| خانواده | نام فارسی | کلاس‌ها |
|----------|-----------|---------|
| Pentatomidae | سن‌های سپردار | 2, 37 |
| Aphididae | شته‌ها | 32 |
| Cicadidae | زنجره‌ها | 46 |

### 📊 آمار کلی

| دسته | تعداد | درصد |
|------|-------|-------|
| 🦋 پروانه‌ها و شب‌پره‌ها | 35 | 50.7% |
| 🪲 سوسک‌ها | 18 | 26.1% |
| 🐝 زنبورها | 5 | 7.2% |
| 🪰 مگس‌ها | 2 | 2.9% |
| 🐛 سن‌ها و شته‌ها | 3 | 4.3% |
| 🦗 سایر | 6 | 8.7% |
| **مجموع** | **69** | **100%** |

---

## ⚠️ حشرات خطرناک

> [!CAUTION]
> **۲۷ گونه از ۶۹ گونه قابل تشخیص، به‌عنوان خطرناک یا آفت طبقه‌بندی شده‌اند:**

### 🐛 آفات مهم کشاورزی و جنگل
- *Acrosternum millierei* - سن سبز مدیترانه‌ای
- *Anarsia lineatella* - بید شاخه‌خوار هلو
- *Anoplophora chinensis* - سوسک شاخدار بلند آسیایی (قرنطینه‌ای)
- *Cydia pomonella* - کرم سیب
- *Diprion pini* - زنبور اره‌ای کاج
- *Euproctis chrysorrhoea* - شب‌پره قهوه‌ای دم‌طلایی (حساسیت‌زا)
- *Lyctus brunneus* - سوسک پودرچوب
- *Nezara viridula* - سن سبز
- *Otiorhynchus sulcatus* - خرطومی شیاردار
- *Palpita unionalis* - بید یاس
- *Platypus cylindrus* - سوسک پلاتیپوس
- *Rhagoletis pomonella* - مگس سیب
- *Sirex noctilio* - زنبور چوب‌خوار کاج
- *Spodoptera exigua* - کرم برگ‌خوار چغندر
- *Synanthedon pyri* - بید شاخه‌خوار گلابی
- *Xanthogaleruca luteola* - سوسک برگ‌خوار نارون
- *Zeuzera pyrina* - بید چوب‌خوار

### 🐝 حشرات نیش‌زن
- *Vespa crabro* - زنبور سرخ اروپایی
- *Vespula maculifrons* - زنبور زرد پیشانی‌خال‌دار
- *Tabanus atratus* - مگس اسب سیاه

### 🔬 سایر گونه‌های مهم
- *Agrilus hastulifer* - سوسک شاخدار باریک
- *Epicometis hirta* - سوسک گل‌خوار
- *Hylesinus varius* - سوسک پوست‌خوار زبان‌گنجشک
- *Metamasius hemipterus* - خرطومی نیشکر
- *Spoladea recurvalis* - بید برگ‌خوار
- *Yponomeuta padella* - بید تارتن ارغوانی
- *Yponomeuta padella* (Larve) - لارو بید تارتن ارغوانی

---

## 🛠️ تکنولوژی‌های استفاده‌شده

| تکنولوژی | نسخه | کاربرد |
|----------|------|--------|
| Kotlin | 1.9.22 | زبان برنامه‌نویسی اصلی اپلیکیشن |
| YOLOv26_n | Latest | مدل تشخیص شیء با معماری بهینه‌شده برای لبه |
| TensorFlow Lite | 2.14.0 | اجرای مدل روی موبایل با کوانتیزاسیون INT8 |
| CameraX | 1.3.1 | مدیریت دوربین و پردازش تصویر بلادرنگ |
| Google Play Services | 21.0.1 | دریافت موقعیت GPS با دقت بالا |
| Material Design | 1.11.0 | رابط کاربری مدرن و سازگار با RTL |
| OkHttp | 4.12.0 | ارتباط امن با سرور ابری (HTTPS) |
| FastAPI | 0.104.1 | فریم‌ورک سرور ابری با پشتیبانی از Async |
| Supabase | 2.3.4 | پایگاه داده ابری PostgreSQL + Storage |
| Hugging Face Spaces | - | میزبانی رایگان سرور با Docker |
| Chart.js + Leaflet | Latest | نمودارها و نقشه تعاملی در داشبورد |

---

## ☁️ معماری سرور و داشبورد

> [!SUCCESS]
> **✅ وضعیت سرور:** فعال و متصل به Supabase  
> `https://touraj732-insect-detector-server.hf.space`

### 🏗️ دیاگرام معماری
```
┌─────────────────────────────────────────────────────────┐
│                    Mobile App                           │
│              (Android + YOLOv26_n + TFLite)             │
│  • تشخیص آفلاین • ثبت GPS • ذخیره محلی • آپلود ابری   │
└────────────────────┬────────────────────────────────────┘
                     │ HTTPS POST (Multipart/Form-Data)
                     ▼
┌─────────────────────────────────────────────────────────┐
│              Hugging Face Space                         │
│         (FastAPI + Uvicorn + Docker)                    │
│  ┌──────────────────────────────────────────────────┐  │
│  │  /api/upload  → دریافت تصویر + متادیتا          │  │
│  │  /api/stats   → آمار کلی تشخیص‌ها                │  │
│  │  /api/kpi     → شاخص‌های کلیدی عملکرد           │  │
│  │  /api/alerts  → هشدارهای هوشمند طغیان           │  │
│  │  /api/trend   → داده‌های سری زمانی               │  │
│  │  /api/biodiversity → شاخص‌های تنوع زیستی        │  │
│  │  /api/cooccurrence → ماتریس هم‌رخدادی گونه‌ها  │  │
│  │  /api/map-data → داده‌های مکانی برای نقشه      │  │
│  └──────────────────────────────────────────────────┘  │
└────────────────────┬────────────────────────────────────┘
                     │ HTTPS + JWT Auth
                     ▼
┌─────────────────────────────────────────────────────────┐
│                   Supabase Cloud                        │
│  ┌──────────────────┐    ┌──────────────────────────┐  │
│  │   PostgreSQL     │    │   Object Storage         │  │
│  │   (detections)   │    │   (insect-images)        │  │
│  │ • Row Level Sec  │    │ • Public Read Access     │  │
│  │ • Spatial Index  │    │ • CDN Delivery           │  │
│  └──────────────────┘    └──────────────────────────┘  │
└─────────────────────────────────────────────────────────┘
                     │
                     ▼
┌─────────────────────────────────────────────────────────┐
│              Web Dashboard                              │
│  (HTML5 + Chart.js + Leaflet.js + Vanilla JS)           │
│  • KPI Cards • Time Series Charts • Species Pie        │
│  • Geographic Heatmap • Biodiversity Indices           │
│  • Co-occurrence Matrix • Alerts Panel                 │
└─────────────────────────────────────────────────────────┘
```

### 🗄️ ساختار جدول detections در Supabase
```sql
CREATE TABLE detections (
    id BIGSERIAL PRIMARY KEY,
    primary_key TEXT UNIQUE NOT NULL,      -- INS_YYYYMMDD_HHMMSS_XXXX
    class_name TEXT NOT NULL,              -- نام علمی حشره
    confidence FLOAT NOT NULL,             -- درصد اطمینان تشخیص
    latitude FLOAT NOT NULL,               -- عرض جغرافیایی
    longitude FLOAT NOT NULL,              -- طول جغرافیایی
    user_name TEXT NOT NULL,               -- نام کاربر ثبت‌کننده
    image_url TEXT,                        -- لینک عمومی تصویر در Storage
    created_at TIMESTAMPTZ DEFAULT NOW(),  -- زمان ثبت
    uploaded BOOLEAN DEFAULT false         -- وضعیت همگام‌سازی
);

-- ایندکس‌های بهینه برای کوئری‌های مکرر
CREATE INDEX idx_detections_location ON detections (latitude, longitude);
CREATE INDEX idx_detections_created ON detections (created_at DESC);
CREATE INDEX idx_detections_class ON detections (class_name);
CREATE INDEX idx_detections_user ON detections (user_name);

-- سیاست‌های دسترسی (Row Level Security)
ALTER TABLE detections ENABLE ROW LEVEL SECURITY;

CREATE POLICY "Public read access" ON detections
  FOR SELECT TO public USING (true);

CREATE POLICY "Enable insert for all users" ON detections
  FOR INSERT TO public WITH CHECK (true);
```

### 🌐 لینک‌های مهم
- 🏠 داشبورد اصلی: [https://touraj732-insect-detector-server.hf.space](https://touraj732-insect-detector-server.hf.space)
- 🗺️ نقشه پراکندگی: [/map](https://touraj732-insect-detector-server.hf.space/map)
- 🔬 تحلیل‌های پیشرفته: [/analytics](https://touraj732-insect-detector-server.hf.space/analytics)
- 🩺 بررسی سلامت سرور: [/health](https://touraj732-insect-detector-server.hf.space/health)
- 📚 مستندات API: [/docs](https://touraj732-insect-detector-server.hf.space/docs)

---

## 📁 ساختار پروژه

```
App_Insects/
│
├── 📱 app/
│   └── src/main/
│       ├── java/com/example/insectdetector/
│       │   ├── MainActivity.kt              ← صفحه اصلی و مدیریت ناوبری
│       │   ├── CameraActivity.kt            ← فعالیت دوربین + تشخیص بلادرنگ
│       │   ├── ResultActivity.kt            ← نمایش نتایج + آپلود به سرور
│       │   │
│       │   ├── detector/
│       │   │   ├── YOLODetector.kt          ← هسته تشخیص با TFLite Interpreter
│       │   │   ├── DetectionResult.kt       ← مدل داده تشخیص (data class)
│       │   │   └── InsectInfo.kt            ← اطلاعات ۶۹ گونه (نام، خانواده، خطر)
│       │   │
│       │   ├── data/
│       │   │   ├── InsectDatabase.kt        ← پایگاه داده محلی Room (اختیاری)
│       │   │   └── ServerUploader.kt        ← کلاس آپلود به Hugging Face API
│       │   │
│       │   └── utils/
│       │       ├── Constants.kt             ← ثابت‌های برنامه (URLها، مسیرها)
│       │       ├── ImageUtils.kt            ← ابزارهای پیش‌پردازش تصویر
│       │       ├── LocationHelper.kt        ← مدیریت GPS و دریافت مختصات
│       │       └── DataRecorder.kt          ← ثبت در CSV + مدیریت پوشه‌ها
│       │
│       ├── res/
│       │   ├── layout/                      ← فایل‌های XML رابط کاربری (RTL)
│       │   ├── drawable/                    ← آیکون‌ها، لوگو، تصاویر
│       │   └── values/                      ← رشته‌ها، رنگ‌ها، استایل‌ها
│       │
│       ├── assets/
│       │   └── best_float16.tflite          ← مدل YOLOv26_n کوانتیزه‌شده
│       │
│       └── AndroidManifest.xml              ← مجوزها، فعالیت‌ها، metadata
│
├── Server/                                  ← کد سرور Hugging Face
│   ├── app/
│   │   ├── main.py                          ← FastAPI endpoints + منطق کسب‌وکار
│   │   └── static/
│   │       ├── index.html                   ← داشبورد اصلی با Chart.js
│   │       ├── map.html                     ← نقشه تعاملی با Leaflet + Heatmap
│   │       └── analytics.html               ← تحلیل‌های پیشرفته
│   ├── requirements.txt                     ← وابستگی‌های Python
│   ├── Dockerfile                           ← پیکربندی استقرار در Hugging Face
│   └── README.md                            ← مستندات سرور
│
├── .github/
│   └── workflows/
│       └── android.yml                      ← CI/CD: Build, Test, Release APK
│
├── build.gradle.kts                         ← پیکربندی Gradle
├── settings.gradle.kts                      ← تنظیمات پروژه و ماژول‌ها
├── gradle.properties                        ← ویژگی‌های Gradle و JVM
├── README.md                                ← این فایل مستندات
└── .gitignore                               ← فایل‌های نادیده گرفته‌شده در Git
```

---

## 🔮 برنامه‌های آینده

### 🚀 نسخه 2.0 (در حال توسعه)
- [x] 🌐 اتصال به سرور مرکزی برای انتقال خودکار داده‌ها
- [x] 📊 داشبورد پایش آفات تحت وب برای تحلیل داده‌ها
- [x] 🗺️ نقشه پراکندگی حشرات بر اساس GPS با Heatmap
- [x] 📈 آمار و نمودارهای زمانی تشخیص‌ها
- [x] 🔔 هشدار طغیان آفات بر اساس داده‌های جمع‌آوری‌شده
- [ ] 🔐 احراز هویت کاربر برای تفکیک داده‌های پژوهشگران
- [ ] 📱 نوتیفیکیشن Push برای هشدارهای فوری

### 🔬 نسخه 3.0 (برنامه‌ریزی)
- [ ] 🔍 افزایش تعداد گونه‌های قابل تشخیص به بیش از 200 گونه
- [ ] 🌿 افزودن اطلاعات گیاهان میزبان و علائم آسیب برای هر گونه
- [ ] 💊 پیشنهاد روش‌های مبارزه بیولوژیک و شیمیایی بر اساس گونه تشخیص داده شده
- [ ] 📱 نسخه iOS اپلیکیشن با SwiftUI
- [ ] 🌍 پشتیبانی چندزبانه (انگلیسی، عربی) برای استفاده منطقه‌ای
- [ ] 🤖 افزودن مدل طبقه‌بندی لارو vs بالغ برای گونه‌های دو مرحله‌ای
- [ ] 📡 یکپارچه‌سازی با سنسورهای IoT برای پایش خودکار در تله‌های هوشمند

### 🤝 همکاری و یکپارچه‌سازی
- [ ] 🎓 همکاری با دانشگاه‌ها برای بهبود مدل با داده‌های بیشتر و متنوع‌تر
- [ ] 🏛️ یکپارچه‌سازی با سامانه‌های سازمان جنگل‌ها، مراتع و آبخیزداری
- [ ] 🌐 انتشار API عمومی برای توسعه‌دهندگان شخص ثالث
- [ ] 📊 اتصال به سامانه‌های ملی پایش تنوع زیستی ایران

---

## 📤 انتقال داده‌ها به کامپیوتر

### با استفاده از ADB
```bash
# کپی کل پوشه داده‌ها به کامپیوتر
adb pull /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/ C:\InsectRecords\

# کپی فقط فایل CSV
adb pull /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv C:\

# مشاهده محتوای CSV در ترمینال
adb shell cat /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv
```

### دستورات مفید برای مدیریت داده‌ها
```bash
# شمارش تعداد تصاویر ذخیره‌شده
adb shell find /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/ -name "*.jpg" | wc -l

# مشاهده حجم کل پوشه داده‌ها
adb shell du -sh /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/

# مشاهده 10 رکورد آخر فایل CSV
adb shell tail -n 10 /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv

# پاک کردن کش پس از همگام‌سازی موفق
adb shell rm -rf /sdcard/Android/data/com.example.insectdetector/cache/*
```

---

## 🤝 مشارکت

ما از پیشنهادات، گزارش مشکلات و همکاری شما استقبال می‌کنیم!

- 🐛 **گزارش مشکل:** اگر با خطا یا باگی مواجه شدید، لطفاً در بخش [Issues](../../issues) گزارش دهید.
- 💡 **پیشنهاد ویژگی:** برای ایده‌های جدید، از بخش [Discussions](../../discussions) استفاده کنید.
- 🔀 **Pull Request:** برای مشارکت در توسعه کد:
  1. Fork از مخزن اصلی
  2. ایجاد Branch جدید: `git checkout -b feature/AmazingFeature`
  3. Commit تغییرات: `git commit -m 'Add some AmazingFeature'`
  4. Push به Branch: `git push origin feature/AmazingFeature`
  5. باز کردن Pull Request در GitHub

---

## 📄 لایسنس

این پروژه تحت **لایسنس اختصاصی مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی استان چهارمحال و بختیاری** منتشر شده است.

> [!WARNING]
> **⚠️ توجه:** استفاده تجاری از این اپلیکیشن، مدل YOLOv26_n و داده‌های جمع‌آوری‌شده بدون اجازه کتبی از توسعه‌دهنده ممنوع است. استفاده پژوهشی و غیرتجاری با ذکر منبع بلامانع است.

---

## 📞 پشتیبانی و تماس

برای ارتباط با تیم توسعه و گزارش مشکلات:

| روش | آدرس |
|-----|-------|
| 📧 ایمیل | [mokhtarpour.touraj@gmail.com](mailto:mokhtarpour.touraj@gmail.com) |
| 🌐 GitHub | [@tourajmokhtarpour](https://github.com/tourajmokhtarpour) |
| 🐛 Issues | [گزارش مشکل در GitHub](../../issues) |
| 💬 Discussions | [پیشنهاد ویژگی در GitHub](../../discussions) |

> [!INFO]
> **یادآوری:** برای سوالات علمی، پژوهشی و تخصصی در حوزه حشره‌شناسی و پایش آفات، لطفاً مستقیماً با توسعه‌دهنده اصلی تماس بگیرید.

---

## 👨‍🔬 توسعه‌دهنده

<div align="center">

### Touraj Mokhtarpour
**تورج مختارپور**  
*پژوهشگر بخش تحقیقات جنگل و مرتع*

🏛️ **مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی**  
استان چهارمحال و بختیاری، ایران

[📧 ایمیل](mailto:mokhtarpour.touraj@gmail.com) • [🌐 GitHub](https://github.com/tourajmokhtarpour)

</div>

---

## 🙏 تقدیر و تشکر

با تشکر ویژه از:
- کلیه همکاران پژوهشی مرکز تحقیقات چهارمحال و بختیاری که در جمع‌آوری داده‌های میدانی مشارکت داشتند
- جنگل‌بانان و محیط‌بانان عزیز استان که با آزمایش اپلیکیشن در عرصه‌های طبیعی، به بهبود آن کمک کردند
- توسعه‌دهندگان جامعه متن‌باز YOLO، TensorFlow و FastAPI که زیرساخت‌های این پروژه را فراهم ساختند
- سازمان جنگل‌ها، مراتع و آبخیزداری کشور برای حمایت از پژوهش‌های کاربردی در حوزه پایش آفات

---

<div align="center">

⭐ اگر این پروژه برایتان مفید بود، یک ستاره به مخزن GitHub بدهید! ⭐

---

**🐛 Insect Detector © 2026**  
مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی استان چهارمحال و بختیاری

*آخرین به‌روزرسانی: ۲ مرداد ۱۴۰۵ • نسخه اپلیکیشن: **1.2.0** • وضعیت سرور: ✅ فعال*

</div>
