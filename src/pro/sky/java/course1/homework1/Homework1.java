package pro.sky.java.course1.homework1;

public class Homework1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task1() {
        // Задача 1
        byte a = -10;
        short b = 11_554;
        int c = 77_457_745;
        long d = 9_223_315_351_315_315_311L;
        double e = 121326.2351321;
        float f = 10.4f;
        char g = '!';
        boolean h = true;
        //далее код для проверки
        /* System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);*/
    }

    private static void task2() {
        //Задача 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.2;
        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Сумманый вес обоих бойцов: " + totalWeight + " кг");
        double weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса бойцов: " + weightDifference + " кг");
    }

    private static void task3() {
        double bananaWeight = 80;
        double milkWeight = 105;
        double iceCreamWeight = 100;
        double eggWeight = 70;
        int bananasNumber = 5;
        int milkValue = 2;
        int iceCreamNumber = 2;
        int eggsNumber = 4;
        int conversionKgs = 1000;
        double breakfastWeight = bananaWeight * bananasNumber + milkWeight * milkValue + iceCreamWeight * iceCreamNumber + eggWeight * eggsNumber;
        breakfastWeight = breakfastWeight / conversionKgs;
        System.out.println("Вес спорт-завтрака составляет " + breakfastWeight + " кг");
    }

    private static void task4() {
        //Задача 4
        double totalWeightLoss = 7;
        double lightDiet = 250;
        int conversionKgs = 1000;
        lightDiet = lightDiet / conversionKgs;
        double strictDiet = 500;
        strictDiet = strictDiet / conversionKgs;
        double lightDietDays = totalWeightLoss / lightDiet;
        int lightDietDays1 = (int) lightDietDays;
        System.out.println("На легкой диете спортсмен похудеет за " + lightDietDays1 + " дней");
        double strictDietDays = totalWeightLoss / strictDiet;
        int strictDietDays1 = (int) strictDietDays;
        System.out.println("На строгой диете спортсмен похудеет за " + strictDietDays1 + " дней");
        int averageDietDays = (lightDietDays1 + strictDietDays1) / 2;
        System.out.println("В среднем спортсмену на похудение понадобится " + averageDietDays + " день");
    }

    private static void task5() {
        //Задача 5
        int increasePercent = 10;
        int monthInYear = 12;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int salaryMashaIncreased = salaryMasha + salaryMasha / increasePercent;
        int salaryDenisIncreased = salaryDenis + salaryDenis / increasePercent;
        int salaryChristinaIncreased = salaryChristina + salaryChristina / increasePercent;
        int salaryMashaAnnualDifference = (salaryMashaIncreased - salaryMasha) * monthInYear;
        int salaryDenisAnnualDifference = (salaryDenisIncreased - salaryDenis) * monthInYear;
        int salaryChristinaAnnualDifference = (salaryChristinaIncreased - salaryChristina) * monthInYear;
        System.out.println("Маша теперь получает " + salaryMashaIncreased + " рублей. Годовой доход вырос на " + salaryMashaAnnualDifference + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisIncreased + " рублей. Годовой доход вырос на " + salaryDenisAnnualDifference + " рублей.");
        System.out.println("Кристина теперь получает " + salaryChristinaIncreased + " рублей. Годовой доход вырос на " + salaryChristinaAnnualDifference + " рублей.");
    }

    private static void task6() {
        //Задача 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Инвертированный результат выражения : " + result);
    }

    private static void task7() {
        //Задача 7
        int a = 5;
        int b = 7;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Теперь переменная a равна " + a + ", а переменнная b равна " + b);
    }

    private static void task8() {
        //Задача 8
        int a = 813;
        int b = a / 10 % 10;
        System.out.println("Центральная цифра в числе " + a + " это " + b);
    }
}
