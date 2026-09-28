package com.example.plantdetector.data

import com.example.plantdetector.detector.PlantInfo

/**
 * 🌱 پایگاه داده گونه‌های گیاهی استان چهارمحال و بختیاری
 * تولید شده در تاریخ: 2026-09-26 08:56
 * تعداد گونه‌ها: 151
 */
object PlantDatabase {
    fun getInfo(className: String): PlantInfo {
        return when (className) {

            // ═══════════════════════════════════════════
            // Fabaceae (باقلائیان)
            // ═══════════════════════════════════════════
            "Astragalus_albispinus" -> PlantInfo(
                name = "گون سفیدخار",
                scientificName = "Astragalus albispinus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای خاردار از جنس گون با اندام‌های پوشیده از کرک و خارهای سفید که در رویشگاه‌های خشک کوهستانی می‌روید.",
                habitat = "دامنه‌ها و ارتفاعات خشک زاگرس در چهارمحال و بختیاری، به‌ویژه مراتع سنگلاخی و شیب‌های آهکی",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "جنس Astragalus یکی از بزرگ‌ترین جنس‌های گیاهی جهان است و ایران یکی از مراکز مهم تنوع آن به‌شمار می‌رود."
            )

            "Astragalus_angustiflorus" -> PlantInfo(
                name = "گون بارگل",
                scientificName = "Astragalus angustiflorus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله از گون‌ها با برگچه‌های باریک و گل‌آذین‌های نسبتاً متراکم که در زیستگاه‌های کوهستانی رشد می‌کند.",
                habitat = "مراتع کوهستانی و دامنه‌های سنگلاخی زاگرس در ارتفاعات چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "باریک بودن برگچه‌ها از ویژگی‌های ریخت‌شناختی قابل توجه این گروه از گون‌هاست."
            )

            "Astragalus_argyrostachys" -> PlantInfo(
                name = "گون نقره‌ای",
                scientificName = "Astragalus argyrostachys",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای بوته‌ای از گون با پوشش کرکی و ظاهر نقره‌ای که با شرایط خشک و سرد مناطق مرتفع سازگار است.",
                habitat = "دامنه‌ها و مراتع مرتفع زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش متراکم کرک‌های سفید می‌تواند بازتاب نور و کاهش اتلاف آب از سطح اندام‌های هوایی را افزایش دهد."
            )

            "Astragalus_asterias" -> PlantInfo(
                name = "گون ستاره‌ای",
                scientificName = "Astragalus asterias",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای از گون‌های کوهستانی با گل‌آذین مشخص و اندام‌های سازگار با زیستگاه‌های خشک و سنگلاخی.",
                habitat = "ارتفاعات سنگلاخی و مراتع خشک زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام گونه asterias از واژه‌ای با معنای ستاره‌ای گرفته شده و به ویژگی ظاهری گیاه اشاره دارد."
            )

            "Astragalus_campylanthus" -> PlantInfo(
                name = "گون خمیده‌گل",
                scientificName = "Astragalus campylanthus",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله‌ای با اندام‌های کرک‌دار و گل‌آذین‌های متراکم که در نواحی مرتفع و نیمه‌خشک زاگرس دیده می‌شود.",
                habitat = "مراتع مرتفع، دامنه‌های سنگلاخی و شیب‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بسیاری از گونه‌های گون به‌دلیل ساختار خاردار یا بالشتکی در برابر چرای دام سازگاری نسبی دارند."
            )

            "Astragalus_campylorhynchus" -> PlantInfo(
                name = "گون منقارخمیده",
                scientificName = "Astragalus campylorhynchus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای کوهستانی از جنس گون با ویژگی‌های میوه‌ای و اندامی متمایز که در مراتع خشک زاگرس رشد می‌کند.",
                habitat = "شیب‌های خشک و سنگلاخی و مراتع کوهستانی چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام campylorhynchus به معنای منقار خمیده است و به شکل مشخص بخشی از میوه یا اندام تولیدمثلی اشاره دارد."
            )

            "Astragalus_caragana" -> PlantInfo(
                name = "گون کاراگانا",
                scientificName = "Astragalus caragana",
                family = "Fabaceae (باقلائیان)",
                description = "گون بوته‌ای چندساله با شاخه‌های نسبتاً متراکم که در نواحی خشک و سرد کوهستانی پراکنش دارد.",
                habitat = "دامنه‌های خشک و ارتفاعات زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برخی گون‌های بوته‌ای در تثبیت خاک دامنه‌های فرسایش‌پذیر زاگرس نقش اکولوژیک دارند."
            )

            "Astragalus_cephalanthus" -> PlantInfo(
                name = "گون سرگل",
                scientificName = "Astragalus cephalanthus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله با گل‌آذین‌های متراکم و تقریباً کروی که در مراتع و دامنه‌های کوهستانی رشد می‌کند.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ساختار متراکم گل‌آذین در بسیاری از گون‌ها تشخیص میدانی گیاه را آسان‌تر می‌کند."
            )

            "Astragalus_cyclophyllon" -> PlantInfo(
                name = "گون برگ‌گرد",
                scientificName = "Astragalus cyclophyllon",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله‌ای با برگچه‌های نسبتاً گرد و اندام‌های سازگار با شرایط سرد و نیمه‌خشک ارتفاعات.",
                habitat = "مراتع کوهستانی و شیب‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شکل برگچه‌ها در کلیدهای شناسایی گونه‌های Astragalus یکی از صفات مهم تشخیصی است."
            )

            "Astragalus_ebenoides" -> PlantInfo(
                name = "گون آبنوسی",
                scientificName = "Astragalus ebenoides",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای از گون‌های بومی رویشگاه‌های کوهستانی با اندام‌های چندساله و سازگاری با خاک‌های کم‌عمق.",
                habitat = "دامنه‌ها و ارتفاعات سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های بومی گون در بسیاری از مراتع زاگرس بخشی از پوشش گیاهی طبیعی و علوفه‌ای را تشکیل می‌دهند."
            )

            "Astragalus_effesus" -> PlantInfo(
                name = "گون افسس",
                scientificName = "Astragalus effesus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله از گون‌ها با رویش بوته‌ای و سازگار با شرایط نیمه‌خشک و سنگلاخی مناطق کوهستانی.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "تنوع بالای گونه‌های Astragalus در زاگرس باعث شده این جنس از عناصر شاخص فلور ایران باشد."
            )

            "Astragalus_fasciculifolius" -> PlantInfo(
                name = "گون برگ‌دسته‌ای",
                scientificName = "Astragalus fasciculifolius",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله با برگچه‌های متراکم و اندام‌های هوایی نسبتاً فشرده که در زیستگاه‌های خشک کوهستانی می‌روید.",
                habitat = "شیب‌های خشک، سنگلاخی و مراتع مرتفع زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "تراکم برگچه‌ها و نحوه آرایش آن‌ها از صفات مفید در شناسایی گونه‌های نزدیک گون است."
            )

            "Astragalus_fragiferus" -> PlantInfo(
                name = "گون توت‌مانند",
                scientificName = "Astragalus fragiferus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای از گون با گل‌آذین و میوه‌های متمایز که در مناطق کوهستانی و مراتع خشک رشد می‌کند.",
                habitat = "مراتع و دامنه‌های سنگلاخی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام fragiferus به معنای توت‌دار یا توت‌مانند است و با ظاهر برخی ساختارهای میوه‌ای ارتباط دارد."
            )

            "Astragalus_gossypinus" -> PlantInfo(
                name = "گون گزی",
                scientificName = "Astragalus gossypinus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای شناخته‌شده از گون‌های کتیرازا با پوشش کرکی فراوان که در نواحی خشک و کوهستانی ایران می‌روید.",
                habitat = "دامنه‌های خشک و سنگلاخی زاگرس، به‌ویژه مناطق مرتفع چهارمحال و بختیاری",
                uses = "صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برخی گون‌های این گروه منبع کتیرا هستند؛ کتیرا صمغی گیاهی است که کاربردهای دارویی و صنعتی دارد."
            )

            "Astragalus_hamosus" -> PlantInfo(
                name = "گون قلابی",
                scientificName = "Astragalus hamosus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله تا چندساله با ساقه‌های نسبتاً خوابیده و غلاف‌های خمیده و قلاب‌مانند که در مراتع باز می‌روید.",
                habitat = "مراتع، حاشیه مزارع و دامنه‌های کم‌ارتفاع زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "غلاف‌های خمیده این گونه در انتشار بذر و چسبیدن به پوشش جانوران می‌توانند نقش داشته باشند."
            )

            "Astragalus_ibicinus" -> PlantInfo(
                name = "گون ایبیسینوس",
                scientificName = "Astragalus ibicinus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای از گون‌های کوهستانی با رشد بوته‌ای که در زیستگاه‌های خشک و سنگلاخی زاگرس یافت می‌شود.",
                habitat = "دامنه‌ها و مراتع سنگلاخی ارتفاعات چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های متعدد Astragalus در ایران پراکنش‌های جغرافیایی محدود و ارزش حفاظتی بالایی دارند."
            )

            "Astragalus_kirrindicus" -> PlantInfo(
                name = "گون کرند",
                scientificName = "Astragalus kirrindicus",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله‌ای با زیستگاه کوهستانی که در دامنه‌های خشک و سنگلاخی زاگرس مرکزی رشد می‌کند.",
                habitat = "مراتع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام بسیاری از گونه‌های گون در ایران با نام جغرافیایی محل کشف یا پراکنش اولیه آن‌ها ارتباط دارد."
            )

            "Astragalus_macrocephalus" -> PlantInfo(
                name = "گون درشت‌سر",
                scientificName = "Astragalus macrocephalus",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله با گل‌آذین‌های بزرگ و مشخص که در مراتع مرتفع و دامنه‌های سنگلاخی رشد می‌کند.",
                habitat = "ارتفاعات و مراتع کوهستانی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "اندازه نسبتاً بزرگ گل‌آذین یکی از صفات مهم برای تشخیص این گروه از گون‌هاست."
            )

            "Astragalus_macroplematus" -> PlantInfo(
                name = "گون ماکروپلماتوس",
                scientificName = "Astragalus macroplematus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله از گون‌های کوهستانی با پوشش گیاهی متراکم و سازگار با خاک‌های کم‌عمق زاگرس.",
                habitat = "دامنه‌های سنگلاخی و مراتع مرتفع چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گون‌ها در اکوسیستم‌های خشک زاگرس علاوه بر نقش پوششی، از طریق همزیستی ریشه‌ای به چرخه نیتروژن کمک می‌کنند."
            )

            "Astragalus_microcephalus" -> PlantInfo(
                name = "گون ریزسر",
                scientificName = "Astragalus microcephalus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای بوته‌ای با گل‌آذین‌های کوچک و متراکم که در مراتع خشک و ارتفاعات زاگرس دیده می‌شود.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بخش قابل توجهی از گونه‌های Astragalus ایران بوم‌زاد یا دارای پراکنش محدود منطقه‌ای هستند."
            )

            "Astragalus_oleifolius" -> PlantInfo(
                name = "گون برگ‌روغنی",
                scientificName = "Astragalus oleifolius",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله از گون‌های کوهستانی با برگ‌های مشخص و رشد سازگار با شرایط نیمه‌خشک ارتفاعات.",
                habitat = "مراتع خشک و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ویژگی‌های برگ و شکل برگچه‌ها در تفکیک گونه‌های بسیار نزدیک Astragalus اهمیت زیادی دارند."
            )

            "Astragalus_ovinus" -> PlantInfo(
                name = "گون گوسفندی",
                scientificName = "Astragalus ovinus",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله‌ای است که در مراتع کوهستانی رشد می‌کند و می‌تواند بخشی از پوشش طبیعی مرتعی زاگرس باشد.",
                habitat = "مراتع مرتفع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام گونه ovinus به گوسفند اشاره دارد و با ارتباط بوم‌شناختی گیاه با مراتع مرتبط دانسته می‌شود."
            )

            "Astragalus_oxyglottis" -> PlantInfo(
                name = "گون نوک‌تیز",
                scientificName = "Astragalus oxyglottis",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای علفی از گون با اندام‌های باریک و صفات میوه‌ای مشخص که در زیستگاه‌های باز کوهستانی می‌روید.",
                habitat = "مراتع و دامنه‌های خشک زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "صفات مربوط به شکل غلاف و نوک میوه از ویژگی‌های مهم برای شناسایی گونه‌های Astragalus هستند."
            )

            "Astragalus_podolobus" -> PlantInfo(
                name = "گون پودولوبوس",
                scientificName = "Astragalus podolobus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله از گون‌های کوهستانی که در خاک‌های سنگلاخی و شرایط نیمه‌خشک زاگرس سازگار است.",
                habitat = "دامنه‌ها و مراتع سنگلاخی ارتفاعات زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های خاردار گون می‌توانند با ایجاد ساختارهای دفاعی، فشار چرا را تا حدی کاهش دهند."
            )

            "Astragalus_rhodosemius" -> PlantInfo(
                name = "گون رودوسمیوس",
                scientificName = "Astragalus rhodosemius",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای کوهستانی از جنس گون با گل‌های رنگین و رشد چندساله در مراتع و دامنه‌های خشک.",
                habitat = "ارتفاعات و مراتع سنگلاخی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "رنگ گل در بسیاری از گونه‌های Astragalus یکی از صفات کمکی در شناسایی صحرایی است."
            )

            "Astragalus_sp" -> PlantInfo(
                name = "گون (شناسایی در سطح جنس)",
                scientificName = "Astragalus sp",
                family = "Fabaceae (باقلائیان)",
                description = "نمونه‌ای از جنس Astragalus که در داده موجود شناسایی آن تا سطح گونه قطعی نشده است و برای تعیین گونه به بررسی تخصصی نیاز دارد.",
                habitat = "مراتع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شناسایی قطعی گونه‌های گون گاهی به بررسی صفات میوه، کرک، کاسه گل و ساختار بذر نیاز دارد."
            )

            "Astragalus_teheranicus" -> PlantInfo(
                name = "گون تهرانی",
                scientificName = "Astragalus teheranicus",
                family = "Fabaceae (باقلائیان)",
                description = "گون چندساله‌ای با رشد بوته‌ای که در مناطق خشک و کوهستانی ایران و رویشگاه‌های زاگرسی یافت می‌شود.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام گونه teheranicus به تهران اشاره دارد و از نام‌های جغرافیایی در نام‌گذاری گیاهان است."
            )

            "Astragalus_verus" -> PlantInfo(
                name = "گون واقعی",
                scientificName = "Astragalus verus",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای از گون‌های کتیرازا با رشد بوته‌ای که به شرایط خشک و نیمه‌خشک کوهستانی سازگار است.",
                habitat = "دامنه‌های خشک و سنگلاخی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برخی گونه‌های گون منبع صمغ کتیرا هستند که به‌عنوان ماده هیدروکلوئیدی در صنایع مختلف کاربرد دارد."
            )

            "Coronilla_varia" -> PlantInfo(
                name = "شبدر تاجی",
                scientificName = "Coronilla varia",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله با گل‌های صورتی تا سفید و برگ‌های مرکب که در مراتع و حاشیه زیستگاه‌های باز رشد می‌کند.",
                habitat = "مراتع و دامنه‌های نیمه‌مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های این گیاه به‌صورت گل‌آذین چتری قرار می‌گیرند و به همین دلیل ظاهر تاج‌مانند دارند."
            )

            "Glycyrrhiza_glabra" -> PlantInfo(
                name = "شیرین‌بیان",
                scientificName = "Glycyrrhiza glabra",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله با ریشه‌های شیرین و ساقه‌های علفی که در خاک‌های عمیق و نسبتاً مرطوب رشد می‌کند.",
                habitat = "دشت‌ها، حاشیه رودخانه‌ها و دامنه‌های کم‌ارتفاع زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی، صنعتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "ترکیب اصلی ایجادکننده شیرینی ریشه شیرین‌بیان گلیسیریزین است که از ساکارز شیرین‌تر است."
            )

            "Lathyrus_aphaca" -> PlantInfo(
                name = "خلر بی‌برگ",
                scientificName = "Lathyrus aphaca",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله و علفی با برگ‌های تغییرشکل‌یافته به پیچک و گوشوارک‌های بزرگ که در مزارع و مراتع می‌روید.",
                habitat = "مزارع، حاشیه باغ‌ها و مراتع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "در این گونه برگک‌های واقعی کاهش یافته‌اند و بخش‌های شبیه برگ در واقع گوشوارک‌های بزرگ هستند."
            )

            "Lathyrus_cassius" -> PlantInfo(
                name = "خلر کاسیوس",
                scientificName = "Lathyrus cassius",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای علفی از جنس Lathyrus با ساقه‌های باریک و گل‌های پروانه‌آسا که در زیستگاه‌های باز کوهستانی می‌روید.",
                habitat = "مراتع و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پیچک‌های انتهایی در Lathyrus به گیاه امکان بالا رفتن و تکیه بر پوشش گیاهی اطراف را می‌دهند."
            )

            "Lathyrus_inconspicuus" -> PlantInfo(
                name = "خلر کم‌نمایان",
                scientificName = "Lathyrus inconspicuus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله از خلرها با گل‌های نسبتاً کوچک و ساقه‌های ظریف که در مراتع و زمین‌های باز رشد می‌کند.",
                habitat = "مراتع خشک و زمین‌های باز دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام inconspicuus به معنی کم‌نمایان است و به ظاهر نسبتاً کوچک و کم‌جلوه گل‌ها اشاره دارد."
            )

            "Lens_orientalis" -> PlantInfo(
                name = "عدس شرقی",
                scientificName = "Lens orientalis",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای یک‌ساله و خویشاوند نزدیک عدس زراعی که در زیستگاه‌های مدیترانه‌ای و نیمه‌خشک می‌روید.",
                habitat = "مزارع، زمین‌های بایر و مراتع نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Lens orientalis یکی از خویشاوندان وحشی مهم عدس زراعی و دارای اهمیت ژنتیکی برای اصلاح این محصول است."
            )

            "Lotus_corniculatus" -> PlantInfo(
                name = "نیلوفر شاخ‌دار",
                scientificName = "Lotus corniculatus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله علفی با گل‌های زرد و غلاف‌های باریک که در مراتع و چمنزارهای نسبتاً مرطوب رشد می‌کند.",
                habitat = "مراتع، چمنزارها و دامنه‌های نسبتاً مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام شاخ‌دار به شکل غلاف‌های باریک و نسبتاً خمیده این گیاه مربوط است."
            )

            "Medicago_coronata" -> PlantInfo(
                name = "یونجه تاجی",
                scientificName = "Medicago coronata",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله از یونجه‌های وحشی با برگ‌های سه‌برگچه‌ای و میوه‌ای دارای شکل مشخص که در مراتع خشک می‌روید.",
                habitat = "مراتع خشک و دامنه‌های کم‌ارتفاع زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شکل میوه در گونه‌های Medicago یکی از مهم‌ترین صفات برای شناسایی گونه‌ای است."
            )

            "Medicago_lupulina" -> PlantInfo(
                name = "یونجه رازک‌مانند",
                scientificName = "Medicago lupulina",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی علفی یک‌ساله یا دوساله با گل‌آذین‌های کوچک زرد که در مراتع و زمین‌های نسبتاً حاصلخیز رشد می‌کند.",
                habitat = "مراتع، چمنزارها و حاشیه مزارع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام lupulina به شباهت ظاهری گل‌آذین‌های آن با گل‌آذین رازک اشاره دارد."
            )

            "Medicago_minima" -> PlantInfo(
                name = "یونجه ریز",
                scientificName = "Medicago minima",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای یک‌ساله و کم‌ارتفاع با گل‌های زرد و میوه‌های خاردار که در مراتع خشک و خاک‌های سنگلاخی رشد می‌کند.",
                habitat = "مراتع خشک، دامنه‌های سنگلاخی و زمین‌های بایر زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های پیچیده و خاردار آن می‌توانند به پراکنش بذر از طریق جانوران کمک کنند."
            )

            "Medicago_polymorpha" -> PlantInfo(
                name = "یونجه‌حلزونی",
                scientificName = "Medicago polymorpha",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با گل‌های زرد و میوه‌های پیچیده و خاردار که در مراتع و زمین‌های کشاورزی دیده می‌شود.",
                habitat = "مراتع، زمین‌های کشاورزی و حاشیه جاده‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های مارپیچی و خاردار آن از ویژگی‌های بسیار مشخص این گونه در زمان میوه‌دهی است."
            )

            "Medicago_radiata" -> PlantInfo(
                name = "یونجه شعاعی",
                scientificName = "Medicago radiata",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای یک‌ساله با گل‌های زرد و میوه‌های مشخص که در نواحی خشک و نیمه‌خشک رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ساختار شعاعی برخی بخش‌های میوه از ویژگی‌های مورد توجه در نام‌گذاری این گونه است."
            )

            "Medicago_rigidula" -> PlantInfo(
                name = "یونجه سخت",
                scientificName = "Medicago rigidula",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با ساقه‌های نسبتاً سخت، گل‌های زرد و میوه‌های پیچیده که در زیستگاه‌های خشک رشد می‌کند.",
                habitat = "مراتع خشک، دامنه‌های سنگلاخی و زمین‌های باز زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه از خویشاوندان وحشی یونجه بوده و به‌عنوان بخشی از تنوع ژنتیکی گیاهان علوفه‌ای اهمیت دارد."
            )

            "Medicago_sativa" -> PlantInfo(
                name = "یونجه",
                scientificName = "Medicago sativa",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله و علوفه‌ای با برگ‌های سه‌برگچه‌ای و گل‌های بنفش که به‌طور گسترده در کشاورزی کشت می‌شود.",
                habitat = "مزارع و زمین‌های کشاورزی مناطق دشت و دامنه زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "یونجه به‌دلیل تثبیت نیتروژن با باکتری‌های ریزوبیوم یکی از گیاهان مهم در تناوب زراعی است."
            )

            "Medicago_scutellata" -> PlantInfo(
                name = "یونجه سپری",
                scientificName = "Medicago scutellata",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با گل‌های زرد و میوه‌های بزرگ و پیچیده که در مناطق نیمه‌خشک و مراتع رشد می‌کند.",
                habitat = "مراتع و زمین‌های نیمه‌خشک دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه بزرگ و سپرمانند آن از ویژگی‌های شاخص این گونه و دلیل نام رایج آن است."
            )

            "Melilotus_albus" -> PlantInfo(
                name = "شبدر شیرین سفید",
                scientificName = "Melilotus albus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی دوساله با گل‌های سفید و خوشه‌ای و بوی معطر که در زمین‌های باز و خاک‌های نسبتاً مرطوب رشد می‌کند.",
                habitat = "حاشیه مزارع، مراتع و زمین‌های مرطوب‌تر دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، صنعتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "ترکیبات کومارینی مسئول بوی خاص این گیاه هستند و در صورت نگهداری نامناسب علوفه می‌توانند به ترکیبات مشکل‌زا تبدیل شوند."
            )

            "Melilotus_indicus" -> PlantInfo(
                name = "شبدر شیرین هندی",
                scientificName = "Melilotus indicus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله تا دوساله با گل‌های زرد کوچک و گل‌آذین‌های کشیده که در مناطق باز و نسبتاً مرطوب می‌روید.",
                habitat = "مناطق کم‌ارتفاع، زمین‌های کشاورزی و حاشیه منابع آب زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گیاه مانند دیگر Melilotusها دارای ترکیبات کومارینی با بوی مشخص است."
            )

            "Melilotus_officinalis" -> PlantInfo(
                name = "شبدر شیرین زرد",
                scientificName = "Melilotus officinalis",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی دوساله با گل‌های زرد کوچک و معطر که در حاشیه مزارع و زیستگاه‌های باز رشد می‌کند.",
                habitat = "مراتع، حاشیه مزارع و مناطق نسبتاً مرطوب دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، صنعتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "کومارین موجود در این گیاه در شرایط خاص می‌تواند به دی‌کومارول تبدیل شود؛ ترکیبی که اساس تاریخی برخی داروهای ضدانعقاد بوده است."
            )

            "Onobrychis_cornuta" -> PlantInfo(
                name = "اسپرس شاخدار",
                scientificName = "Onobrychis cornuta",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله و بوته‌ای از اسپرس‌ها با ساختارهای خاردار و سازگار با شرایط خشک و سنگلاخی کوهستان.",
                habitat = "دامنه‌های سنگلاخی و مراتع مرتفع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برگ‌های مرکب و گل‌های پروانه‌آسای اسپرس از ویژگی‌های مشخص خانواده Fabaceae هستند."
            )

            "Onobrychis_crista-galli" -> PlantInfo(
                name = "اسپرس تاج‌خروسی",
                scientificName = "Onobrychis crista-galli",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی علفی از جنس Onobrychis با گل‌آذین‌های خوشه‌ای و میوه‌های خاردار که در مراتع رشد می‌کند.",
                habitat = "مراتع و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های خاردار بسیاری از گونه‌های Onobrychis در پراکنش بذر و تشخیص گونه نقش دارند."
            )

            "Onobrychis_melanotricha" -> PlantInfo(
                name = "اسپرس سیاه‌کرک",
                scientificName = "Onobrychis melanotricha",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای چندساله از اسپرس با پوشش کرکی تیره‌تر در برخی اندام‌ها که در مراتع کوهستانی رشد می‌کند.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی در گیاهان کوهستانی می‌تواند به کاهش تبادل حرارتی و محافظت از بافت‌های جوان کمک کند."
            )

            "Ononis_reclinata" -> PlantInfo(
                name = "خارپنبه خوابیده",
                scientificName = "Ononis reclinata",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی علفی و کم‌ارتفاع با ساقه‌های خوابیده و گل‌های صورتی تا بنفش که در خاک‌های خشک و سنگلاخی رشد می‌کند.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ساقه‌های خوابیده به گیاه اجازه می‌دهند در برابر باد و خشکی شدید نزدیک سطح زمین باقی بماند."
            )

            "Ononis_spinosa" -> PlantInfo(
                name = "خارپنبه خاردار",
                scientificName = "Ononis spinosa",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله با ساقه‌های خاردار و گل‌های صورتی که در مراتع و حاشیه زمین‌های باز می‌روید.",
                habitat = "مراتع، دامنه‌ها و حاشیه مزارع مناطق کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "ریشه Ononis spinosa در طب سنتی برخی مناطق به‌عنوان گیاه مدر مورد استفاده قرار گرفته است."
            )

            "Pisum_sativum" -> PlantInfo(
                name = "نخودفرنگی",
                scientificName = "Pisum sativum",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله و زراعی با ساقه‌های رونده و غلاف‌های حاوی دانه‌های خوراکی که در مناطق معتدل کشت می‌شود.",
                habitat = "مزارع و باغ‌های مناطق کشاورزی دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نخودفرنگی یکی از گیاهان کلاسیک آزمایش‌های گرگور مندل درباره قوانین وراثت بود."
            )

            "Scorpiurus_muricatus" -> PlantInfo(
                name = "عقرب‌گیاه خاردار",
                scientificName = "Scorpiurus muricatus",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با ساقه‌های خوابیده و غلاف‌های پیچیده و خاردار که در مراتع خشک رشد می‌کند.",
                habitat = "مراتع خشک و زمین‌های باز دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "غلاف پیچ‌خورده و خاردار آن ظاهری شبیه دم یا بدن عقرب ایجاد می‌کند و منشأ نام جنس است."
            )

            "Sophora_alopecuroides" -> PlantInfo(
                name = "سوفورای روباهی",
                scientificName = "Sophora alopecuroides",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله و علفی با گل‌های زرد و دانه‌های نسبتاً سمی که در مناطق خشک و شور رشد می‌کند.",
                habitat = "دشت‌ها و دامنه‌های خشک زاگرس و مناطق باز اطراف آبراهه‌ها در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "این گیاه دارای آلکالوئیدهای کینولیزیدینی مانند سوفورین است و مصرف خودسرانه آن به‌دلیل سمیت توصیه نمی‌شود."
            )

            "Trifolium_campestre" -> PlantInfo(
                name = "شبدر صحرایی",
                scientificName = "Trifolium campestre",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با برگ‌های سه‌برگچه‌ای و گل‌آذین‌های زرد که در مراتع و زمین‌های باز رشد می‌کند.",
                habitat = "مراتع، چمنزارها و حاشیه مزارع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پس از گل‌دهی، گل‌آذین‌های زرد آن معمولاً تیره‌تر و قهوه‌ای‌تر می‌شوند."
            )

            "Trifolium_pratense" -> PlantInfo(
                name = "شبدر قرمز",
                scientificName = "Trifolium pratense",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله علفی با گل‌آذین‌های صورتی تا قرمز و برگ‌های سه‌برگچه‌ای که در مراتع و زمین‌های علوفه‌ای می‌روید.",
                habitat = "مراتع مرطوب‌تر و زمین‌های علوفه‌ای دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شبدر قرمز دارای ایزوفلاون‌هایی مانند ژنیستئین و دایدزئین است که موضوع مطالعات تغذیه‌ای و دارویی بوده‌اند."
            )

            "Trifolium_purpureum" -> PlantInfo(
                name = "شبدر ارغوانی",
                scientificName = "Trifolium purpureum",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با گل‌های ارغوانی و برگ‌های سه‌برگچه‌ای که در مراتع خشک و زمین‌های باز رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "رنگ ارغوانی گل‌آذین از صفات مشخص آن در زمان گل‌دهی است."
            )

            "Trifolium_repens" -> PlantInfo(
                name = "شبدر سفید",
                scientificName = "Trifolium repens",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی چندساله و خزنده با گل‌آذین‌های سفید کروی و ساقه‌های ریشه‌زا که در چمنزارهای مرطوب رشد می‌کند.",
                habitat = "چمنزارها، مراتع مرطوب و حاشیه منابع آب کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ساقه‌های خزنده آن در محل گره‌ها ریشه تولید می‌کنند و به گسترش رویشی گیاه کمک می‌کنند."
            )

            "Trifolium_resupinatum" -> PlantInfo(
                name = "شبدر ایرانی",
                scientificName = "Trifolium resupinatum",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله تا دوساله با گل‌های صورتی یا ارغوانی که به‌عنوان گیاه علوفه‌ای در ایران اهمیت دارد.",
                habitat = "مراتع، مزارع و چمنزارهای مناطق نسبتاً مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه در ایران سابقه طولانی در استفاده به‌عنوان گیاه علوفه‌ای و مرتعی دارد."
            )

            "Trifolium_tomentosum" -> PlantInfo(
                name = "شبدر پنبه‌ای",
                scientificName = "Trifolium tomentosum",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با گل‌آذین‌های کروی و پوشش کرکی مشخص که در زمین‌های باز و مراتع رشد می‌کند.",
                habitat = "مراتع و زمین‌های باز دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "کروی شدن گل‌آذین و پوشش کرکی آن از صفات قابل مشاهده برای تشخیص این گونه است."
            )

            "Trigonella_caerulescens" -> PlantInfo(
                name = "شنبلیله آبی",
                scientificName = "Trigonella caerulescens",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله از جنس Trigonella با گل‌های متمایل به آبی و برگ‌های سه‌برگچه‌ای که در مراتع رشد می‌کند.",
                habitat = "مراتع و دامنه‌های خشک تا نیمه‌مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "رنگ متمایل به آبی گل‌ها صفتی قابل توجه برای تفکیک آن از بسیاری از گونه‌های زردگل Trigonella است."
            )

            "Trigonella_monantha" -> PlantInfo(
                name = "شنبلیله تک‌گل",
                scientificName = "Trigonella monantha",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی علفی یک‌ساله با گل‌های منفرد یا کم‌شمار و برگ‌های سه‌برگچه‌ای که در زیستگاه‌های خشک رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام monantha به معنای تک‌گل است و به آرایش کم‌شمار گل‌های این گونه اشاره دارد."
            )

            "Trigonella_Spruneriana" -> PlantInfo(
                name = "شنبلیله اسپرونری",
                scientificName = "Trigonella spruneriana",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله از شنبلیله‌های وحشی با برگ‌های سه‌برگچه‌ای و گل‌های کوچک که در مراتع رشد می‌کند.",
                habitat = "مراتع و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های وحشی Trigonella از ذخایر ژنتیکی مهم برای مطالعه تنوع حبوبات و گیاهان علوفه‌ای هستند."
            )

            "Trigonella_stellata" -> PlantInfo(
                name = "شنبلیله ستاره‌ای",
                scientificName = "Trigonella stellata",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله و کم‌ارتفاع با گل‌های زرد و برگ‌های سه‌برگچه‌ای که در زیستگاه‌های خشک و باز رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام stellata به معنی ستاره‌ای است و به شکل برخی ساختارهای گیاه اشاره دارد."
            )

            "Vicia_amphicarpa" -> PlantInfo(
                name = "ماشک آمفیکارپا",
                scientificName = "Vicia amphicarpa",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله از جنس Vicia با توان تولید میوه‌های هوایی و زیرزمینی که در زیستگاه‌های باز رشد می‌کند.",
                habitat = "مراتع، مزارع و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه دارای دو نوع تولیدمثل میوه‌ای، هوایی و زیرزمینی، است که نمونه‌ای جالب از راهبردهای تولیدمثل در گیاهان است."
            )

            "Vicia_narbonensis" -> PlantInfo(
                name = "ماشک ناربو",
                scientificName = "Vicia narbonensis",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله با ساقه‌های نسبتاً ایستاده و دانه‌های درشت که در مزارع و مراتع مناطق نیمه‌خشک رشد می‌کند.",
                habitat = "مزارع، زمین‌های بایر و مراتع دامنه‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه از خویشاوندان وحشی حبوبات زراعی و دارای ارزش بالقوه برای مطالعات اصلاح نباتات است."
            )

            "Vicia_peregrina" -> PlantInfo(
                name = "ماشک سرگردان",
                scientificName = "Vicia peregrina",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله و پیچنده با برگ‌های مرکب و پیچک‌دار که در مراتع و زمین‌های کشاورزی می‌روید.",
                habitat = "مراتع، مزارع و حاشیه باغ‌های زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پیچک‌های انتهایی برگ‌ها به Vicia امکان اتصال به گیاهان مجاور و رشد در ارتفاع را می‌دهند."
            )

            "Vicia_variabilis" -> PlantInfo(
                name = "ماشک متغیر",
                scientificName = "Vicia variabilis",
                family = "Fabaceae (باقلائیان)",
                description = "گونه‌ای علفی و پیچنده از جنس Vicia با برگ‌های مرکب و گل‌های پروانه‌آسا که در مراتع کوهستانی رشد می‌کند.",
                habitat = "مراتع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "تنوع در صفات ظاهری و سازگاری گونه‌های Vicia به آن‌ها امکان رشد در دامنه وسیعی از زیستگاه‌ها را داده است."
            )

            "Vicia_villosa" -> PlantInfo(
                name = "ماشک گلوس",
                scientificName = "Vicia villosa",
                family = "Fabaceae (باقلائیان)",
                description = "گیاهی یک‌ساله یا دوساله با ساقه‌های پیچنده و پوشیده از کرک و گل‌های صورتی تا ارغوانی که به‌عنوان علوفه نیز استفاده می‌شود.",
                habitat = "مراتع، مزارع و دامنه‌های نیمه‌مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی فراوان ساقه‌ها و برگ‌ها ویژگی شاخص این گونه است و نام villosa نیز به همین صفت اشاره دارد."
            )


            // ═══════════════════════════════════════════
            // Lamiaceae (نعنائیان)
            // ═══════════════════════════════════════════
            "Acinos_graveolens" -> PlantInfo(
                name = "آسینوس بدبو",
                scientificName = "Acinos graveolens",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی علفی و معطر از تیره نعناعیان با ساقه‌های ظریف و گل‌های کوچک ارغوانی تا صورتی که در زیستگاه‌های خشک کوهستانی می‌روید.",
                habitat = "دامنه‌های سنگلاخی و مراتع خشک زاگرس در ارتفاعات چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام graveolens به بوی قوی و معطر گیاه اشاره دارد که ناشی از ترکیبات اسانس آن است."
            )

            "Ajuga_chamaecistus" -> PlantInfo(
                name = "آجوگا",
                scientificName = "Ajuga chamaecistus",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی علفی چندساله و کم‌ارتفاع با برگ‌های متقابل و گل‌های دو لبه که در دامنه‌ها و مراتع کوهستانی رشد می‌کند.",
                habitat = "مراتع سنگلاخی و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های Ajuga به‌طور طبیعی دارای ترکیبات دی‌ترپنوئیدی و فیتواِکدی‌استروئیدی هستند که موضوع مطالعات دارویی بوده‌اند."
            )

            "Eremostachys_macrophylla" -> PlantInfo(
                name = "چوبک برگ‌درشت",
                scientificName = "Eremostachys macrophylla",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با برگ‌های بزرگ و گل‌آذین‌های حلقه‌ای متراکم که در مناطق خشک و نیمه‌خشک کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های خشک و سنگلاخی زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برگ‌های بزرگ و گل‌آذین‌های طبقه‌طبقه از ویژگی‌های شاخص جنس Eremostachys هستند."
            )

            "Lallemantia_iberica" -> PlantInfo(
                name = "للمانتیا ایبری",
                scientificName = "Lallemantia iberica",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی یک‌ساله معطر با برگ‌های باریک و گل‌های کوچک آبی تا بنفش که در مزارع و رویشگاه‌های باز رشد می‌کند.",
                habitat = "مزارع، دامنه‌های باز و مراتع نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "دانه‌های این گونه سرشار از روغن هستند و در برخی مناطق به‌عنوان منبع روغن خوراکی و صنعتی استفاده شده‌اند."
            )

            "Lallemantia_peltata" -> PlantInfo(
                name = "للمانتیا سپری",
                scientificName = "Lallemantia peltata",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی یک‌ساله با برگ‌های مشخص و گل‌های کوچک دو لبه که در مناطق باز و نیمه‌خشک کوهستانی دیده می‌شود.",
                habitat = "مراتع خشک، دامنه‌ها و زمین‌های باز زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "دانه‌های Lallemantia به‌دلیل داشتن روغن و موسیلاژ از نظر تغذیه‌ای و صنعتی مورد توجه هستند."
            )

            "Lamium_album" -> PlantInfo(
                name = "گزنه سفید",
                scientificName = "Lamium album",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با برگ‌هایی شبیه گزنه و گل‌های سفید، اما بدون کرک‌های گزنده، که در خاک‌های نسبتاً مرطوب رشد می‌کند.",
                habitat = "چمنزارها، حاشیه منابع آب و دامنه‌های نسبتاً مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "با وجود شباهت ظاهری به گزنه حقیقی، Lamium album فاقد ساختارهای گزنده مشخص گزنه‌هاست."
            )

            "Lamium_amplexicaule" -> PlantInfo(
                name = "گزنه سفیدک‌دار",
                scientificName = "Lamium amplexicaule",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی یک‌ساله با برگ‌های ساقه‌آغوش و گل‌های صورتی تا ارغوانی که در زمین‌های زراعی و زیستگاه‌های باز رشد می‌کند.",
                habitat = "مزارع، باغ‌ها و مراتع کم‌ارتفاع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه می‌تواند علاوه بر گل‌های معمولی، گل‌های کوچک و خودگشن زیرزمینی نیز تولید کند."
            )

            "Marrubium_astracanicum" -> PlantInfo(
                name = "خوارمریم استراکان",
                scientificName = "Marrubium astracanicum",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با برگ‌های خاکستری و گل‌های سفید که به شرایط خشک و سنگلاخی سازگار است.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی و خاکستری این جنس به کاهش تبخیر آب از سطح برگ‌ها در شرایط خشک کمک می‌کند."
            )

            "Marrubium_cuneatum" -> PlantInfo(
                name = "خوارمریم گوه‌ای",
                scientificName = "Marrubium cuneatum",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با برگ‌های خاکستری و نسبتاً گوه‌ای‌شکل و گل‌های سفید کوچک که در زیستگاه‌های خشک کوهستانی رشد می‌کند.",
                habitat = "شیب‌های سنگلاخی و مراتع خشک زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی فراوان در Marrubium ویژگی سازشی مهمی برای زندگی در اقلیم‌های گرم و کم‌آب است."
            )

            "Marrubium_vulgare" -> PlantInfo(
                name = "خوارمریم",
                scientificName = "Marrubium vulgare",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله، معطر و خاکستری‌رنگ با برگ‌های چروکیده و گل‌های سفید کوچک که در مناطق خشک و نیمه‌خشک می‌روید.",
                habitat = "مراتع خشک، دامنه‌ها و حاشیه زمین‌های کشاورزی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Marrubium vulgare از گیاهان دارویی قدیمی است و ترکیب دی‌ترپنی ماروبین از مواد شاخص آن محسوب می‌شود."
            )

            "Mentha_longifolia" -> PlantInfo(
                name = "پونه کوهی",
                scientificName = "Mentha longifolia",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با برگ‌های کشیده و گل‌آذین‌های سنبله‌ای که معمولاً در خاک‌های مرطوب و حاشیه آب‌ها رشد می‌کند.",
                habitat = "حاشیه چشمه‌ها، رودخانه‌ها و مناطق مرطوب در دره‌های زاگرس چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "برگ‌های Mentha longifolia حاوی اسانس‌هایی غنی از ترکیبات مونوترپنی و سزکویی‌ترپنی هستند."
            )

            "Micromeria_myrtifolia" -> PlantInfo(
                name = "میکرومریا موردبرگ",
                scientificName = "Micromeria myrtifolia",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی کوچک و معطر با برگ‌های نسبتاً کوچک و گل‌های ارغوانی که در شکاف سنگ‌ها و دامنه‌های خشک رشد می‌کند.",
                habitat = "شکاف صخره‌ها و دامنه‌های سنگلاخی زاگرس در ارتفاعات چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "بوی معطر این گیاه به اسانس‌های فرار موجود در کرک‌های غده‌ای اندام‌های هوایی مربوط است."
            )

            "Nepeta_glomerulosa_carmanica" -> PlantInfo(
                name = "پونه‌سا گلوله‌ای کرمانیکا",
                scientificName = "Nepeta glomerulosa carmanica",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با گل‌های مجتمع در گل‌آذین‌های متراکم که در دامنه‌های خشک و مرتفع زاگرس رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی و مراتع مرتفع زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "بسیاری از گونه‌های Nepeta به‌دلیل اسانس‌های معطر خود در مطالعات دارویی و شیمی گیاهی مورد توجه هستند."
            )

            "Phlomis_olivieri" -> PlantInfo(
                name = "کلپوره الیویه",
                scientificName = "Phlomis olivieri",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و بوته‌ای با برگ‌های پوشیده از کرک و گل‌های زرد که از عناصر شاخص پوشش گیاهی خشک زاگرس است.",
                habitat = "دامنه‌های خشک، مراتع سنگلاخی و ارتفاعات زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Phlomis olivieri از گونه‌های شاخص رویشگاه‌های نیمه‌خشک ایران و از گیاهان معطر بومی منطقه محسوب می‌شود."
            )

            "Phlomis_persica" -> PlantInfo(
                name = "کلپوره ایرانی",
                scientificName = "Phlomis persica",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با برگ‌های کرک‌دار و گل‌های زرد که در دامنه‌های خشک و سنگلاخی مناطق کوهستانی می‌روید.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی متراکم برگ‌ها و ساقه‌ها از سازگاری‌های رایج Phlomis با تابش شدید و کم‌آبی است."
            )

            "Salvia_ceratophylla" -> PlantInfo(
                name = "مریم‌گلی شاخ‌برگ",
                scientificName = "Salvia ceratophylla",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی علفی دوساله یا چندساله با برگ‌های بزرگ و گل‌های صورتی تا ارغوانی که در مناطق خشک رشد می‌کند.",
                habitat = "دامنه‌های خشک، زمین‌های سنگلاخی و مراتع زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برگ‌های این گونه در مراحل مختلف رشد شکل‌های متفاوتی دارند و برگ‌های پایینی معمولاً بزرگ‌تر و عمیق‌تر تقسیم‌شده‌اند."
            )

            "Salvia_hydrangea" -> PlantInfo(
                name = "مریم‌گلی هیدرانژیا",
                scientificName = "Salvia hydrangea",
                family = "Lamiaceae (نعنائیان)",
                description = "گونه‌ای بوته‌ای و معطر با گل‌های بزرگ و چشمگیر که در زیستگاه‌های کوهستانی خشک و سنگلاخی رشد می‌کند.",
                habitat = "صخره‌ها، شکاف سنگ‌ها و دامنه‌های خشک زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های بزرگ و رنگین آن نسبت به بسیاری از مریم‌گلی‌های ایران ظاهر زینتی بسیار برجسته‌ای دارند."
            )

            "Salvia_multicaulis" -> PlantInfo(
                name = "مریم‌گلی چندساقه",
                scientificName = "Salvia multicaulis",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با ساقه‌های متعدد و گل‌های ارغوانی که در دامنه‌های خشک و سنگلاخی زاگرس می‌روید.",
                habitat = "دامنه‌های سنگلاخی و مراتع خشک ارتفاعات زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Salvia multicaulis یکی از مریم‌گلی‌های معطر ایران است که برگ‌های آن در برخی مناطق در طب سنتی و به‌عنوان چاشنی استفاده شده است."
            )

            "Salvia_nemorosa" -> PlantInfo(
                name = "مریم‌گلی جنگلی",
                scientificName = "Salvia nemorosa",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با ساقه‌های راست و گل‌آذین‌های خوشه‌ای از گل‌های ارغوانی تا بنفش که در مراتع و مناطق باز رشد می‌کند.",
                habitat = "مراتع و دامنه‌های نیمه‌مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، زینتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "گل‌آذین‌های متراکم و رنگین Salvia nemorosa باعث شده این گونه در باغبانی زینتی نیز مورد استفاده قرار گیرد."
            )

            "Salvia_palaestina" -> PlantInfo(
                name = "مریم‌گلی فلسطینی",
                scientificName = "Salvia palaestina",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی علفی چندساله با برگ‌های معطر و گل‌های سفید تا صورتی که در دامنه‌ها و مراتع نیمه‌خشک می‌روید.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "مانند بسیاری از Salviaها، گل این گونه دارای ساختارهای ویژه‌ای برای قرارگیری پرچم‌ها و انتقال گرده توسط حشرات است."
            )

            "Salvia_sclarea" -> PlantInfo(
                name = "مریم‌گلی کلاری",
                scientificName = "Salvia sclarea",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی دوساله یا چندساله معطر با برگ‌های بزرگ و گل‌آذین بلند و رنگین که در مناطق باز و نسبتاً خشک رشد می‌کند.",
                habitat = "دامنه‌ها، مراتع و زمین‌های باز زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، صنعتی، زینتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "اسانس Salvia sclarea منبع مهم اسکلارئول است که در صنایع عطرسازی ارزش دارد."
            )

            "Salvia_syriaca" -> PlantInfo(
                name = "مریم‌گلی سوری",
                scientificName = "Salvia syriaca",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله معطر با برگ‌های خاکستری و گل‌های روشن که در زیستگاه‌های خشک و سنگلاخی رشد می‌کند.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "کرک‌های سطح برگ در مریم‌گلی‌ها علاوه بر ایجاد ظاهر خاکستری می‌توانند تبادل آب و حرارت را کاهش دهند."
            )

            "Salvia_virgata" -> PlantInfo(
                name = "مریم‌گلی خوشه‌ای",
                scientificName = "Salvia virgata",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با ساقه‌های بلند و گل‌های بنفش تا ارغوانی در گل‌آذین‌های باریک که در مراتع و حاشیه مزارع می‌روید.",
                habitat = "مراتع، حاشیه مزارع و دامنه‌های نیمه‌مرطوب زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، زینتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "ساختار گل در جنس Salvia با سازوکاری ویژه باعث تماس پرچم‌ها با بدن گرده‌افشان هنگام ورود به گل می‌شود."
            )

            "Stachys_inflata" -> PlantInfo(
                name = "سنبل‌الطیب کوهی",
                scientificName = "Stachys inflata",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با ساقه‌های نسبتاً کرک‌دار و گل‌های صورتی تا ارغوانی که در دامنه‌های خشک کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی و مراتع خشک زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Stachys inflata از گیاهان دارویی شناخته‌شده فلور ایران است و درباره اثرات ضدالتهابی عصاره آن مطالعات متعددی انجام شده است."
            )

            "Stachys_lavandulifolia" -> PlantInfo(
                name = "چای کوهی",
                scientificName = "Stachys lavandulifolia",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با برگ‌های باریک و گل‌های صورتی تا ارغوانی که در ارتفاعات و دامنه‌های سنگلاخی می‌روید.",
                habitat = "ارتفاعات سنگلاخی و مراتع کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "این گونه در طب سنتی ایران به‌عنوان گیاه دم‌کردنی شناخته می‌شود و اسانس آن ترکیبات متنوعی از ترپن‌ها دارد."
            )

            "Stachys_spectabilis" -> PlantInfo(
                name = "استاکیس تماشایی",
                scientificName = "Stachys spectabilis",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله با گل‌آذین‌های متراکم و گل‌های نسبتاً بزرگ که در دامنه‌های کوهستانی و مراتع سنگلاخی رشد می‌کند.",
                habitat = "دامنه‌های مرتفع و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "گل‌های نسبتاً درشت و رنگین این گونه برای جلب گرده‌افشان‌ها اهمیت دارند و ارزش بالقوه زینتی ایجاد می‌کنند."
            )

            "Teucrium_orientale" -> PlantInfo(
                name = "مریم‌نخودی شرقی",
                scientificName = "Teucrium orientale",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی علفی چندساله با برگ‌های معطر و گل‌های کوچک که در دامنه‌های خشک و سنگلاخی مناطق کوهستانی رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های Teucrium به‌دلیل داشتن دی‌ترپنوئیدها و اسانس‌های فرار در پژوهش‌های دارویی مورد توجه هستند."
            )

            "Teucrium_polium" -> PlantInfo(
                name = "مریم‌نخودی",
                scientificName = "Teucrium polium",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله، معطر و خاکستری‌رنگ با برگ‌های کوچک و گل‌های سفید تا صورتی که در مناطق خشک زاگرس بسیار سازگار است.",
                habitat = "مراتع خشک، دامنه‌های سنگلاخی و ارتفاعات زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "Teucrium polium یکی از گیاهان دارویی پرکاربرد در طب سنتی ایران است و ترکیبات اسانسی متعددی دارد."
            )

            "Teucrium_scordium" -> PlantInfo(
                name = "مریم‌نخودی باتلاقی",
                scientificName = "Teucrium scordium",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با ساقه‌های خزنده یا نیمه‌خزنده که برخلاف بسیاری از Teucriumها به محیط‌های مرطوب‌تر وابستگی بیشتری دارد.",
                habitat = "حاشیه آبراهه‌ها، چشمه‌ها و زیستگاه‌های مرطوب در دره‌های زاگرس چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "نام scordium از واژه‌ای تاریخی برای گیاهان بدبو گرفته شده و به بوی خاص برخی اندام‌های این گونه اشاره دارد."
            )

            "Ziziphora_capitata" -> PlantInfo(
                name = "کاکوتی کپه‌ای",
                scientificName = "Ziziphora capitata",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی یک‌ساله و بسیار معطر با برگ‌های کوچک و گل‌های صورتی تا ارغوانی که در مراتع خشک و دامنه‌های سنگلاخی می‌روید.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "اسانس Ziziphora capitata سرشار از ترکیبات فرار معطر است و به همین دلیل در برخی مناطق به‌صورت دمنوش مصرف می‌شود."
            )

            "Ziziphora_clinopodioides" -> PlantInfo(
                name = "کاکوتی کوهی",
                scientificName = "Ziziphora clinopodioides",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی چندساله و معطر با ساقه‌های باریک و گل‌های کوچک صورتی یا ارغوانی که در ارتفاعات و مراتع خشک رشد می‌کند.",
                habitat = "ارتفاعات، مراتع سنگلاخی و دامنه‌های خشک زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "کاکوتی کوهی از گیاهان معطر شناخته‌شده ایران است و اسانس آن عمدتاً از مونوترپن‌های فرار تشکیل می‌شود."
            )

            "Ziziphora_tenuior" -> PlantInfo(
                name = "کاکوتی باریک",
                scientificName = "Ziziphora tenuior",
                family = "Lamiaceae (نعنائیان)",
                description = "گیاهی یک‌ساله و معطر با ساقه‌های ظریف و برگ‌های باریک که در مراتع خشک و زمین‌های سنگلاخی رشد می‌کند.",
                habitat = "دامنه‌های خشک و مراتع سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برگ‌های باریک و اسانس معطر از ویژگی‌های شاخص این گونه و دیگر اعضای جنس Ziziphora هستند."
            )


            // ═══════════════════════════════════════════
            // Liliaceae (سوسنیان)
            // ═══════════════════════════════════════════
            "Allium_atroviolaceum" -> PlantInfo(
                name = "والک بنفش‌تیره",
                scientificName = "Allium atroviolaceum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با برگ‌های باریک و گل‌آذین کروی از گل‌های بنفش تیره که در مراتع و دامنه‌های کوهستانی می‌روید.",
                habitat = "مراتع سنگلاخی و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بوی ویژه اندام‌های Allium ناشی از ترکیبات گوگرددار است که پس از آسیب بافتی تشکیل می‌شوند."
            )

            "Allium_hirtifolium" -> PlantInfo(
                name = "سیر کوهی",
                scientificName = "Allium hirtifolium",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با برگ‌های باریک و گل‌های صورتی تا ارغوانی که در مراتع و دامنه‌های خشک کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های خشک، مراتع و مناطق سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پیاز این گونه حاوی ترکیبات گوگرددار معطر است که ویژگی شیمیایی مشترک بسیاری از گونه‌های سیر و پیاز است."
            )

            "Allium_longisepalum" -> PlantInfo(
                name = "والک کاسبرگ‌بلند",
                scientificName = "Allium longisepalum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با گل‌های کوچک و کاسبرگ‌های نسبتاً بلند که در رویشگاه‌های کوهستانی رشد می‌کند.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شکل و طول قطعات گل از صفات مهم برای تفکیک گونه‌های نزدیک جنس Allium هستند."
            )

            "Allium_scabriscapum" -> PlantInfo(
                name = "سیر ساقه‌زبر",
                scientificName = "Allium scabriscapum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی چندساله با ساقه گل‌دهنده زبر و گل‌آذین متراکم که در دامنه‌های خشک و سنگلاخی می‌روید.",
                habitat = "دامنه‌های سنگلاخی و مراتع خشک زاگرس مرکزی در چهارمحال و بختیاری",
                uses = "-",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "صفت زبری ساقه گل‌دهنده از ویژگی‌های ریخت‌شناختی مورد استفاده در شناسایی این گونه است."
            )

            "Allium_vineale" -> PlantInfo(
                name = "سیر وحشی",
                scientificName = "Allium vineale",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با بوی سیر، برگ‌های باریک و گل‌آذین‌های کوچک که در مراتع و زمین‌های باز رشد می‌کند.",
                habitat = "مراتع، حاشیه مزارع و دامنه‌های کم‌ارتفاع زاگرس در چهارمحال و بختیاری",
                uses = "خوراکی، دارویی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "Allium vineale می‌تواند علاوه بر بذر، پیازچه‌های کوچک هوایی تولید کند که در پراکنش رویشی آن نقش دارند."
            )

            "Bellevalia_macrobotrys" -> PlantInfo(
                name = "بلوالیا خوشه‌درشت",
                scientificName = "Bellevalia macrobotrys",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با گل‌آذین خوشه‌ای متراکم و گل‌های زنگوله‌ای که در مراتع کوهستانی بهاره ظاهر می‌شود.",
                habitat = "مراتع مرتفع، دامنه‌های سنگلاخی و چمنزارهای زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های زنگوله‌ای Bellevalia در بهار یکی از عناصر قابل تشخیص فلور پیازی مناطق کوهستانی هستند."
            )

            "Colchicum_kotschyi" -> PlantInfo(
                name = "گل حسرت کوتشی",
                scientificName = "Colchicum kotschyi",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با گل‌های صورتی یا ارغوانی که معمولاً در اواخر فصل رویش ظاهر می‌شوند و برگ‌ها در زمان دیگری از چرخه رشد دیده می‌شوند.",
                habitat = "مراتع مرتفع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "دارویی",
                flowering = "پاییز",
                isEndangered = false,
                interestingFacts = "گونه‌های Colchicum حاوی آلکالوئید سمی کلشی‌سین هستند؛ این ترکیب در پزشکی و پژوهش‌های سلولی اهمیت دارد."
            )

            "Eremurus_inderiensis" -> PlantInfo(
                name = "سیرموک ایندری",
                scientificName = "Eremurus inderiensis",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی چندساله با ریشه‌های گوشتی و ساقه گل‌دهنده بلند که گل‌های متعدد ستاره‌ای را در گل‌آذین کشیده تولید می‌کند.",
                habitat = "دامنه‌ها و مراتع خشک و نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ساقه گل‌دهنده Eremurus می‌تواند بسیار بلند شود و گل‌ها به‌صورت تدریجی از بخش پایین به بالای گل‌آذین باز می‌شوند."
            )

            "Eremurus_persicus" -> PlantInfo(
                name = "سیرموک ایرانی",
                scientificName = "Eremurus persicus",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی چندساله و علفی با گل‌آذین بلند و گل‌های ستاره‌ای سفید تا صورتی که در دامنه‌های خشک و سنگلاخی رشد می‌کند.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "ریشه‌های گوشتی Eremurus برای ذخیره مواد غذایی و گذراندن دوره‌های نامساعد سال سازگاری یافته‌اند."
            )

            "Eremurus_spectabilis" -> PlantInfo(
                name = "سیرموک تماشایی",
                scientificName = "Eremurus spectabilis",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی چندساله با برگ‌های نواری و ساقه گل‌دهنده بلند که گل‌های فراوان و چشمگیر را در بهار تولید می‌کند.",
                habitat = "مراتع و دامنه‌های مرتفع و سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "به‌دلیل ارتفاع زیاد گل‌آذین و فراوانی گل‌ها، Eremurus از گیاهان شاخص و چشمگیر مناظر استپی و کوهستانی است."
            )

            "Fritillaria_gibbosa" -> PlantInfo(
                name = "لاله واژگون قوزدار",
                scientificName = "Fritillaria gibbosa",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با گل‌های زنگوله‌ای آویخته، معمولاً با رنگ‌های سبز، زرد یا ارغوانی، که در دامنه‌های کوهستانی می‌روید.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های آویخته Fritillaria به شکل زنگوله‌ای هستند و شهد در بخش‌های پایینی گل می‌تواند گرده‌افشان‌ها را جذب کند."
            )

            "Fritillaria_imperialis" -> PlantInfo(
                name = "لاله واژگون",
                scientificName = "Fritillaria imperialis",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و بلندقد با تاجی از گل‌های زنگوله‌ای آویخته در زیر مجموعه‌ای از برگ‌های باریک که در دامنه‌های زاگرس می‌روید.",
                habitat = "مراتع مرتفع، دامنه‌ها و چمنزارهای کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "لاله واژگون از نمادهای طبیعی کوهستان‌های زاگرس است و گل‌های آن معمولاً در ابتدای بهار، پس از ذوب برف‌ها، ظاهر می‌شوند."
            )

            "Fritillaria_persica" -> PlantInfo(
                name = "لاله واژگون ایرانی",
                scientificName = "Fritillaria persica",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با ساقه بلند و گل‌های زنگوله‌ای متعدد به رنگ ارغوانی تیره که در زیستگاه‌های کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی و مراتع مرتفع زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌آذین کشیده و پرگل Fritillaria persica آن را به یکی از گونه‌های ارزشمند جنس Fritillaria برای باغبانی تبدیل کرده است."
            )

            "Muscari_inconstrictum" -> PlantInfo(
                name = "موسکاری نامنقبض",
                scientificName = "Muscari inconstrictum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و کوچک با گل‌های زنگوله‌ای آبی تا بنفش که در اوایل فصل رویش در مراتع و دامنه‌های سنگلاخی ظاهر می‌شود.",
                habitat = "مراتع خشک و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌آذین‌های متراکم Muscari از دور شبیه خوشه‌های کوچک انگور هستند و به همین دلیل بسیاری از گونه‌های آن در باغبانی به سنبل انگوری معروف‌اند."
            )

            "Muscari_neglectum" -> PlantInfo(
                name = "سنبل انگوری",
                scientificName = "Muscari neglectum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و کوچک با برگ‌های باریک و گل‌آذین متراکم از گل‌های آبی تیره تا بنفش که در مراتع بهاری رشد می‌کند.",
                habitat = "مراتع، دامنه‌های سنگلاخی و چمنزارهای زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های متراکم و کروی این گونه به خوشه انگور شباهت دارند و منشأ نام رایج سنبل انگوری هستند."
            )

            "Nectaroscordum_tripedale" -> PlantInfo(
                name = "نکتارواسکوردوم سه‌پایه",
                scientificName = "Nectaroscordum tripedale",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با ساقه گل‌دهنده بلند و گل‌های آویخته و زنگوله‌ای که در مراتع و دامنه‌های کوهستانی می‌روید.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های آویخته این جنس شهد فراوان تولید می‌کنند و ساختار گل با گرده‌افشانی توسط حشرات سازگار شده است."
            )

            "Ornithogalum_arcuatum" -> PlantInfo(
                name = "ستاره‌گل کمانی",
                scientificName = "Ornithogalum arcuatum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با گل‌های سفید ستاره‌ای و برگ‌های باریک که در مراتع و دامنه‌های باز رشد می‌کند.",
                habitat = "مراتع و دامنه‌های نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های سفید Ornithogalum در بسیاری از گونه‌ها هنگام تابش مناسب باز و در شرایط نامساعد بسته می‌شوند."
            )

            "Ornithogalum_narbonense" -> PlantInfo(
                name = "ستاره‌گل ناربون",
                scientificName = "Ornithogalum narbonense",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی با برگ‌های نواری و گل‌آذین خوشه‌ای بلند از گل‌های سفید ستاره‌ای که در مراتع و زمین‌های باز می‌روید.",
                habitat = "مراتع، حاشیه مزارع و دامنه‌های باز زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "نام جنس Ornithogalum از یونانی به معنی «شیر پرنده» گرفته شده و به رنگ سفید گل‌ها اشاره دارد."
            )

            "Ornithogalum_orthophyllum" -> PlantInfo(
                name = "ستاره‌گل برگ‌راست",
                scientificName = "Ornithogalum orthophyllum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و کوچک با برگ‌های باریک و نسبتاً راست و گل‌های سفید ستاره‌ای که در اوایل بهار ظاهر می‌شوند.",
                habitat = "مراتع سنگلاخی و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های سفید ستاره‌ای این جنس دارای شش قطعه گل هستند که آرایش متقارن مشخصی ایجاد می‌کنند."
            )

            "Ornithogalum_recurvum" -> PlantInfo(
                name = "ستاره‌گل برگ‌برگشته",
                scientificName = "Ornithogalum recurvum",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با گل‌های سفید و برگ‌هایی که ممکن است حالت خمیده یا برگشته داشته باشند.",
                habitat = "دامنه‌های سنگلاخی و مراتع نیمه‌خشک زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شکل برگ و جهت خمیدگی آن از صفات مفید در شناسایی گونه‌های نزدیک Ornithogalum است."
            )

            "Tulipa_biebersteiniana" -> PlantInfo(
                name = "لاله بیبرشتاین",
                scientificName = "Tulipa biebersteiniana",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و بهاره با یک یا چند گل زرد روشن و برگ‌های باریک که در مراتع و دامنه‌های کوهستانی رشد می‌کند.",
                habitat = "مراتع مرتفع و دامنه‌های سنگلاخی زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های زرد و نسبتاً درشت Tulipa biebersteiniana در آغاز فصل رویش یکی از جلوه‌های قابل توجه مراتع کوهستانی هستند."
            )

            "Tulipa_biflora" -> PlantInfo(
                name = "لاله دوفلوره",
                scientificName = "Tulipa biflora",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی کوچک با برگ‌های باریک و معمولاً دو گل زرد یا زرد مایل به سبز که در زیستگاه‌های مرتفع می‌روید.",
                habitat = "مراتع سنگلاخی و دامنه‌های مرتفع زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "وجود دو گل روی یک ساقه ویژگی قابل توجه این گونه و یکی از دلایل نام‌گذاری biflora است."
            )

            "Tulipa_systola" -> PlantInfo(
                name = "لاله سیستولا",
                scientificName = "Tulipa systola",
                family = "Liliaceae (سوسنیان)",
                description = "گیاهی پیازی و چندساله با گل‌های زرد و برگ‌های باریک که در مراتع خشک و دامنه‌های سنگلاخی زاگرس رشد می‌کند.",
                habitat = "دامنه‌های خشک، مراتع سنگلاخی و ارتفاعات زاگرس در چهارمحال و بختیاری",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "لاله‌های وحشی زاگرس به‌دلیل چرای دام، تغییر کاربری و برداشت پیاز می‌توانند در برابر فشارهای محلی آسیب‌پذیر شوند."
            )


            // ═══════════════════════════════════════════
            // Rosaceae (گل‌سرخیان)
            // ═══════════════════════════════════════════
            "Agrimonia_eupatoria" -> PlantInfo(
                name = "غافث",
                scientificName = "Agrimonia eupatoria",
                family = "Rosaceae (گل‌سرخیان)",
                description = "گیاهی علفی چندساله از تیره گل‌سرخیان است که دارای برگ‌های مرکب و گل‌آذین خوشه‌ای زردرنگ بوده و در زیستگاه‌های نیمه‌مرطوب رشد می‌کند.",
                habitat = "مراتع، حاشیه جنگل‌ها و دامنه‌های نیمه‌مرطوب زاگرس در ارتفاعات مختلف چهارمحال و بختیاری.",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "گل‌های کوچک زرد آن به‌صورت خوشه‌های بلند ظاهر می‌شوند و میوه‌های آن دارای خارهای قلاب‌مانند هستند."
            )

            "Amygdalus_arabica" -> PlantInfo(
                name = "بادام عربی",
                scientificName = "Amygdalus arabica",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار از گروه بادام‌های وحشی است که در نواحی خشک و سنگلاخی رشد می‌کند و در برابر کم‌آبی سازگاری بالایی دارد.",
                habitat = "دامنه‌های خشک و سنگلاخی زاگرس، به‌ویژه نواحی کم‌بارش و گرم‌تر چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بادام‌های وحشی از عناصر مهم پوشش درختچه‌ای مناطق خشک زاگرس هستند و در تثبیت خاک نقش دارند."
            )

            "Amygdalus_communis" -> PlantInfo(
                name = "بادام",
                scientificName = "Amygdalus communis",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های صورتی یا سفید است که میوه آن دارای هسته خوراکی بوده و یکی از مهم‌ترین گونه‌های میوه‌ای خانواده گل‌سرخیان محسوب می‌شود.",
                habitat = "باغ‌ها، باغستان‌ها و دامنه‌های کم‌ارتفاع زاگرس در چهارمحال و بختیاری، به‌ویژه مناطق مناسب برای کشت بادام.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بادام از نخستین درختان میوه‌ای است که پس از پایان زمستان گل می‌دهد و گل‌های آن پیش از ظهور کامل برگ‌ها ظاهر می‌شوند."
            )

            "Amygdalus_lycioides" -> PlantInfo(
                name = "بادام گرگی",
                scientificName = "Amygdalus lycioides",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار و مقاوم به خشکی است که در دامنه‌های سنگلاخی و مناطق خشک زاگرس به‌صورت خودرو دیده می‌شود.",
                habitat = "دامنه‌های خشک و سنگلاخی و رویشگاه‌های باز کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "شاخه‌های خاردار این بادام وحشی به کاهش چرای مستقیم و حفاظت نسبی از پایه گیاه کمک می‌کنند."
            )

            "Amygdalus_orientalis" -> PlantInfo(
                name = "بادام شرقی",
                scientificName = "Amygdalus orientalis",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خزان‌دار و مقاوم به خشکی است که در دامنه‌های سنگلاخی و مناطق نیمه‌خشک رشد می‌کند و گل‌های آن در اوایل فصل رویش ظاهر می‌شوند.",
                habitat = "دامنه‌های سنگلاخی و مناطق نیمه‌خشک زاگرس در بخش‌هایی از چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "بادام‌های وحشی با ریشه‌های گسترده می‌توانند در شرایط کم‌آبی و خاک‌های کم‌عمق کوهستانی زنده بمانند."
            )

            "Armeniaca_vulgaris" -> PlantInfo(
                name = "زردآلو",
                scientificName = "Armeniaca vulgaris",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های سفید یا صورتی و میوه‌ای زرد یا نارنجی است که در مناطق معتدل و سردسیر کشت می‌شود.",
                habitat = "باغ‌ها و مناطق کشاورزی کوهپایه‌ای زاگرس در چهارمحال و بختیاری.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "زردآلو معمولاً پیش از بازشدن کامل برگ‌ها گل می‌دهد و به همین دلیل گل‌های آن در برابر سرمای دیررس بهاره حساس‌اند."
            )

            "Cerasus_avium" -> PlantInfo(
                name = "گیلاس وحشی",
                scientificName = "Cerasus avium",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار و نسبتاً بلند با گل‌های سفید و میوه‌های گوشتی قرمز تا تیره است که در زیستگاه‌های کوهستانی و جنگلی رشد می‌کند.",
                habitat = "دره‌ها، دامنه‌های مرطوب و جنگل‌های بلوط و تنگه‌های کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "خوراکی، زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گیلاس شیرین یکی از گونه‌های مهم در پیدایش بسیاری از ارقام گیلاس زراعی امروزی است."
            )

            "Cerasus_mahaleb" -> PlantInfo(
                name = "محلب",
                scientificName = "Cerasus mahaleb",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه یا درخت کوچکی با گل‌های سفید خوشه‌ای و میوه‌های کوچک تیره‌رنگ است که در مناطق کوهستانی و خشک تا نیمه‌خشک رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی، دره‌ها و حاشیه جنگل‌های زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "دانه‌های محلب به دلیل عطر ویژه در برخی سنت‌های غذایی و صنایع معطرکننده استفاده شده‌اند."
            )

            "Cerasus_microcarpa" -> PlantInfo(
                name = "آلبالوی ریزمیوه",
                scientificName = "Cerasus microcarpa",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای از گروه گیلاس‌های وحشی است که میوه‌های کوچک دارد و معمولاً در زیستگاه‌های کوهستانی و سنگلاخی دیده می‌شود.",
                habitat = "دامنه‌ها و دره‌های سنگلاخی زاگرس در مناطق کوهستانی چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های کوچک این گروه از درختان می‌توانند برای پرندگان و دیگر جانوران میوه‌خوار منبع غذایی باشند."
            )

            "Cerasus_vulgaris" -> PlantInfo(
                name = "آلبالو",
                scientificName = "Cerasus vulgaris",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های سفید و میوه‌های قرمز ترش‌مزه است که به‌صورت گسترده در مناطق معتدل و سردسیر کشت می‌شود.",
                habitat = "باغ‌ها و باغستان‌های کوهپایه‌ای و سردسیر چهارمحال و بختیاری.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "آلبالو معمولاً نسبت به گیلاس شیرین اسیدیته بیشتری در میوه دارد و برای تهیه شربت، مربا و فرآورده‌های غذایی استفاده می‌شود."
            )

            "Crataegus_persica" -> PlantInfo(
                name = "زالزالک ایرانی",
                scientificName = "Crataegus persica",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه یا درخت کوچکی با شاخه‌های خاردار، گل‌های سفید و میوه‌های کوچک قرمز یا زرد است که از عناصر طبیعی پوشش درختچه‌ای زاگرس محسوب می‌شود.",
                habitat = "دامنه‌های کوهستانی، دره‌ها و حاشیه جنگل‌های زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "زالزالک‌ها از نظر بوم‌شناختی برای بسیاری از پرندگان و جانوران میوه‌خوار اهمیت دارند."
            )

            "Crataegus_pseudoheterophylla" -> PlantInfo(
                name = "زالزالک",
                scientificName = "Crataegus pseudoheterophylla",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار با برگ‌های متغیر، گل‌های سفید و میوه‌های کوچک گوشتی است که در رویشگاه‌های کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی، مراتع درختچه‌ای و حاشیه جنگل‌های زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "وجود خارهای قوی در بسیاری از گونه‌های زالزالک یکی از ویژگی‌های مشخص‌کننده این گروه در طبیعت است."
            )

            "Malus_domestica" -> PlantInfo(
                name = "سیب",
                scientificName = "Malus domestica",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های سفید تا صورتی و میوه‌ای گوشتی است که از مهم‌ترین درختان میوه‌ای مناطق معتدل جهان به‌شمار می‌رود.",
                habitat = "باغ‌ها و مناطق کشاورزی کوهپایه‌ای و سردسیر چهارمحال و بختیاری.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "سیب اهلی حاصل تاریخ طولانی اهلی‌سازی و انتخاب از خویشاوندان وحشی جنس Malus در آسیای مرکزی است."
            )

            "Persica_vulgaris" -> PlantInfo(
                name = "هلو",
                scientificName = "Persica vulgaris",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های صورتی و میوه‌ای گوشتی است که در مناطق معتدل و کوهپایه‌ای کشت می‌شود و به سرمای زمستانی مشخصی برای گل‌دهی نیاز دارد.",
                habitat = "باغ‌ها و مناطق کشاورزی کوهپایه‌ای چهارمحال و بختیاری و دامنه‌های مناسب زاگرس.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "هلو از نظر گیاه‌شناسی میوه‌ای هسته‌دار است و سطح هسته آن دارای شیارهای مشخص است."
            )

            "Potentilla_reptans" -> PlantInfo(
                name = "پنجه‌مرغی خزنده",
                scientificName = "Potentilla reptans",
                family = "Rosaceae (گل‌سرخیان)",
                description = "گیاهی علفی چندساله با ساقه‌های خزنده و گل‌های زرد پنج‌گلبرگی است که معمولاً در خاک‌های نسبتاً مرطوب رشد می‌کند.",
                habitat = "مراتع مرطوب، حاشیه جویبارها و زمین‌های علفی کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی",
                flowering = "تابستان",
                isEndangered = false,
                interestingFacts = "ساقه‌های رونده آن در محل گره‌ها ریشه‌دار می‌شوند و به گیاه امکان گسترش روی سطح خاک را می‌دهند."
            )

            "Potentilla_speciosa" -> PlantInfo(
                name = "پنجه‌مرغی زیبا",
                scientificName = "Potentilla speciosa",
                family = "Rosaceae (گل‌سرخیان)",
                description = "گیاهی علفی از جنس Potentilla با گل‌های مشخص و برگ‌های پنجه‌ای است که در زیستگاه‌های کوهستانی و سنگلاخی رشد می‌کند.",
                habitat = "دامنه‌های سنگلاخی و مراتع کوهستانی زاگرس در ارتفاعات چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گل‌های پنج‌گلبرگی بسیاری از گونه‌های Potentilla الگوی مشخصی از خانواده گل‌سرخیان را نشان می‌دهند."
            )

            "Prunus_domestica" -> PlantInfo(
                name = "آلو",
                scientificName = "Prunus domestica",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های سفید و میوه‌های گوشتی هسته‌دار است که ارقام متعددی از آن در مناطق معتدل و کوهستانی کشت می‌شوند.",
                habitat = "باغ‌ها و باغستان‌های کوهپایه‌ای و سردسیر چهارمحال و بختیاری.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه آلو از نوع شفت است و هسته سخت آن در مرکز بخش گوشتی میوه قرار دارد."
            )

            "Pyracantha_coccinea" -> PlantInfo(
                name = "پیراکانتا",
                scientificName = "Pyracantha coccinea",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای همیشه‌سبز تا نیمه‌همیشه‌سبز و خاردار با گل‌های سفید و میوه‌های نارنجی تا قرمز است که بیشتر به‌عنوان گیاه زینتی کاشته می‌شود.",
                habitat = "باغ‌ها، فضاهای سبز و مناطق کوهپایه‌ای زاگرس در چهارمحال و بختیاری؛ معمولاً به‌صورت کاشته‌شده.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های رنگارنگ پیراکانتا تا مدت زیادی روی بوته باقی می‌مانند و در فصل سرد می‌توانند مورد استفاده پرندگان قرار گیرند."
            )

            "Pyrus_communis" -> PlantInfo(
                name = "گلابی",
                scientificName = "Pyrus communis",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختی خزان‌دار با گل‌های سفید و میوه‌ای گوشتی است که در مناطق معتدل و کوهستانی با زمستان سرد قابلیت کشت دارد.",
                habitat = "باغ‌ها و باغستان‌های کوهپایه‌ای زاگرس در چهارمحال و بختیاری.",
                uses = "خوراکی، صنعتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گلابی اهلی به گروهی از گونه‌های گلابی وحشی اوراسیا وابسته است و تنوع ژنتیکی بالایی در ارقام آن وجود دارد."
            )

            "Pyrus_elaeagnifolia" -> PlantInfo(
                name = "گلابی برگ‌سنجدی",
                scientificName = "Pyrus elaeagnifolia",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درخت یا درختچه‌ای مقاوم به خشکی با برگ‌هایی پوشیده از کرک‌های نقره‌ای و میوه‌های کوچک است که در مناطق خشک و کوهستانی رشد می‌کند.",
                habitat = "دامنه‌های خشک و سنگلاخی زاگرس و مناطق کوهپایه‌ای چهارمحال و بختیاری.",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "پوشش کرکی و نقره‌ای سطح برگ‌ها به کاهش اتلاف آب و سازگاری گیاه با محیط‌های خشک کمک می‌کند."
            )

            "Pyrus_syriaca" -> PlantInfo(
                name = "گلابی سوری",
                scientificName = "Pyrus syriaca",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه یا درخت کوچکی از گلابی‌های وحشی خاورمیانه است که با شرایط خشک و نیمه‌خشک کوهستانی سازگاری دارد.",
                habitat = "دامنه‌های سنگلاخی و مناطق نیمه‌خشک زاگرس در چهارمحال و بختیاری.",
                uses = "خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گلابی‌های وحشی منطقه می‌توانند به‌عنوان ذخیره ژنتیکی ارزشمند برای اصلاح ارقام گلابی مورد توجه باشند."
            )

            "Rosa_canina" -> PlantInfo(
                name = "نسترن وحشی",
                scientificName = "Rosa canina",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار با گل‌های صورتی یا سفید و میوه‌های قرمز فنجانی‌شکل است که در بسیاری از زیستگاه‌های کوهستانی زاگرس دیده می‌شود.",
                habitat = "حاشیه جنگل‌های بلوط، دره‌ها، مراتع و دامنه‌های کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی، خوراکی، زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "میوه‌های نسترن که به هیپ معروف‌اند، پس از رسیدن قرمز می‌شوند و منبع قابل‌توجهی از ویتامین C هستند."
            )

            "Rosa_foetida" -> PlantInfo(
                name = "رز زرد",
                scientificName = "Rosa foetida",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار با گل‌های زرد روشن و بوی مشخص است که در مناطق خشک و کوهستانی غرب آسیا و بخش‌هایی از زاگرس یافت می‌شود.",
                habitat = "دامنه‌های خشک و سنگلاخی و رویشگاه‌های باز زاگرس در چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "این گونه یکی از رزهای زرد تاریخی در تبار اصلاحی رزهای باغی اروپا به‌شمار می‌رود."
            )

            "Rosa_orientalis" -> PlantInfo(
                name = "نسترن شرقی",
                scientificName = "Rosa orientalis",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای خاردار از جنس Rosa است که در زیستگاه‌های کوهستانی و دامنه‌های سنگلاخی رشد می‌کند و گل‌های آن معمولاً در فصل بهار ظاهر می‌شوند.",
                habitat = "دامنه‌ها، دره‌ها و رویشگاه‌های نیمه‌خشک و کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های رز وحشی از منابع مهم تنوع ژنتیکی برای اصلاح و ایجاد ارقام جدید رزهای باغی هستند."
            )

            "Sanguisorba_minor" -> PlantInfo(
                name = "خون‌سیاوشان کوچک",
                scientificName = "Sanguisorba minor",
                family = "Rosaceae (گل‌سرخیان)",
                description = "گیاهی علفی چندساله با برگ‌های مرکب و برگچه‌های دندانه‌دار است که در مراتع خشک و نیمه‌خشک رشد می‌کند و گل‌آذین‌های کروی کوچک دارد.",
                habitat = "مراتع، دامنه‌های سنگلاخی و چمنزارهای کوهستانی زاگرس در چهارمحال و بختیاری.",
                uses = "دارویی، خوراکی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "برگ‌های جوان این گیاه در برخی مناطق به‌صورت سبزی خوراکی مصرف می‌شوند و طعمی نسبتاً شبیه خیار دارند."
            )

            "Sorbus_persica" -> PlantInfo(
                name = "سرو کوهی ایرانی",
                scientificName = "Sorbus persica",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه یا درخت کوچکی از جنس Sorbus است که در زیستگاه‌های کوهستانی رشد می‌کند و میوه‌های کوچک آن پس از رسیدن رنگی روشن تا قرمز پیدا می‌کنند.",
                habitat = "ارتفاعات، دامنه‌های سنگلاخی و رویشگاه‌های جنگلی زاگرس در چهارمحال و بختیاری.",
                uses = "زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "گونه‌های جنس Sorbus به دلیل میوه‌های رنگارنگ خود از منابع غذایی مهم برخی پرندگان در زیستگاه‌های کوهستانی هستند."
            )

            "Spartium_junceum" -> PlantInfo(
                name = "اسپارتیم",
                scientificName = "Spartium junceum",
                family = "Rosaceae (گل‌سرخیان)",
                description = "درختچه‌ای چندساله با ساقه‌های سبز و تقریباً بدون برگ و گل‌های زرد درخشان است که در مناطق خشک و گرم رشد می‌کند.",
                habitat = "دامنه‌های خشک و مناطق باز کوهپایه‌ای زاگرس در چهارمحال و بختیاری، عمدتاً در کشت‌های زینتی و مناطق دست‌خورده.",
                uses = "صنعتی، زینتی",
                flowering = "بهار",
                isEndangered = false,
                interestingFacts = "الیاف ساقه‌های اسپارتیم از گذشته برای تولید طناب و برخی فرآورده‌های الیافی استفاده شده‌اند."
            )

            // ═══════════════════════════════════════════
            // مقدار پیش‌فرض
            // ═══════════════════════════════════════════
            else -> PlantInfo(
                name = className.replace("_", " "),
                scientificName = className.replace("_", " "),
                family = "نامشخص",
                description = "اطلاعات بیشتری در دسترس نیست",
                habitat = "استان چهارمحال و بختیاری",
                uses = "-",
                flowering = "-",
                isEndangered = false,
                interestingFacts = "-"
            )
        }
    }
}