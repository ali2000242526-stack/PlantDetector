<!DOCTYPE html>
<html lang="fa" dir="rtl">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Insect Detector - پایش و تشخیص هوشمند حشرات</title>
  <style>
    :root {
      --primary: #1B5E20; --primary-light: #4CAF50; --primary-dark: #003300;
      --accent: #2196F3; --warning: #FF9800; --danger: #F44336;
      --bg: #f8fafc; --card: #ffffff; --text: #1e293b; --muted: #64748b;
      --border: #e2e8f0; --shadow: 0 4px 6px -1px rgba(0,0,0,0.1);
    }
    * { box-sizing: border-box; margin: 0; padding: 0; }
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: var(--bg); color: var(--text); line-height: 1.7;
      padding: 20px; max-width: 1200px; margin: 0 auto;
    }
    h1, h2, h3, h4 { color: var(--primary); margin: 1.5em 0 0.75em; }
    h1 { font-size: 1.8rem; border-bottom: 3px solid var(--primary-light); padding-bottom: 0.5em; }
    h2 { font-size: 1.5rem; border-right: 4px solid var(--primary-light); padding-right: 12px; }
    h3 { font-size: 1.3rem; color: var(--primary-dark); }
    p { margin: 0.75em 0; }
    a { color: var(--accent); text-decoration: none; }
    a:hover { text-decoration: underline; }
    
    /* Badges */
    .badge { display: inline-block; padding: 3px 10px; border-radius: 20px; font-size: 12px; font-weight: 600; margin: 2px; }
    .badge-primary { background: var(--primary-light); color: white; }
    .badge-accent { background: var(--accent); color: white; }
    .badge-warning { background: var(--warning); color: #1a1a1a; }
    .badge-danger { background: var(--danger); color: white; }
    .badge-success { background: #22c55e; color: white; }
    
    /* Cards */
    .card { background: var(--card); border-radius: 12px; padding: 20px; margin: 15px 0; box-shadow: var(--shadow); border: 1px solid var(--border); }
    .card-header { display: flex; align-items: center; gap: 10px; margin-bottom: 12px; padding-bottom: 10px; border-bottom: 1px solid var(--border); }
    .card-icon { font-size: 24px; }
    
    /* Tables */
    table { width: 100%; border-collapse: collapse; margin: 15px 0; font-size: 14px; }
    th { background: var(--primary); color: white; padding: 12px 10px; text-align: right; font-weight: 600; }
    td { padding: 10px; border-bottom: 1px solid var(--border); }
    tr:hover { background: #f1f5f9; }
    .table-responsive { overflow-x: auto; }
    
    /* Code blocks */
    pre { background: #1e293b; color: #e2e8f0; padding: 15px; border-radius: 8px; overflow-x: auto; margin: 15px 0; font-size: 13px; direction: ltr; text-align: left; }
    code { background: #f1f5f9; padding: 2px 6px; border-radius: 4px; font-family: monospace; }
    pre code { background: none; padding: 0; }
    
    /* Alerts */
    .alert { padding: 15px; border-radius: 8px; margin: 15px 0; border-right: 4px solid; }
    .alert-info { background: #eff6ff; border-color: var(--accent); }
    .alert-warning { background: #fff7ed; border-color: var(--warning); }
    .alert-danger { background: #fef2f2; border-color: var(--danger); }
    .alert-success { background: #f0fdf4; border-color: #22c55e; }
    
    /* Lists */
    ul, ol { margin: 10px 0; padding-right: 25px; }
    li { margin: 5px 0; }
    
    /* Features grid */
    .features-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(250px, 1fr)); gap: 15px; margin: 20px 0; }
    .feature-item { background: var(--card); padding: 15px; border-radius: 10px; border: 1px solid var(--border); }
    .feature-title { font-weight: 600; color: var(--primary); margin-bottom: 8px; display: flex; align-items: center; gap: 8px; }
    
    /* Species table */
    .species-table th { position: sticky; top: 0; z-index: 10; }
    .species-row:hover { background: #f8fafc; }
    .dangerous { color: var(--danger); font-weight: 600; }
    
    /* Navigation */
    .toc { background: var(--card); padding: 20px; border-radius: 12px; margin: 20px 0; border: 1px solid var(--border); }
    .toc ul { list-style: none; padding-right: 0; }
    .toc li { margin: 8px 0; }
    .toc a { color: var(--text); font-weight: 500; }
    .toc a:hover { color: var(--primary); }
    
    /* Footer */
    footer { margin-top: 40px; padding-top: 20px; border-top: 2px solid var(--border); text-align: center; color: var(--muted); font-size: 14px; }
    
    /* Responsive */
    @media (max-width: 768px) {
      body { padding: 15px; }
      h1 { font-size: 1.5rem; }
      .features-grid { grid-template-columns: 1fr; }
      table { font-size: 13px; }
      th, td { padding: 8px 6px; }
    }
  </style>
</head>
<body>

  <!-- Header -->
    <!-- Header - بزرگ و وسط‌چین -->
  <header style="text-align: center; padding: 40px 20px; background: linear-gradient(135deg, #1B5E20 0%, #4CAF50 100%); color: white; border-radius: 0 0 20px 20px; margin-bottom: 30px; box-shadow: 0 8px 25px rgba(0,0,0,0.15);">
    
    <!-- عنوان اصلی بزرگ -->
    <h1 style="font-size: 2.5rem; margin: 0 0 10px; font-weight: 800; text-shadow: 2px 2px 4px rgba(0,0,0,0.3);">
      🐛 Insect Detector
    </h1>
    
    <!-- زیرعنوان -->
    <p style="font-size: 1.4rem; margin: 0 0 20px; font-weight: 500; opacity: 0.95;">
      پایش و تشخیص هوشمند حشرات و آفات با الگوریتم YOLOv26_n
    </p>
    
    <!-- بدج‌های ویژگی‌ها - وسط‌چین -->
    <div style="display: flex; justify-content: center; flex-wrap: wrap; gap: 10px; margin: 20px 0;">
      <span class="badge badge-primary" style="font-size: 1rem; padding: 8px 16px;">📱 اندروید 7.0+</span>
      <span class="badge badge-accent" style="font-size: 1rem; padding: 8px 16px;">🧠 YOLOv26_n</span>
      <span class="badge badge-success" style="font-size: 1rem; padding: 8px 16px;">🦋 69 گونه حشره</span>
      <span class="badge badge-warning" style="font-size: 1rem; padding: 8px 16px;">📍 GPS Enabled</span>
      <span class="badge badge-primary" style="font-size: 1rem; padding: 8px 16px;">🌐 فارسی</span>
      <span class="badge badge-success" style="font-size: 1rem; padding: 8px 16px;">☁️ Supabase + Hugging Face</span>
    </div>
    
    <!-- توضیحات اصلی - وسط‌چین -->
    <p style="font-size: 1.2rem; margin: 25px auto; max-width: 800px; line-height: 1.8; background: rgba(255,255,255,0.15); padding: 20px; border-radius: 12px; backdrop-filter: blur(10px);">
      اپلیکیشن اندروید تشخیص ۶۹ گونه حشره با استفاده از مدل <strong>YOLOv26_n</strong> و <strong>TensorFlow Lite</strong><br>
      طراحی شده برای پژوهشگران، جنگل‌بانان و متخصصان کشاورزی
    </p>
    
    <!-- وضعیت‌های کلیدی - وسط‌چین -->
    <div style="display: flex; justify-content: center; flex-wrap: wrap; gap: 15px; margin-top: 20px;">
      <span style="background: rgba(255,255,255,0.25); padding: 10px 20px; border-radius: 30px; font-weight: 600; font-size: 1rem;">
        ✅ تشخیص آفلاین
      </span>
      <span style="background: rgba(255,255,255,0.25); padding: 10px 20px; border-radius: 30px; font-weight: 600; font-size: 1rem;">
        ✅ همگام‌سازی ابری
      </span>
      <span style="background: rgba(255,255,255,0.25); padding: 10px 20px; border-radius: 30px; font-weight: 600; font-size: 1rem;">
        ✅ داشبورد تحلیلی تحت وب
      </span>
    </div>
    
  </header>

  <!-- Table of Contents -->
  <nav class="toc">
    <h3 style="margin-top: 0;">📑 فهرست مطالب</h3>
    <ul>
      <li><a href="#intro">🎯 معرفی اپلیکیشن</a></li>
      <li><a href="#features">🌟 ویژگی‌های کلیدی</a></li>
      <li><a href="#warnings">⚠️ تذکرات مهم</a></li>
      <li><a href="#storage">📂 محل ذخیره‌سازی داده‌ها</a></li>
      <li><a href="#installation">📥 نصب و راه‌اندازی</a></li>
      <li><a href="#usage">📖 راهنمای استفاده</a></li>
      <li><a href="#species">🎯 گونه‌های قابل تشخیص (۶۹ گونه)</a></li>
      <li><a href="#classification">🧬 دسته‌بندی علمی</a></li>
      <li><a href="#dangerous">⚠️ حشرات خطرناک</a></li>
      <li><a href="#tech">🛠️ تکنولوژی‌های استفاده‌شده</a></li>
      <li><a href="#server">☁️ معماری سرور و داشبورد</a></li>
      <li><a href="#structure">📁 ساختار پروژه</a></li>
      <li><a href="#future">🔮 برنامه‌های آینده</a></li>
      <li><a href="#support">📞 پشتیبانی و تماس</a></li>
      <li><a href="#developer">👨‍🔬 توسعه‌دهنده</a></li>
    </ul>
  </nav>

  <!-- Introduction -->
  <section id="intro" class="card">
    <div class="card-header">
      <span class="card-icon">🎯</span>
      <h2 style="margin: 0;">معرفی اپلیکیشن</h2>
    </div>
    <p>اپلیکیشن <strong>Insect Detector</strong> یک ابزار تخصصی برای پایش و شناسایی حشرات و آفات است که با هدف حمایت از پژوهشگران حوزه‌های کشاورزی، جنگل و مرتع طراحی و توسعه یافته است.</p>
    
    <div class="alert alert-success">
      <strong>✅ وضعیت فعلی پروژه:</strong><br>
      • تشخیص آفلاین ۶۹ گونه حشره با YOLOv26_n روی موبایل<br>
      • همگام‌سازی خودکار داده‌ها با سرور ابری (Hugging Face + Supabase)<br>
      • داشبورد تحلیلی تحت وب با نمودارها، نقشه و هشدارهای هوشمند<br>
      • API کامل برای یکپارچه‌سازی با سامانه‌های خارجی
    </div>
    
    <p>این اپلیکیشن با بهره‌گیری از الگوریتم‌های پیشرفته هوش مصنوعی و فناوری TensorFlow Lite، امکان شناسایی سریع و دقیق گونه‌های حشره را به‌صورت کاملاً آفلاین روی گوشی موبایل فراهم می‌کند. داده‌های جمع‌آوری‌شده به‌صورت خودکار با سرور ابری همگام‌سازی شده و در داشبورد مدیریتی قابل تحلیل و مشاهده هستند.</p>
  </section>

  <!-- Objectives -->
  <section class="card">
    <h3>🎯 اهداف پروژه</h3>
    <ul>
      <li>🌿 تسریع فرآیند پایش آفات در عرصه‌های طبیعی</li>
      <li>📊 جمع‌آوری داده‌های مکانی‌دار از پراکندگی حشرات</li>
      <li>🔬 ارائه ابزار دقیق برای پژوهش‌های علمی و اکولوژیک</li>
      <li>📱 امکان استفاده در مناطق دورافتاده بدون اینترنت (آفلاین)</li>
      <li>☁️ همگام‌سازی خودکار با سرور ابری برای تحلیل‌های کلان</li>
      <li>🗂️ مستندسازی خودکار نمونه‌های جمع‌آوری‌شده با کلید یکتا</li>
      <li>🗺️ ترسیم نقشه پراکندگی حشرات بر اساس مختصات GPS</li>
      <li>🔔 ارائه هشدارهای هوشمند برای طغیان آفات</li>
    </ul>
  </section>

  <!-- Features -->
  <section id="features" class="card">
    <div class="card-header">
      <span class="card-icon">🌟</span>
      <h2 style="margin: 0;">ویژگی‌های کلیدی</h2>
    </div>
    
    <div class="features-grid">
      <div class="feature-item">
        <div class="feature-title">🎯 قابلیت‌های تشخیص</div>
        <ul style="margin: 0; padding-right: 20px; font-size: 14px;">
          <li>✅ تشخیص ۶۹ گونه حشره با دقت بالا</li>
          <li>✅ نمایش درصد اطمینان تشخیص</li>
          <li>✅ فیلتر هوشمند تشخیص‌های بالای ۵۰٪</li>
          <li>✅ اطلاعات کامل هر حشره (نام علمی، فارسی، خانواده)</li>
        </ul>
      </div>
      
      <div class="feature-item">
        <div class="feature-title">📱 قابلیت‌های کاربری</div>
        <ul style="margin: 0; padding-right: 20px; font-size: 14px;">
          <li>📷 عکس‌برداری با دوربین گوشی</li>
          <li>🖼️ انتخاب تصویر از گالری</li>
          <li>🌐 رابط کاربری کاملاً فارسی و RTL</li>
          <li>📴 اجرای آفلاین (بدون نیاز به اینترنت)</li>
        </ul>
      </div>
      
      <div class="feature-item">
        <div class="feature-title">📍 قابلیت‌های مکانی</div>
        <ul style="margin: 0; padding-right: 20px; font-size: 14px;">
          <li>📍 ثبت خودکار مختصات GPS</li>
          <li>🗺️ لینک مستقیم به Google Maps</li>
          <li>📊 نمایش موقعیت روی نقشه در داشبورد</li>
          <li>🎯 ذخیره نقاط نمونه‌برداری با کلید یکتا</li>
        </ul>
      </div>
      
      <div class="feature-item">
        <div class="feature-title">☁️ قابلیت‌های ابری</div>
        <ul style="margin: 0; padding-right: 20px; font-size: 14px;">
          <li>🔄 همگام‌سازی خودکار با Supabase</li>
          <li>📤 آپلود تصاویر به Storage ابری</li>
          <li>📊 داشبورد تحلیلی تحت وب</li>
          <li>🔔 سیستم هشدار هوشمند طغیان آفات</li>
        </ul>
      </div>
    </div>
  </section>

  <!-- Warnings -->
  <section id="warnings" class="card">
    <div class="card-header">
      <span class="card-icon">⚠️</span>
      <h2 style="margin: 0;">تذکرات مهم برای کاربران</h2>
    </div>
    
    <div class="alert alert-info">
      <strong>📸 نکات طلایی عکس‌برداری</strong><br>
      • <strong>کیفیت بالا:</strong> از حشرات با کیفیت عکس بالا تصویربرداری نمایید.<br>
      • <strong>زوایای متعدد:</strong> از هر حشره چندین عکس از زوایای مختلف تهیه کنید.<br>
      • <strong>نور مناسب:</strong> در نور کافی عکس بگیرید تا جزئیات بهتر مشخص شود.<br>
      • <strong>فاصله مناسب:</strong> حشره را در مرکز کادر و با فاصله مناسب قرار دهید.
    </div>
    
    <div class="alert alert-warning">
      <strong>📍 فعال‌سازی GPS</strong><br>
      در هنگام فعالیت در طبیعت، GPS موبایل را فعال نگه دارید تا نقاط نمونه‌برداری به‌صورت خودکار ثبت گردد. این اطلاعات برای تحلیل‌های پراکندگی حشرات بسیار ارزشمند است.
    </div>
    
    <div class="alert alert-success">
      <strong>🎯 فیلتر هوشمند</strong><br>
      اپلیکیشن فقط تشخیص‌های با احتمال بالای ۵۰٪ را ثبت می‌کند؛ توصیه می‌شود چندین عکس با کیفیت تهیه شود تا بهترین نتیجه حاصل گردد.
    </div>
    
    <div class="alert alert-danger">
      <strong>🗑️ مدیریت حافظه</strong><br>
      آدرس ذخیره عکس‌ها در بخش <a href="#storage">محل ذخیره‌سازی</a> آمده است. پس از همگام‌سازی موفق با سرور، می‌توانید فایل‌های پوشه cache را حذف نمایید تا فضای موبایل آزاد شود.
    </div>
  </section>

  <!-- Storage -->
  <section id="storage" class="card">
    <div class="card-header">
      <span class="card-icon">📂</span>
      <h2 style="margin: 0;">محل ذخیره‌سازی داده‌ها</h2>
    </div>
    
    <p><strong>📍 مسیر اصلی در موبایل:</strong></p>
    <pre>/sdcard/Android/data/com.example.insectdetector/files/InsectRecords/</pre>
    
    <p><strong>🗂️ ساختار پوشه‌ها:</strong></p>
    <pre>InsectRecords/
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
    └── ...</pre>
    
    <p><strong>📊 فرمت فایل CSV:</strong></p>
    <pre>ID,ClassName,Confidence,Latitude,Longitude,DateTime,UserName,ImagePath,Uploaded
INS_20260626_123456_7890,"Danaus plexippus",85.50,32.325674,51.654321,"2026-06-26 12:34:56","تورج مختارپور","/path/to/image.jpg",true</pre>
    
    <p><strong>🔑 ساختار کلید اصلی:</strong></p>
    <pre>INS_YYYYMMDD_HHMMSS_XXXX
مثال: INS_20260626_123456_7890</pre>
    <p>این کلید برای ارتباط بین فایل CSV، تصویر ذخیره‌شده و رکورد ابری استفاده می‌شود.</p>
    
    <div class="alert alert-info">
      <strong>☁️ همگام‌سازی با سرور:</strong><br>
      پس از تشخیص موفق، داده‌ها به‌صورت خودکار به سرور Hugging Face ارسال شده و در پایگاه داده Supabase ذخیره می‌شوند. فیلد <code>Uploaded</code> در CSV وضعیت همگام‌سازی را نشان می‌دهد.
    </div>
  </section>

  <!-- Installation -->
  <section id="installation" class="card">
    <div class="card-header">
      <span class="card-icon">📥</span>
      <h2 style="margin: 0;">نصب و راه‌اندازی</h2>
    </div>
    
    <h3>روش ۱: دانلود APK (ساده‌ترین)</h3>
    <ol>
      <li>به بخش <a href="#">Releases</a> مراجعه کنید</li>
      <li>آخرین نسخه APK را دانلود کنید</li>
      <li>فایل را روی موبایل نصب کنید</li>
      <li>مجوزهای لازم (دوربین، GPS، ذخیره‌سازی) را اعطا کنید</li>
    </ol>
    
    <h3>روش ۲: ساخت از سورس کد</h3>
    <pre># کلون کردن مخزن
git clone https://github.com/tourajmokhtarpour/App_Insects.git
cd App_Insects

# ساخت APK
./gradlew assembleDebug

# مسیر فایل خروجی
# app/build/outputs/apk/debug/app-debug.apk</pre>
    
    <h3>روش ۳: نصب با ADB</h3>
    <pre># اتصال موبایل و نصب
adb install app/build/outputs/apk/debug/app-debug.apk

# اعطای مجوزها
adb shell pm grant com.example.insectdetector android.permission.CAMERA
adb shell pm grant com.example.insectdetector android.permission.ACCESS_FINE_LOCATION
adb shell pm grant com.example.insectdetector android.permission.ACCESS_COARSE_LOCATION</pre>
    
    <h3>📋 پیش‌نیازها</h3>
    <ul>
      <li>اندروید 7.0 (API 24) یا بالاتر</li>
      <li>حداقل 200MB فضای خالی</li>
      <li>دسترسی به دوربین و GPS</li>
      <li>اتصال اینترنت برای همگام‌سازی اولیه (اختیاری برای استفاده آفلاین)</li>
    </ul>
  </section>

  <!-- Usage -->
  <section id="usage" class="card">
    <div class="card-header">
      <span class="card-icon">📖</span>
      <h2 style="margin: 0;">راهنمای استفاده</h2>
    </div>
    
    <h3>🚀 شروع کار</h3>
    <ol>
      <li>اپلیکیشن را باز کنید</li>
      <li>در اولین اجرا، نام خود را وارد کنید</li>
      <li>مجوزهای لازم را اعطا کنید</li>
      <li>برای همگام‌سازی ابری، اتصال اینترنت را فعال نمایید</li>
    </ol>
    
    <h3>📷 عکس‌برداری از حشره</h3>
    <ol>
      <li>روی دکمه "📷 باز کردن دوربین" کلیک کنید</li>
      <li>GPS به‌صورت خودکار فعال می‌شود</li>
      <li>حشره را در مرکز کادر قرار دهید</li>
      <li>دکمه عکس را بزنید</li>
      <li>نتیجه تشخیص همراه با درصد اطمینان نمایش داده می‌شود</li>
      <li>داده‌ها به‌صورت خودکار ذخیره و در صورت اتصال، به سرور ارسال می‌شوند</li>
    </ol>
    
    <h3>🖼️ انتخاب از گالری</h3>
    <ol>
      <li>روی دکمه "🖼️ انتخاب از گالری" کلیک کنید</li>
      <li>تصویر مورد نظر را انتخاب کنید</li>
      <li>نتیجه تشخیص نمایش داده می‌شود</li>
    </ol>
    
    <h3>📊 مشاهده نتایج</h3>
    <ul>
      <li>نام فارسی و علمی حشره</li>
      <li>درصد اطمینان تشخیص</li>
      <li>خانواده و زیستگاه</li>
      <li>موقعیت GPS با لینک به Google Maps</li>
      <li>کلید اصلی ثبت (برای ردیابی در CSV و سرور)</li>
      <li>وضعیت همگام‌سازی با سرور (✅/⏳)</li>
    </ul>
    
    <h3>☁️ مشاهده داده‌ها در داشبورد</h3>
    <p>برای مشاهده داده‌های همگام‌سازی‌شده:</p>
    <ol>
      <li>به آدرس داشبورد مراجعه کنید: <code>https://touraj732-insect-detector-server.hf.space</code></li>
      <li>نمودارهای روند تشخیص، توزیع گونه‌ها و نقشه پراکندگی را مشاهده کنید</li>
      <li>هشدارهای هوشمند و شاخص‌های کلیدی عملکرد (KPI) را بررسی نمایید</li>
    </ol>
  </section>

  <!-- Species Table -->
  <section id="species" class="card">
    <div class="card-header">
      <span class="card-icon">🎯</span>
      <h2 style="margin: 0;">گونه‌های قابل تشخیص (۶۹ گونه)</h2>
    </div>
    
    <div class="table-responsive">
      <table class="species-table">
        <thead>
          <tr>
            <th>#</th>
            <th>نام علمی</th>
            <th>نام فارسی</th>
            <th>وضعیت</th>
          </tr>
        </thead>
        <tbody>
          <tr class="species-row"><td>0</td><td><em>Acherontia atropos</em></td><td>پروانه مرگ</td><td>❌</td></tr>
          <tr class="species-row"><td>1</td><td><em>Acherontia atropos</em> (Larve)</td><td>لارو پروانه مرگ</td><td>❌</td></tr>
          <tr class="species-row"><td>2</td><td><em>Acrosternum millierei</em></td><td>سن سبز مدیترانه‌ای</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>3</td><td><em>Agrilus hastulifer</em></td><td>سوسک شاخدار باریک</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>4</td><td><em>Anarsia lineatella</em></td><td>بید شاخه‌خوار هلو</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>5</td><td><em>Anoplophora chinensis</em></td><td>سوسک شاخدار بلند آسیایی</td><td class="dangerous">⚠️ قرنطینه‌ای</td></tr>
          <tr class="species-row"><td>6</td><td><em>Apantesis vittata</em></td><td>شب‌پره راه‌راه</td><td>❌</td></tr>
          <tr class="species-row"><td>7</td><td><em>Arctia caja</em> (Adult)</td><td>شب‌پره خرس بزرگ (بالغ)</td><td>❌</td></tr>
          <tr class="species-row"><td>8</td><td><em>Arctia caja</em> (Larve)</td><td>شب‌پره خرس بزرگ (لارو)</td><td>❌</td></tr>
          <tr class="species-row"><td>9</td><td><em>Argema mittrei</em></td><td>پروانه ابریشمی ماداگاسکار</td><td>❌</td></tr>
          <tr class="species-row"><td>10</td><td><em>Argema mittrei</em> (Larve)</td><td>لارو پروانه ابریشمی ماداگاسکار</td><td>❌</td></tr>
          <tr class="species-row"><td>11</td><td><em>Attacus atlas</em></td><td>پروانه اطلس</td><td>❌</td></tr>
          <tr class="species-row"><td>12</td><td><em>Cabera variolaria</em></td><td>شب‌پره هندسی</td><td>❌</td></tr>
          <tr class="species-row"><td>13</td><td><em>Cerambyx cerdo</em></td><td>سوسک شاخدار بزرگ بلوط</td><td>❌</td></tr>
          <tr class="species-row"><td>14</td><td><em>Cerroneuroterus lanuginosus</em></td><td>زنبور پشمی</td><td>❌</td></tr>
          <tr class="species-row"><td>15</td><td><em>Cryptolaemus montrouzieri</em></td><td>کفشدوزک شکارگر</td><td>✅ مفید</td></tr>
          <tr class="species-row"><td>16</td><td><em>Curculio glandium</em></td><td>خرطومی بلوط</td><td>❌</td></tr>
          <tr class="species-row"><td>17</td><td><em>Cydia latiferreana</em></td><td>بید میوه بلوط</td><td>❌</td></tr>
          <tr class="species-row"><td>18</td><td><em>Cydia pomonella</em></td><td>کرم سیب</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>19</td><td><em>Danaus plexippus</em></td><td>پروانه مونارک</td><td>❌</td></tr>
          <tr class="species-row"><td>20</td><td><em>Deilephila elpenor</em></td><td>شب‌پره فیل صورتی</td><td>❌</td></tr>
          <tr class="species-row"><td>21</td><td><em>Dicranura ulmi</em></td><td>شب‌پره دمدار نارون</td><td>❌</td></tr>
          <tr class="species-row"><td>22</td><td><em>Dicycla oo</em></td><td>شب‌پره حرف یونانی</td><td>❌</td></tr>
          <tr class="species-row"><td>23</td><td><em>Dinoptera collaris</em></td><td>سوسک شاخدار کوچک</td><td>❌</td></tr>
          <tr class="species-row"><td>24</td><td><em>Diprion pini</em></td><td>زنبور اره‌ای کاج</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>25</td><td><em>Epicometis hirta</em></td><td>سوسک گل‌خوار</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>26</td><td><em>Euproctis chrysorrhoea</em></td><td>شب‌پره قهوه‌ای دم‌طلایی</td><td class="dangerous">⚠️ حساسیت‌زا</td></tr>
          <tr class="species-row"><td>27</td><td><em>Gypsonoma aceriana</em></td><td>بید جوانه‌خوار افرا</td><td>❌</td></tr>
          <tr class="species-row"><td>28</td><td><em>Harpyia milhauseri</em></td><td>شب‌پره هارپی</td><td>❌</td></tr>
          <tr class="species-row"><td>29</td><td><em>Hesperophanes sericeus</em></td><td>سوسک شاخدار ابریشمی</td><td>❌</td></tr>
          <tr class="species-row"><td>30</td><td><em>Hyles lineata</em></td><td>شب‌پره خط‌دار</td><td>❌</td></tr>
          <tr class="species-row"><td>31</td><td><em>Hylesinus varius</em></td><td>سوسک پوست‌خوار زبان‌گنجشک</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>32</td><td><em>Lachnus roboris</em></td><td>شته بلوط</td><td>❌</td></tr>
          <tr class="species-row"><td>33</td><td><em>Lampetis mimosa</em></td><td>سوسک جواهری</td><td>❌</td></tr>
          <tr class="species-row"><td>34</td><td><em>Lyctus brunneus</em></td><td>سوسک پودرچوب</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>35</td><td><em>Macroglossum stellatarum</em></td><td>شب‌پره بال‌شفاف</td><td>❌</td></tr>
          <tr class="species-row"><td>36</td><td><em>Metamasius hemipterus</em></td><td>خرطومی نیشکر</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>37</td><td><em>Nezara viridula</em></td><td>سن سبز</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>38</td><td><em>Nycteola asiatica</em></td><td>شب‌پره آسیایی</td><td>❌</td></tr>
          <tr class="species-row"><td>39</td><td><em>Opodiphthera astrophela</em></td><td>پروانه ابریشمی استرالیایی</td><td>❌</td></tr>
          <tr class="species-row"><td>40</td><td><em>Opodiphthera eucalypti</em></td><td>پروانه ابریشمی اکالیپتوس</td><td>❌</td></tr>
          <tr class="species-row"><td>41</td><td><em>Osphranteria coerulescens</em></td><td>سوسک چوب آبی</td><td>❌</td></tr>
          <tr class="species-row"><td>42</td><td><em>Otiorhynchus sulcatus</em></td><td>خرطومی شیاردار</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>43</td><td><em>Palpita unionalis</em></td><td>بید یاس</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>44</td><td><em>Papilio glaucus</em></td><td>پروانه دم‌چلچله‌ای زرد</td><td>❌</td></tr>
          <tr class="species-row"><td>45</td><td><em>Platypus cylindrus</em></td><td>سوسک پلاتیپوس</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>46</td><td><em>Psalmocharias alhageos</em></td><td>زنجره خرخر</td><td>❌</td></tr>
          <tr class="species-row"><td>47</td><td><em>Rhagoletis pomonella</em></td><td>مگس سیب</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>48</td><td><em>Saturnia pavonia</em></td><td>پروانه ابریشمی کوچک</td><td>❌</td></tr>
          <tr class="species-row"><td>49</td><td><em>Schinia arcigera</em></td><td>شب‌پره گل‌خوار</td><td>❌</td></tr>
          <tr class="species-row"><td>50</td><td><em>Sirex noctilio</em></td><td>زنبور چوب‌خوار کاج</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>51</td><td><em>Smerinthus ocellata</em></td><td>شب‌پره چشم‌دار</td><td>❌</td></tr>
          <tr class="species-row"><td>52</td><td><em>Sphrageidus similis</em></td><td>شب‌پره شبیه</td><td>❌</td></tr>
          <tr class="species-row"><td>53</td><td><em>Spodoptera exigua</em></td><td>کرم برگ‌خوار چغندر</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>54</td><td><em>Spoladea recurvalis</em></td><td>بید برگ‌خوار</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>55</td><td><em>Stromatium auratum</em></td><td>سوسک شاخدار طلایی</td><td>❌</td></tr>
          <tr class="species-row"><td>56</td><td><em>Synanthedon pyri</em></td><td>بید شاخه‌خوار گلابی</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>57</td><td><em>Tabanus atratus</em></td><td>مگس اسب سیاه</td><td class="dangerous">⚠️ نیش‌زن</td></tr>
          <tr class="species-row"><td>58</td><td><em>Tortrix viridana</em></td><td>بید سبز بلوط</td><td>❌</td></tr>
          <tr class="species-row"><td>59</td><td><em>Tyria jacobaeae</em></td><td>شب‌پره کرمی جاکوبیا</td><td>❌</td></tr>
          <tr class="species-row"><td>60</td><td><em>Tyria jacobaeae</em> (Adult)</td><td>شب‌پره کرمی جاکوبیا (بالغ)</td><td>❌</td></tr>
          <tr class="species-row"><td>61</td><td><em>Vanessa atalanta</em></td><td>پروانه آتالانتا</td><td>❌</td></tr>
          <tr class="species-row"><td>62</td><td><em>Vespa crabro</em></td><td>زنبور سرخ اروپایی</td><td class="dangerous">⚠️ نیش‌زن</td></tr>
          <tr class="species-row"><td>63</td><td><em>Vespula maculifrons</em></td><td>زنبور زرد پیشانی‌خال‌دار</td><td class="dangerous">⚠️ نیش‌زن</td></tr>
          <tr class="species-row"><td>64</td><td><em>Xanthogaleruca luteola</em></td><td>سوسک برگ‌خوار نارون</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>65</td><td><em>Xylocopa valga</em></td><td>زنبور نجار</td><td>✅ گرده‌افشان</td></tr>
          <tr class="species-row"><td>66</td><td><em>Yponomeuta padella</em></td><td>بید تارتن ارغوانی</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>67</td><td><em>Yponomeuta padella</em> (Larve)</td><td>لارو بید تارتن ارغوانی</td><td class="dangerous">⚠️ آفت</td></tr>
          <tr class="species-row"><td>68</td><td><em>Zeuzera pyrina</em></td><td>بید چوب‌خوار</td><td class="dangerous">⚠️ آفت</td></tr>
        </tbody>
      </table>
    </div>
    
    <p style="margin-top: 15px; font-size: 14px; color: var(--muted);">
      <strong>راهنمای وضعیت:</strong><br>
      <span class="badge badge-danger">⚠️ آفت</span> گونه آفت یا خطرناک • 
      <span class="badge badge-success">✅ مفید</span> گونه مفید (کنترل بیولوژیک/گرده‌افشانی) • 
      <span class="badge badge-primary">❌</span> گونه خنثی/زیبایی‌شناختی
    </p>
  </section>

  <!-- Classification -->
  <section id="classification" class="card">
    <div class="card-header">
      <span class="card-icon">🧬</span>
      <h2 style="margin: 0;">دسته‌بندی علمی بر اساس خانواده</h2>
    </div>
    
    <h3>🦋 راسته پروانه‌سانان (Lepidoptera) - ۳۵ گونه (۵۰.۷٪)</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>خانواده</th><th>نام فارسی</th><th>کلاس‌ها</th></tr></thead>
        <tbody>
          <tr><td>Sphingidae</td><td>شب‌پره‌های اسپفنگس</td><td>0, 1, 20, 30, 35, 51</td></tr>
          <tr><td>Saturniidae</td><td>پروانه‌های ابریشمی</td><td>9, 10, 11, 39, 40, 48</td></tr>
          <tr><td>Nymphalidae</td><td>فرچه‌پایان</td><td>19, 61</td></tr>
          <tr><td>Papilionidae</td><td>پروانه‌های دم‌چلچله‌ای</td><td>44</td></tr>
          <tr><td>Erebidae</td><td>خرس‌ها و ارکتیینا</td><td>6, 7, 8, 26, 59, 60</td></tr>
          <tr><td>Noctuidae</td><td>شب‌پره‌های جغد</td><td>22, 49, 53</td></tr>
          <tr><td>Geometridae</td><td>شب‌پره‌های هندسی</td><td>12</td></tr>
          <tr><td>Tortricidae</td><td>بیدهای پیچ‌پیچ</td><td>17, 18, 27, 58</td></tr>
          <tr><td>Gelechiidae</td><td>بیدهای کوچک</td><td>4</td></tr>
          <tr><td>Notodontidae</td><td>شب‌پره‌های دندان‌دار</td><td>21, 28</td></tr>
          <tr><td>Nolidae</td><td>بیدهای نو</td><td>38</td></tr>
          <tr><td>Crambidae</td><td>علف‌بیدان</td><td>43, 54</td></tr>
          <tr><td>Sesiidae</td><td>بیدهای شیشه‌بال</td><td>56</td></tr>
          <tr><td>Yponomeutidae</td><td>بیدهای ارمنی</td><td>66, 67</td></tr>
          <tr><td>Cossidae</td><td>بیدهای چوب‌خوار</td><td>68</td></tr>
          <tr><td>Lymantriidae</td><td>شب‌پره‌های کاکلی</td><td>52</td></tr>
        </tbody>
      </table>
    </div>
    
    <h3>🪲 راسته سوسک‌سانان (Coleoptera) - ۱۸ گونه (۲۶.۱٪)</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>خانواده</th><th>نام فارسی</th><th>کلاس‌ها</th></tr></thead>
        <tbody>
          <tr><td>Cerambycidae</td><td>سوسک‌های شاخدار</td><td>5, 13, 23, 29, 41, 55</td></tr>
          <tr><td>Curculionidae</td><td>سوسک‌های خرطومی</td><td>16, 31, 36, 42, 45</td></tr>
          <tr><td>Buprestidae</td><td>سوسک‌های جواهری</td><td>3, 33</td></tr>
          <tr><td>Scarabaeidae</td><td>سوسک‌های اسکاراب</td><td>25</td></tr>
          <tr><td>Coccinellidae</td><td>کفشدوزک‌ها</td><td>15</td></tr>
          <tr><td>Chrysomelidae</td><td>سوسک‌های برگ‌خوار</td><td>64</td></tr>
          <tr><td>Bostrichidae</td><td>سوسک‌های پودرچوب</td><td>34</td></tr>
        </tbody>
      </table>
    </div>
    
    <h3>🐝 راسته پرده‌بالان (Hymenoptera) - ۵ گونه (۷.۲٪)</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>خانواده</th><th>نام فارسی</th><th>کلاس‌ها</th></tr></thead>
        <tbody>
          <tr><td>Vespidae</td><td>زنبورهای واقعی</td><td>62, 63</td></tr>
          <tr><td>Apidae</td><td>زنبورهای عسل</td><td>65</td></tr>
          <tr><td>Siricidae</td><td>زنبورهای چوب</td><td>50</td></tr>
          <tr><td>Diprionidae</td><td>زنبورهای اره‌ای</td><td>24</td></tr>
          <tr><td>Tenthredinidae</td><td>زنبورهای اره‌ای برگ‌خوار</td><td>14</td></tr>
        </tbody>
      </table>
    </div>
    
    <h3>🪰 راسته دوبالان (Diptera) - ۲ گونه (۲.۹٪)</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>خانواده</th><th>نام فارسی</th><th>کلاس‌ها</th></tr></thead>
        <tbody>
          <tr><td>Tabanidae</td><td>مگس‌های اسب</td><td>57</td></tr>
          <tr><td>Tephritidae</td><td>مگس‌های میوه</td><td>47</td></tr>
        </tbody>
      </table>
    </div>
    
    <h3>🐛 راسته نیم‌بالان (Hemiptera) - ۳ گونه (۴.۳٪)</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>خانواده</th><th>نام فارسی</th><th>کلاس‌ها</th></tr></thead>
        <tbody>
          <tr><td>Pentatomidae</td><td>سن‌های سپردار</td><td>2, 37</td></tr>
          <tr><td>Aphididae</td><td>شته‌ها</td><td>32</td></tr>
          <tr><td>Cicadidae</td><td>زنجره‌ها</td><td>46</td></tr>
        </tbody>
      </table>
    </div>
    
    <h3>📊 آمار کلی</h3>
    <div class="table-responsive">
      <table>
        <thead><tr><th>دسته</th><th>تعداد</th><th>درصد</th></tr></thead>
        <tbody>
          <tr><td>🦋 پروانه‌ها و شب‌پره‌ها</td><td>35</td><td>50.7%</td></tr>
          <tr><td>🪲 سوسک‌ها</td><td>18</td><td>26.1%</td></tr>
          <tr><td>🐝 زنبورها</td><td>5</td><td>7.2%</td></tr>
          <tr><td>🪰 مگس‌ها</td><td>2</td><td>2.9%</td></tr>
          <tr><td>🐛 سن‌ها و شته‌ها</td><td>3</td><td>4.3%</td></tr>
          <tr><td>🦗 سایر</td><td>6</td><td>8.7%</td></tr>
          <tr style="font-weight: bold; background: #f1f5f9;"><td>مجموع</td><td>69</td><td>100%</td></tr>
        </tbody>
      </table>
    </div>
  </section>

  <!-- Dangerous Species -->
  <section id="dangerous" class="card">
    <div class="card-header">
      <span class="card-icon">⚠️</span>
      <h2 style="margin: 0;">حشرات خطرناک</h2>
    </div>
    
    <div class="alert alert-danger">
      <strong>۲۷ گونه از ۶۹ گونه قابل تشخیص، به‌عنوان خطرناک یا آفت طبقه‌بندی شده‌اند:</strong>
    </div>
    
    <h3>🐛 آفات مهم کشاورزی و جنگل</h3>
    <ul>
      <li><em>Acrosternum millierei</em> - سن سبز مدیترانه‌ای</li>
      <li><em>Anarsia lineatella</em> - بید شاخه‌خوار هلو</li>
      <li><em>Anoplophora chinensis</em> - سوسک شاخدار بلند آسیایی (قرنطینه‌ای)</li>
      <li><em>Cydia pomonella</em> - کرم سیب</li>
      <li><em>Diprion pini</em> - زنبور اره‌ای کاج</li>
      <li><em>Euproctis chrysorrhoea</em> - شب‌پره قهوه‌ای دم‌طلایی (حساسیت‌زا)</li>
      <li><em>Lyctus brunneus</em> - سوسک پودرچوب</li>
      <li><em>Nezara viridula</em> - سن سبز</li>
      <li><em>Otiorhynchus sulcatus</em> - خرطومی شیاردار</li>
      <li><em>Palpita unionalis</em> - بید یاس</li>
      <li><em>Platypus cylindrus</em> - سوسک پلاتیپوس</li>
      <li><em>Rhagoletis pomonella</em> - مگس سیب</li>
      <li><em>Sirex noctilio</em> - زنبور چوب‌خوار کاج</li>
      <li><em>Spodoptera exigua</em> - کرم برگ‌خوار چغندر</li>
      <li><em>Synanthedon pyri</em> - بید شاخه‌خوار گلابی</li>
      <li><em>Xanthogaleruca luteola</em> - سوسک برگ‌خوار نارون</li>
      <li><em>Zeuzera pyrina</em> - بید چوب‌خوار</li>
    </ul>
    
    <h3>🐝 حشرات نیش‌زن</h3>
    <ul>
      <li><em>Vespa crabro</em> - زنبور سرخ اروپایی</li>
      <li><em>Vespula maculifrons</em> - زنبور زرد پیشانی‌خال‌دار</li>
      <li><em>Tabanus atratus</em> - مگس اسب سیاه</li>
    </ul>
    
    <h3>🔬 سایر گونه‌های مهم</h3>
    <ul>
      <li><em>Agrilus hastulifer</em> - سوسک شاخدار باریک</li>
      <li><em>Epicometis hirta</em> - سوسک گل‌خوار</li>
      <li><em>Hylesinus varius</em> - سوسک پوست‌خوار زبان‌گنجشک</li>
      <li><em>Metamasius hemipterus</em> - خرطومی نیشکر</li>
      <li><em>Spoladea recurvalis</em> - بید برگ‌خوار</li>
      <li><em>Yponomeuta padella</em> - بید تارتن ارغوانی</li>
      <li><em>Yponomeuta padella</em> (Larve) - لارو بید تارتن ارغوانی</li>
    </ul>
  </section>

  <!-- Technologies -->
  <section id="tech" class="card">
    <div class="card-header">
      <span class="card-icon">🛠️</span>
      <h2 style="margin: 0;">تکنولوژی‌های استفاده‌شده</h2>
    </div>
    
    <div class="table-responsive">
      <table>
        <thead><tr><th>تکنولوژی</th><th>نسخه</th><th>کاربرد</th></tr></thead>
        <tbody>
          <tr><td>Kotlin</td><td>1.9.22</td><td>زبان برنامه‌نویسی اصلی اپلیکیشن</td></tr>
          <tr><td>YOLOv26_n</td><td>Latest</td><td>مدل تشخیص شیء با معماری بهینه‌شده برای لبه</td></tr>
          <tr><td>TensorFlow Lite</td><td>2.14.0</td><td>اجرای مدل روی موبایل با کوانتیزاسیون INT8</td></tr>
          <tr><td>CameraX</td><td>1.3.1</td><td>مدیریت دوربین و پردازش تصویر بلادرنگ</td></tr>
          <tr><td>Google Play Services</td><td>21.0.1</td><td>دریافت موقعیت GPS با دقت بالا</td></tr>
          <tr><td>Material Design</td><td>1.11.0</td><td>رابط کاربری مدرن و سازگار با RTL</td></tr>
          <tr><td>OkHttp</td><td>4.12.0</td><td>ارتباط امن با سرور ابری (HTTPS)</td></tr>
          <tr><td>FastAPI</td><td>0.104.1</td><td>فریم‌ورک سرور ابری با پشتیبانی از Async</td></tr>
          <tr><td>Supabase</td><td>2.3.4</td><td>پایگاه داده ابری PostgreSQL + Storage</td></tr>
          <tr><td>Hugging Face Spaces</td><td>-</td><td>میزبانی رایگان سرور با Docker</td></tr>
          <tr><td>Chart.js + Leaflet</td><td>Latest</td><td>نمودارها و نقشه تعاملی در داشبورد</td></tr>
        </tbody>
      </table>
    </div>
  </section>

  <!-- Server Architecture -->
  <section id="server" class="card">
    <div class="card-header">
      <span class="card-icon">☁️</span>
      <h2 style="margin: 0;">معماری سرور و داشبورد</h2>
    </div>
    
    <div class="alert alert-success">
      <strong>✅ وضعیت سرور:</strong> فعال و متصل به Supabase<br>
      <code>https://touraj732-insect-detector-server.hf.space</code>
    </div>
    
    <h3>🏗️ دیاگرام معماری</h3>
    <pre style="font-size: 12px; line-height: 1.5;">
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
    </pre>
    
    <h3>🗄️ ساختار جدول detections در Supabase</h3>
    <pre>
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
    </pre>
    
    <h3>🌐 لینک‌های مهم</h3>
    <ul>
      <li>🏠 داشبورد اصلی: <a href="https://touraj732-insect-detector-server.hf.space" target="_blank">https://touraj732-insect-detector-server.hf.space</a></li>
      <li>🗺️ نقشه پراکندگی: <a href="https://touraj732-insect-detector-server.hf.space/map" target="_blank">/map</a></li>
      <li>🔬 تحلیل‌های پیشرفته: <a href="https://touraj732-insect-detector-server.hf.space/analytics" target="_blank">/analytics</a></li>
      <li>🩺 بررسی سلامت سرور: <a href="https://touraj732-insect-detector-server.hf.space/health" target="_blank">/health</a></li>
      <li>📚 مستندات API: <a href="https://touraj732-insect-detector-server.hf.space/docs" target="_blank">/docs</a></li>
    </ul>
  </section>

  <!-- Project Structure -->
  <section id="structure" class="card">
    <div class="card-header">
      <span class="card-icon">📁</span>
      <h2 style="margin: 0;">ساختار پروژه</h2>
    </div>
    
    <pre>
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
│   │       └── analytics.html               ← تحلیل‌های پیشرفته (تنوع زیستی، هم‌رخدادی)
│   ├── requirements.txt                     ← وابستگی‌های Python
│   ├── Dockerfile                           ← پیکربندی استقرار در Hugging Face
│   └── README.md                            ← مستندات سرور
│
├── .github/
│   └── workflows/
│       └── android.yml                      ← CI/CD: Build, Test, Release APK
│
├── build.gradle.kts                         ← پیکربندی Gradle (dependencies, plugins)
├── settings.gradle.kts                      ← تنظیمات پروژه و ماژول‌ها
├── gradle.properties                        ← ویژگی‌های Gradle و JVM
├── README.md                                ← این فایل مستندات
└── .gitignore                               ← فایل‌های نادیده گرفته‌شده در Git
    </pre>
  </section>

  <!-- Future Plans -->
  <section id="future" class="card">
    <div class="card-header">
      <span class="card-icon">🔮</span>
      <h2 style="margin: 0;">برنامه‌های آینده</h2>
    </div>
    
    <h3>🚀 نسخه 2.0 (در حال توسعه)</h3>
    <ul>
      <li>🌐 اتصال به سرور مرکزی برای انتقال خودکار داده‌ها ✅ <em>(انجام شد)</em></li>
      <li>📊 داشبورد پایش آفات تحت وب برای تحلیل داده‌ها ✅ <em>(انجام شد)</em></li>
      <li>🗺️ نقشه پراکندگی حشرات بر اساس GPS با Heatmap ✅ <em>(انجام شد)</em></li>
      <li>📈 آمار و نمودارهای زمانی تشخیص‌ها ✅ <em>(انجام شد)</em></li>
      <li>🔔 هشدار طغیان آفات بر اساس داده‌های جمع‌آوری‌شده ✅ <em>(انجام شد)</em></li>
      <li>🔐 احراز هویت کاربر برای تفکیک داده‌های پژوهشگران</li>
      <li>📱 نوتیفیکیشن Push برای هشدارهای فوری</li>
    </ul>
    
    <h3>🔬 نسخه 3.0 (برنامه‌ریزی)</h3>
    <ul>
      <li>🔍 افزایش تعداد گونه‌های قابل تشخیص به بیش از 200 گونه</li>
      <li>🌿 افزودن اطلاعات گیاهان میزبان و علائم آسیب برای هر گونه</li>
      <li>💊 پیشنهاد روش‌های مبارزه بیولوژیک و شیمیایی بر اساس گونه تشخیص داده شده</li>
      <li>📱 نسخه iOS اپلیکیشن با SwiftUI</li>
      <li>🌍 پشتیبانی چندزبانه (انگلیسی، عربی) برای استفاده منطقه‌ای</li>
      <li>🤖 افزودن مدل طبقه‌بندی لارو vs بالغ برای گونه‌های دو مرحله‌ای</li>
      <li>📡 یکپارچه‌سازی با سنسورهای IoT برای پایش خودکار در تله‌های هوشمند</li>
    </ul>
    
    <h3>🤝 همکاری و یکپارچه‌سازی</h3>
    <ul>
      <li>🎓 همکاری با دانشگاه‌ها برای بهبود مدل با داده‌های بیشتر و متنوع‌تر</li>
      <li>🏛️ یکپارچه‌سازی با سامانه‌های سازمان جنگل‌ها، مراتع و آبخیزداری</li>
      <li>🌐 انتشار API عمومی برای توسعه‌دهندگان شخص ثالث</li>
      <li>📊 اتصال به سامانه‌های ملی پایش تنوع زیستی ایران</li>
    </ul>
  </section>

  <!-- Data Transfer -->
  <section class="card">
    <h3>📤 انتقال داده‌ها به کامپیوتر</h3>
    
    <h4>با استفاده از ADB:</h4>
    <pre># کپی کل پوشه داده‌ها به کامپیوتر
adb pull /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/ C:\InsectRecords\

# کپی فقط فایل CSV
adb pull /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv C:\

# مشاهده محتوای CSV در ترمینال
adb shell cat /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv</pre>
    
    <h4>دستورات مفید برای مدیریت داده‌ها:</h4>
    <pre># شمارش تعداد تصاویر ذخیره‌شده
adb shell find /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/ -name "*.jpg" | wc -l

# مشاهده حجم کل پوشه داده‌ها
adb shell du -sh /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/

# مشاهده 10 رکورد آخر فایل CSV
adb shell tail -n 10 /sdcard/Android/data/com.example.insectdetector/files/InsectRecords/records.csv

# پاک کردن کش پس از همگام‌سازی موفق
adb shell rm -rf /sdcard/Android/data/com.example.insectdetector/cache/*</pre>
  </section>

  <!-- Contribution -->
  <section class="card">
    <h3>🤝 مشارکت در توسعه</h3>
    <p>ما از پیشنهادات، گزارش مشکلات و همکاری شما استقبال می‌کنیم!</p>
    
    <ul>
      <li>🐛 <strong>گزارش مشکل:</strong> اگر با خطا یا باگی مواجه شدید، لطفاً در بخش <a href="#">Issues</a> گزارش دهید.</li>
      <li>💡 <strong>پیشنهاد ویژگی:</strong> برای ایده‌های جدید، از بخش <a href="#">Discussions</a> استفاده کنید.</li>
      <li>🔀 <strong>Pull Request:</strong> برای مشارکت در توسعه کد:
        <ol>
          <li>Fork از مخزن اصلی</li>
          <li>ایجاد Branch جدید: <code>git checkout -b feature/AmazingFeature</code></li>
          <li>Commit تغییرات: <code>git commit -m 'Add some AmazingFeature'</code></li>
          <li>Push به Branch: <code>git push origin feature/AmazingFeature</code></li>
          <li>باز کردن Pull Request در GitHub</li>
        </ol>
      </li>
    </ul>
  </section>

  <!-- License -->
  <section class="card">
    <h3>📄 لایسنس</h3>
    <p>این پروژه تحت <strong>لایسنس اختصاصی مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی استان چهارمحال و بختیاری</strong> منتشر شده است.</p>
    
    <div class="alert alert-warning">
      <strong>⚠️ توجه:</strong> استفاده تجاری از این اپلیکیشن، مدل YOLOv26_n و داده‌های جمع‌آوری‌شده بدون اجازه کتبی از توسعه‌دهنده ممنوع است. استفاده پژوهشی و غیرتجاری با ذکر منبع بلامانع است.
    </div>
  </section>

  <!-- Support -->
  <section id="support" class="card">
    <div class="card-header">
      <span class="card-icon">📞</span>
      <h2 style="margin: 0;">پشتیبانی و تماس</h2>
    </div>
    
    <p>برای ارتباط با تیم توسعه و گزارش مشکلات:</p>
    
    <div class="table-responsive">
      <table>
        <tbody>
          <tr><td>📧 ایمیل:</td><td><a href="mailto:mokhtarpour.touraj@gmail.com">mokhtarpour.touraj@gmail.com</a></td></tr>
          <tr><td>🌐 GitHub:</td><td><a href="https://github.com/tourajmokhtarpour" target="_blank">@tourajmokhtarpour</a></td></tr>
          <tr><td>🐛 Issues:</td><td><a href="#">گزارش مشکل در GitHub</a></td></tr>
          <tr><td>💬 Discussions:</td><td><a href="#">پیشنهاد ویژگی در GitHub</a></td></tr>
        </tbody>
      </table>
    </div>
    
    <div class="alert alert-info">
      <strong>یادآوری:</strong> برای سوالات علمی، پژوهشی و تخصصی در حوزه حشره‌شناسی و پایش آفات، لطفاً مستقیماً با توسعه‌دهنده اصلی تماس بگیرید.
    </div>
  </section>

  <!-- Developer -->
  <section id="developer" class="card">
    <div class="card-header">
      <span class="card-icon">👨‍🔬</span>
      <h2 style="margin: 0;">توسعه‌دهنده</h2>
    </div>
    
    <div style="text-align: center; padding: 20px; background: #f8fafc; border-radius: 12px;">
      <h3 style="margin-bottom: 10px;">Touraj Mokhtarpour</h3>
      <p style="font-size: 1.1rem; color: var(--primary);"><strong>تورج مختارپور</strong></p>
      <p style="color: var(--muted);">پژوهشگر بخش تحقیقات جنگل و مرتع</p>
      
      <div style="margin: 15px 0; padding: 10px; background: white; border-radius: 8px; display: inline-block;">
        <p style="margin: 5px 0;">🏛️ <strong>مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی</strong></p>
        <p style="margin: 5px 0;">استان چهارمحال و بختیاری، ایران</p>
      </div>
      
      <div style="margin-top: 15px;">
        <a href="mailto:mokhtarpour.touraj@gmail.com" class="badge badge-primary">📧 ایمیل</a>
        <a href="https://github.com/tourajmokhtarpour" target="_blank" class="badge badge-accent">🌐 GitHub</a>
      </div>
    </div>
  </section>

  <!-- Acknowledgments -->
  <section class="card">
    <h3>🙏 تقدیر و تشکر</h3>
    <p>با تشکر ویژه از:</p>
    <ul>
      <li>کلیه همکاران پژوهشی مرکز تحقیقات چهارمحال و بختیاری که در جمع‌آوری داده‌های میدانی مشارکت داشتند</li>
      <li>جنگل‌بانان و محیط‌بانان عزیز استان که با آزمایش اپلیکیشن در عرصه‌های طبیعی، به بهبود آن کمک کردند</li>
      <li>توسعه‌دهندگان جامعه متن‌باز YOLO، TensorFlow و FastAPI که زیرساخت‌های این پروژه را فراهم ساختند</li>
      <li>سازمان جنگل‌ها، مراتع و آبخیزداری کشور برای حمایت از پژوهش‌های کاربردی در حوزه پایش آفات</li>
    </ul>
  </section>

  <!-- Footer -->
  <footer>
    <p>⭐ اگر این پروژه برایتان مفید بود، یک ستاره به مخزن GitHub بدهید! ⭐</p>
    <p style="margin-top: 15px; font-weight: 600;">🐛 Insect Detector © 2026</p>
    <p>مرکز تحقیقات و آموزش کشاورزی و منابع طبیعی استان چهارمحال و بختیاری</p>
    <p style="margin-top: 10px; font-size: 13px; color: var(--muted);">
      آخرین به‌روزرسانی: <time datetime="2026-07-02">۲ مرداد ۱۴۰۵</time> • 
      نسخه اپلیکیشن: <strong>1.2.0</strong> • 
      وضعیت سرور: <span class="badge badge-success">✅ فعال</span>
    </p>
  </footer>

</body>
</html>
