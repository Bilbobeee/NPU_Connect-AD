import java.util.Map;
import java.util.TreeMap;

class Library {

    private final Map<Integer, String> INDEX_SPA = new TreeMap<>();
    private final Map<String, String> ABBREVIATION_GUNPU = new TreeMap<>();
    private final Map<String, String> ABBREVIATION_MTOU = new TreeMap<>();

    public Map<String, String> getABBREVIATION_MTOU() {
        return ABBREVIATION_MTOU;
    }

    public Map<String, String> getABBREVIATION_GUNPU() {
        return ABBREVIATION_GUNPU;
    }

    public Map<Integer, String> getINDEX_SPA() {
        return INDEX_SPA;
    }

    {
        INDEX_SPA.put(11, "Департамент документального забезпечення");
        INDEX_SPA.put(12, "Департамент кадрового забезпечення");
        INDEX_SPA.put(13, "Управління режиму та технічного захисту інформації");
        INDEX_SPA.put(14, "Департамент карного розшуку");
        INDEX_SPA.put(15, "Департамент головної інспекції");
        INDEX_SPA.put(16, "Департамент боротьби зі злочинами, пов’язаними з торгівлею людьми");
        INDEX_SPA.put(17, "Департамент оперативної служби");
        INDEX_SPA.put(18, "Департамент оперативно-технічних заходів");
        INDEX_SPA.put(19, "Департамент забезпечення діяльності, пов’язаної з небезпечними матеріалами");
        INDEX_SPA.put(20, "Департамент превентивної діяльності");
        INDEX_SPA.put(21, "Департамент оперативної підтримки");
        INDEX_SPA.put(22, "Департамент «Корпусу оперативно-раптової дії»");
        INDEX_SPA.put(23, "Департамент міжнародного поліцейського співробітництва");
        INDEX_SPA.put(24, "Головне слідче управління");
        INDEX_SPA.put(25, "Департамент організаційно-аналітичного забезпечення та оперативного реагування");
        INDEX_SPA.put(26, "Правовий департамент");
        INDEX_SPA.put(27, "Департамент інформаційно-аналітичної підтримки");
        INDEX_SPA.put(28, "Департамент комунікації");
        INDEX_SPA.put(29, "Департамент фінансового забезпечення та бухгалтерського обліку");
        INDEX_SPA.put(30, "Департамент внутрішнього аудиту");
        INDEX_SPA.put(31, "Департамент управління майном");
        INDEX_SPA.put(32, "Департамент вибухотехнічної служби");
        INDEX_SPA.put(33, "Управління кримінального аналізу");
        INDEX_SPA.put(34, "Управління організації діяльності підрозділів поліції на воді та повітряної підтримки");
        INDEX_SPA.put(35, "Відділ організації кінологічної діяльності");
        INDEX_SPA.put(36, "Відділ спеціального зв’язку");
        INDEX_SPA.put(37, "Управління забезпечення прав людини");
        INDEX_SPA.put(38, "Департамент кіберполіції");
        INDEX_SPA.put(40, "Департамент протидії наркозлочинності");
        INDEX_SPA.put(41, "Департамент патрульної поліції");
        INDEX_SPA.put(42, "Департамент внутрішньої безпеки");
        INDEX_SPA.put(43, "Департамент поліції охорони");
        INDEX_SPA.put(44, "Чергова частина НПУ");
        INDEX_SPA.put(45, "Департамент зв’язку та телекомунікацій");
        INDEX_SPA.put(46, "Департамент захисту інтересів суспільства і держави");
        INDEX_SPA.put(47, "Управління з питань запобігання корупції та проведення люстрації");
        INDEX_SPA.put(48, "Сектор з питань пенсійного забезпечення");
        INDEX_SPA.put(49, "Управління дізнання");
        INDEX_SPA.put(50, "Департамент забезпечення діяльності Голови");
        INDEX_SPA.put(51, "Державна установа «Центр обслуговування підрозділів Національної поліції України»");
        INDEX_SPA.put(52, "Державна установа «Навчальний центр Вибухотехнічної служби»");
        INDEX_SPA.put(53, "Державна установа «Рівненська академія патрульної поліції»");
        INDEX_SPA.put(54, "Державна установа «Поліцейська академія»");
        INDEX_SPA.put(55, "Департамент стратегічних розслідувань");
        INDEX_SPA.put(56, "Державна установа «Волинський навчальний центр підготовки поліцейських»");
        INDEX_SPA.put(57, "Відділ контролю за обігом зброї");
        INDEX_SPA.put(58, "Управління ювенальної превенції");
    }

    {
//        ABBREVIATION_GUNPU.put("CA", "Центральний Апарат Національної поліції України");
        ABBREVIATION_GUNPU.put("KI", "ГУНП у м. Києві");
        ABBREVIATION_GUNPU.put("VN", "ГУНП у Вінницькій області");
        ABBREVIATION_GUNPU.put("VL", "ГУНП у Волинській області");
        ABBREVIATION_GUNPU.put("DP", "ГУНП у Дніпропетровській області");
        ABBREVIATION_GUNPU.put("DN", "ГУНП у Донецькій області");
        ABBREVIATION_GUNPU.put("ZT", "ГУНП у Житомирській області");
        ABBREVIATION_GUNPU.put("ZK", "ГУНП у Закарпатській області");
        ABBREVIATION_GUNPU.put("ZP", "ГУНП у Запорізькій області");
        ABBREVIATION_GUNPU.put("IF", "ГУНП у Івано-Франківській області");
        ABBREVIATION_GUNPU.put("KV", "ГУНП у Київській області");
        ABBREVIATION_GUNPU.put("KG", "ГУНП у Кіровоградській області");
        ABBREVIATION_GUNPU.put("LG", "ГУНП у Луганській області");
        ABBREVIATION_GUNPU.put("LV", "ГУНП у Львівській області");
        ABBREVIATION_GUNPU.put("MK", "ГУНП у Миколаївській області");
        ABBREVIATION_GUNPU.put("OD", "ГУНП у Одеській області");
        ABBREVIATION_GUNPU.put("PL", "ГУНП у Полтавській області");
        ABBREVIATION_GUNPU.put("RV", "ГУНП у Рівненській області");
        ABBREVIATION_GUNPU.put("SU", "ГУНП у Сумській області");
        ABBREVIATION_GUNPU.put("TP", "ГУНП у Тернопільській області");
        ABBREVIATION_GUNPU.put("KH", "ГУНП у Харківській області");
        ABBREVIATION_GUNPU.put("KN", "ГУНП у Херсонській області");
        ABBREVIATION_GUNPU.put("KM", "ГУНП у Хмельницькій області");
        ABBREVIATION_GUNPU.put("CK", "ГУНП у Черкаській області");
        ABBREVIATION_GUNPU.put("CN", "ГУНП у Чернівецькій області");
        ABBREVIATION_GUNPU.put("CV", "ГУНП у Чернігівській області");
        ABBREVIATION_GUNPU.put("CR", "ГУНП у Автономній республіці Крим та м. Севастополі");
    }

    {
        ABBREVIATION_MTOU.put("VI","місто Вінниця, Вінницький район");
        ABBREVIATION_MTOU.put("GA","місто Гайсин, Гайсинський район");
        ABBREVIATION_MTOU.put("ZM","місто Жмеринка, Жмеринський район");
        ABBREVIATION_MTOU.put("MG","місто Могилів-Подільський, Могилів-Подільський район");
        ABBREVIATION_MTOU.put("TL","місто Тульчин, Тульчинський район");
        ABBREVIATION_MTOU.put("HM","місто Хмільник, Хмільницький район");
        ABBREVIATION_MTOU.put("VL","місто Володимир-Волинський, Володимир-Волинський район");
        ABBREVIATION_MTOU.put("KK","місто Камінь-Каширський, Камінь-Каширський район");
        ABBREVIATION_MTOU.put("KE","місто Ковель, Ковельський район");
        ABBREVIATION_MTOU.put("LU","місто Луцьк, Луцький район");
        ABBREVIATION_MTOU.put("DP","місто Дніпро, Дніпровський район");
        ABBREVIATION_MTOU.put("KA","місто Кам'янське, Кам'янський район");
        ABBREVIATION_MTOU.put("KV","місто Кривий Ріг, Криворізький район");
        ABBREVIATION_MTOU.put("NI","місто Нікополь, Нікопольський район");
        ABBREVIATION_MTOU.put("NM","місто Новомосковськ, Новомосковський район");
        ABBREVIATION_MTOU.put("PG","місто Павлоград, Павлоградський район");
        ABBREVIATION_MTOU.put("SN","місто Синельникове, Синельниківський район");
        ABBREVIATION_MTOU.put("BM","місто Бахмут, Бахмутський район");
        ABBREVIATION_MTOU.put("VO","місто Волноваха, Волноваський район");
        ABBREVIATION_MTOU.put("GR","місто Горлівка, Горлівський район");
        ABBREVIATION_MTOU.put("DN","місто Донецьк, Донецький район");
        ABBREVIATION_MTOU.put("KL","місто Кальміуське, Кальміуський район");
        ABBREVIATION_MTOU.put("KT","місто Краматорськ, Краматорський район");
        ABBREVIATION_MTOU.put("MP","місто Маріуполь, Маріупольський район");
        ABBREVIATION_MTOU.put("PV","місто Покровськ, Покровський район");
        ABBREVIATION_MTOU.put("BV","місто Бердичів, Бердичівський район");
        ABBREVIATION_MTOU.put("ZT","місто Житомир, Житомирський район");
        ABBREVIATION_MTOU.put("KN","місто Коростень, Коростенський район");
        ABBREVIATION_MTOU.put("NV","місто Новоград-Волинський, Новоград-Волинський район");
        ABBREVIATION_MTOU.put("BK","місто Берегове, Берегівський район");
        ABBREVIATION_MTOU.put("MK","місто Мукачево, Мукачівський район");
        ABBREVIATION_MTOU.put("RH","місто Рахів, Рахівський район");
        ABBREVIATION_MTOU.put("TK","місто Тячів, Тячівський район");
        ABBREVIATION_MTOU.put("UZ","місто Ужгород, Ужгородський район");
        ABBREVIATION_MTOU.put("HS","місто Хуст, Хустський район");
        ABBREVIATION_MTOU.put("BD","місто Бердянськ, Бердянський район");
        ABBREVIATION_MTOU.put("VS","місто Василівка, Василівський район");
        ABBREVIATION_MTOU.put("ZP","місто Запоріжжя, Запорізький район");
        ABBREVIATION_MTOU.put("ML","місто Мелітополь, Мелітопольський район");
        ABBREVIATION_MTOU.put("PL","місто Пологи, Пологівський район");
        ABBREVIATION_MTOU.put("VH","смт. Верховина, Верховинський район");
        ABBREVIATION_MTOU.put("IF","місто Івано-Франківськ, Івано-Франківський район");
        ABBREVIATION_MTOU.put("KS","місто Калуш, Калуський район");
        ABBREVIATION_MTOU.put("KM","місто Коломия, Коломийський район");
        ABBREVIATION_MTOU.put("KO","місто Косів, Косівський район");
        ABBREVIATION_MTOU.put("ND","місто Надвірна, Надвірнянський район");
        ABBREVIATION_MTOU.put("BC","місто Біла Церква, Білоцерківський район");
        ABBREVIATION_MTOU.put("BR","місто Бориспіль, Бориспільський район");
        ABBREVIATION_MTOU.put("BS","місто Бровари, Броварський район");
        ABBREVIATION_MTOU.put("BI","місто Буча, Бучанський район");
        ABBREVIATION_MTOU.put("VG","місто Вишгород, Вишгородський район");
        ABBREVIATION_MTOU.put("OH","місто Обухів, Обухівський район");
        ABBREVIATION_MTOU.put("FS","місто Фастів, Фастівський район");
        ABBREVIATION_MTOU.put("GL","смт. Голованівськ, Голованівський район");
        ABBREVIATION_MTOU.put("KP","місто Кропивницький, Кропивницький район");
        ABBREVIATION_MTOU.put("NU","місто Новоукраїнка, Новоукраїнський район");
        ABBREVIATION_MTOU.put("OK","місто Олександрія, Олександрійський район");
        ABBREVIATION_MTOU.put("AC","місто Алчевськ, Алчевський район");
        ABBREVIATION_MTOU.put("DV","місто Довжанськ, Довжанський район");
        ABBREVIATION_MTOU.put("LG","місто Луганськ, Луганський район");
        ABBREVIATION_MTOU.put("RV","місто Ровеньки, Ровеньківський район");
        ABBREVIATION_MTOU.put("ST","місто Сватове, Сватівський район");
        ABBREVIATION_MTOU.put("SV","місто Сєвєродонецьк, Сєвєродонецький район");
        ABBREVIATION_MTOU.put("SR","місто Старобільськ, Старобільський район");
        ABBREVIATION_MTOU.put("SK","смт. Новоайдар, Щастинський район");
        ABBREVIATION_MTOU.put("DG","місто Дрогобич, Дрогобицький район");
        ABBREVIATION_MTOU.put("ZK","місто Золочів, Золочівський район");
        ABBREVIATION_MTOU.put("LV","місто Львів, Львівський район");
        ABBREVIATION_MTOU.put("SB","місто Самбір, Самбірський район");
        ABBREVIATION_MTOU.put("SC","місто Стрий, Стрийський район");
        ABBREVIATION_MTOU.put("CV","місто Червоноград, Червоноградський район");
        ABBREVIATION_MTOU.put("IV","місто Яворів, Яворівський район");
        ABBREVIATION_MTOU.put("BT","місто Баштанка, Баштанський район");
        ABBREVIATION_MTOU.put("VZ","місто Вознесенськ, Вознесенський район");
        ABBREVIATION_MTOU.put("MV","місто Миколаїв, Миколаївський район");
        ABBREVIATION_MTOU.put("PM","місто Первомайськ, Первомайський район");
        ABBREVIATION_MTOU.put("BE","місто Березівка, Березівський район");
        ABBREVIATION_MTOU.put("BG","місто Білгород-Дністровський, Білгород-Дністровський район");
        ABBREVIATION_MTOU.put("BL","місто Болград, Болградський район");
        ABBREVIATION_MTOU.put("IZ","місто Ізмаїл, Ізмаїльський район");
        ABBREVIATION_MTOU.put("OD","місто Одеса, Одеський район");
        ABBREVIATION_MTOU.put("PD","місто Подільськ, Подільський район");
        ABBREVIATION_MTOU.put("RD","місто Роздільна, Роздільнянський район");
        ABBREVIATION_MTOU.put("KR","місто Кременчук, Кременчуцький район");
        ABBREVIATION_MTOU.put("LB","місто Лубни, Лубенський район");
        ABBREVIATION_MTOU.put("MR","місто Миргород, Миргородський район");
        ABBREVIATION_MTOU.put("PT","місто Полтава, Полтавський район");
        ABBREVIATION_MTOU.put("VR","місто Вараш, Вараський район");
        ABBREVIATION_MTOU.put("DB","місто Дубно, Дубенський район");
        ABBREVIATION_MTOU.put("RN","місто Рівне, Рівненський район");
        ABBREVIATION_MTOU.put("SE","місто Сарни, Сарненський район");
        ABBREVIATION_MTOU.put("KU","місто Конотоп, Конотопський район");
        ABBREVIATION_MTOU.put("OT","місто Охтирка, Охтирський район");
        ABBREVIATION_MTOU.put("RO","місто Ромни, Роменський район");
        ABBREVIATION_MTOU.put("SU","місто Суми, Сумський район");
        ABBREVIATION_MTOU.put("SH","місто Шостка, Шосткинський район");
        ABBREVIATION_MTOU.put("KC","місто Кременець, Кременецький район");
        ABBREVIATION_MTOU.put("TP","місто Тернопіль, Тернопільський район");
        ABBREVIATION_MTOU.put("CR","місто Чортків, Чортківський район");
        ABBREVIATION_MTOU.put("BO","місто Богодухів, Богодухівський район");
        ABBREVIATION_MTOU.put("IM","місто Ізюм, Ізюмський район");
        ABBREVIATION_MTOU.put("KG","місто Красноград, Красноградський район");
        ABBREVIATION_MTOU.put("KY","місто Куп'янськ, Куп'янський район");
        ABBREVIATION_MTOU.put("LO","місто Лозова, Лозівський район");
        ABBREVIATION_MTOU.put("KH","місто Харків, Харківський район");
        ABBREVIATION_MTOU.put("CU","місто Чугуїв, Чугуївський район");
        ABBREVIATION_MTOU.put("BU","місто Берислав, Бериславський район");
        ABBREVIATION_MTOU.put("GN","місто Генічеськ, Генічеський район");
        ABBREVIATION_MTOU.put("NK","місто Нова Каховка, Каховський район");
        ABBREVIATION_MTOU.put("SD","місто Скадовськ, Скадовський район");
        ABBREVIATION_MTOU.put("KB","місто Херсон, Херсонський район");
        ABBREVIATION_MTOU.put("KD","місто Кам'янець-Подільський, Кам'янець-Подільський район");
        ABBREVIATION_MTOU.put("KI","місто Хмельницький, Хмельницький район");
        ABBREVIATION_MTOU.put("SP","місто Шепетівка, Шепетівський район");
        ABBREVIATION_MTOU.put("ZV","місто Звенигородка, Звенигородський район");
        ABBREVIATION_MTOU.put("ZL","місто Золотоноша, Золотоніський район");
        ABBREVIATION_MTOU.put("UM","місто Умань, Уманський район");
        ABBREVIATION_MTOU.put("CK","місто Черкаси, Черкаський район");
        ABBREVIATION_MTOU.put("VN","місто Вижниця, Вижницький район");
        ABBREVIATION_MTOU.put("DS","смт. Кельменці, Дністровський район");
        ABBREVIATION_MTOU.put("CN","місто Чернівці, Чернівецький район");
        ABBREVIATION_MTOU.put("KW","місто Корюківка, Корюківський район");
        ABBREVIATION_MTOU.put("NZ","місто Ніжин, Ніжинський район");
        ABBREVIATION_MTOU.put("NS","місто Новгород-Сіверський, Новгород-Сіверський район");
        ABBREVIATION_MTOU.put("PR","місто Прилуки, Прилуцький район");
        ABBREVIATION_MTOU.put("CG","місто Чернігів, Чернігівський район");

    }


}
