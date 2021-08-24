package pro.sky.java.course1.homework2;

public class Homework2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        //Задача 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        //Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2019) {
            System.out.println("Установите Lite-версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2019) {
            System.out.println("Установите полную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2019) {
            System.out.println("Установите Lite-версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
    }

    private static void task3() {
        //Задача 3
        int year = 2100;
        int leapYear4 = 4;
        int leapYear400 = 400;
        int notLeapYear = 100;
        if ((year % leapYear4 == 0 && year % notLeapYear != 0) || (year % leapYear400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task4() {
        //Задача 4
        int deliveryTime = 0;
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            deliveryTime++;
            System.out.println("Доставка на расстояние " + deliveryDistance + " км займет " + deliveryTime + " день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Доставка на расстояние " + deliveryDistance + " км займет " + deliveryTime + " дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Доставка на расстояние " + deliveryDistance + " км займет " + deliveryTime + " дня.");
        } else {
            System.out.println("Сожалеем, но в данный момент доставка на ваш адрес не осуществляется, воспользуйтесь услугой самовывоза");
        }
    }

    private static void task5() {
        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("На дворе зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень на улице.");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }

    private static void task6() {
        //Задача 6
        int age = 19;
        int youngAge = 23;
        double salary = 58_000;
        double youngRate = 2;
        double adultRate = 3;
        double middleSalary = 50_000;
        double highSalary = 80_000;
        double lowClassRate = 1;
        double middleClassRate = 1.2;
        double highClassRate = 1.5;
        double creditLimit = 0;
        if (age < youngAge) {
            creditLimit = salary * youngRate;
        } else {
            creditLimit = salary * adultRate;
        }
        if (salary >= middleSalary && salary <= highSalary) {
            creditLimit = creditLimit * middleClassRate;
        } else if (salary > highSalary) {
            creditLimit = creditLimit * highClassRate;
        } else {
            creditLimit = creditLimit * lowClassRate;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
    }

    private static void task7() {
        //Задача 7
        int age = 25;
        int youngAge = 23;
        int middleAge = 30;
        double salary = 60000;
        double wantedSum = 330000;
        double baseRate = 10;
        double creditTerm = 12;
        double youngRate = 1;
        double middleRate = 0.5;
        double highSalaryRate = 0.7;
        double maxPaymentPercent = 50;
        if (age < youngAge) {
            baseRate = baseRate + youngRate;
        } else if (age >= youngAge && age <= middleAge) {
            baseRate = baseRate + middleRate;
        }
        if (salary > 80000) {
            baseRate = baseRate - highSalaryRate;
        }
        double monthlyPayment = (wantedSum + wantedSum / 100 * baseRate) / creditTerm;
        double maxMonthlyPayment = salary / 100 * maxPaymentPercent;
        if (monthlyPayment <= maxMonthlyPayment) {
            System.out.println("Максимальный платеж по кредиту при ЗП " + salary + " рублей равен " + maxMonthlyPayment + " рублей.\nПлатеж по кредиту составит " + monthlyPayment + " рублей.\nОдобрено!");
        } else {
            System.out.println("Максимальный платеж по кредиту при ЗП " + salary + " рублей равен " + maxMonthlyPayment + " рублей.\nПлатеж по кредиту составит " + monthlyPayment + " рублей.\nОтказано!");
        }
    }
}


