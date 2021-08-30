package pro.sky.java.course1.homework3;

public class Homework3 {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Задача №1:");
        int x = 1;
        while (x < 11) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n***");
    }

    private static void task2() {
        System.out.println("Задача №2:");
        for (int f = 6; f <= 31; f += 7) {
            System.out.println("Сегодня пятница, " + f + "-ое число. Необходимо подготовить отчет.");
        }
        System.out.println("\n***");
    }

    private static void task3() {
        System.out.println("Задача №3:");
        int presentYear = 2021;
        int yearOfComet = 79;
        int pastYear = presentYear - 200;
        int futureYear = presentYear + 100;
        for (int i = pastYear; i <= futureYear; i++) {
            if (i % yearOfComet == 0) {
                System.out.println(i + "\n");
            }
        }
        System.out.println("\n***");
    }

    private static void task4() {
        System.out.println("Задача №4:");
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
        System.out.println("\n***");
    }

    private static void task5() {
        System.out.println("Задача №5:");
        int a = 0;
        int b = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;

        }
    }
}
