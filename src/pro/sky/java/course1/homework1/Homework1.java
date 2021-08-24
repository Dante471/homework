package pro.sky.java.course1.homework1;

public class Homework1 {

    public static void main(String[] args) {
        // Задача 1
        byte byt = -10;
        short sho = 11_554;
        int in = 77_457_745;
        long lon = 9_223_315_351_315_315_311L;
        double dou = 121326.2351321;
        float fl = 10.4f;
        char ch = '!';
        boolean boo = true;
        //далее код для проверки
        /* System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);*/

        //Задача 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.2;
        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Сумманый вес обоих бойцов: " + totalWeight + " кг");
        double weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса бойцов: " + weightDifference + " кг");

        //Задача 3
        double bananaWeight = 80;
        double milkWeight = 105;
        double iceCreamWeight = 100;
        double eggWeight = 70;
        int bananasNumber = 5;
        int milkValue = 2;
        int iceCreamNumber = 2;
        int eggsNumber = 4;
        int conversionKgs = 1000;    // Здесь и далее переменная используется для перевода граммов в килограммы
        double breakfastWeight = bananaWeight * bananasNumber + milkWeight * milkValue + iceCreamWeight * iceCreamNumber + eggWeight * eggsNumber;
        breakfastWeight = breakfastWeight / conversionKgs;
        System.out.println("Вес спорт-завтрака составляет " + breakfastWeight + " кг");

        //Задача 4
        double totalWeightLoss = 7;
        double lightDiet = 250;
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

        //Задача 5
        int increasePercent = 10;
        int monthInYear = 12; // Переменная указывает на число месяцев в году
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

        //Задача 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Инвертированный результат выражения : " + result);

        //Задача 7
        //Названия переменных изменены, чтобы отличаться от предыдущего задания a -> x, b -> y
        //решение 1
        int x = 5;
        int y = 7;
        ++x;
        ++x;
        --y;
        --y;
        System.out.println("Теперь переменная x равна " + x + ", а переменнная y равна " + y);
        //решение 2
        // a->i, b->f
        int i = 5;
        int f = 7;
        i = i + f % i;
        f = f - f / i - f / i;
        System.out.println("Теперь переменная i равна " + i + ", а переменнная f равна " + f);
        //решение 3
        //a -> n, b -> m
        int n = 5;
        int m = 7;
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("Теперь переменная n равна " + n + ", а переменнная m равна " + m);


        //Задача 8
        // Названия переменных изменены, чтобы отличаться от предыдущего задания a -> q, b -> z.
        // Решение 1
        int q = 191;
        int u = q / 10;
        int p = q / 100 * 10;
        int z = u % p;
        System.out.println("Центральная цифра в числе " + q + " это " + z);
        // Решение 2
        //a -> v, b -> w
        int v = 813;
        int w = v / 10 % 10;
        System.out.println("Центральная цифра в числе " + v + " это " + w);
    }
}
