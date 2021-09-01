package pro.sky.java.course1.homework4;

import java.util.Arrays;

public class Homework4 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        //Задача 1
        int sum = 0;
        int[] expenses = generateRandomArray();
        for (int daily : expenses) {
            sum += daily;
        }
        System.out.println("Сумма затрат за месяц составляет " + sum + " рублей.");
        System.out.println("***");
    }

    private static void task2() {
        //Задача 2
        int[] expenses = generateRandomArray();
        int maxExpenses = -1;
        int minExpenses = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (maxExpenses < expenses[i]) {
                maxExpenses = expenses[i];
                minExpenses = maxExpenses++;
            } else if (minExpenses > expenses[i]) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Максимальные затраты за день составляют " + maxExpenses + " рублей.");
        System.out.println("Минимальные затраты за день составляют " + minExpenses + " рублей.");
        System.out.println("***");
    }

    private static void task3() {
        //Задача 3
        int sum = 0;
        int[] expenses = generateRandomArray();
        for (int daily : expenses) {
            sum += daily;
        }
        double summary = sum;
        double averageExpenses = summary / expenses.length;
        System.out.println("Средние затраты за месяц составили " + averageExpenses + " рублей.");
        System.out.println("***");
    }

    private static void task4() {
        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("***");
    }

    private static void task5() {
        //Задача 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == i || j + i == matrix.length - 1) {
                    matrix[j][i] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("***");
    }

    private static void task6() {
        //Задача 6
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrSort = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arrSort[i] = arr[arr.length - i - 1];
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(arrSort));
        System.out.println("***");
    }

    private static void task7() {
        //Задача 7
        int[] arr = {5, 4, 3, 2, 1};
        String b = Arrays.toString(arr);
        System.out.println(b);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***");
    }

    private static void task8() {
        //Задача 8
        int[] arr = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Числа " + arr[i] + " и " + arr[j]);
                }
                break;
            }
        }
        System.out.println("***");

    }

    private static void task9() {
        //Задача 9
        int[] arr = {-6, 4, 5, -8, 8, 10, 1, -7, 12, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Числа " + arr[i] + " и " + arr[j]);
                }
            }
        }
    }
}