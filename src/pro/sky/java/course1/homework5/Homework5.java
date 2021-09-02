package pro.sky.java.course1.homework5;

import java.util.Arrays;

public class Homework5 {

    public static void main(String[] args) {
        tasks1and2and3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void tasks1and2and3() {
        //Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задача 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        //Задача 3
        String semicolonFullName = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела – " + semicolonFullName);
    }

    private static void task4() {
        //Задача 4
        String fullNameRus = "Иванов Семён Семёнович";
        String changedFullNameRus = fullNameRus.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + changedFullNameRus);
    }

    private static void task5() {
        //Задача 5
        String fullNameSplit = "Ivanov Ivan Ivanovich";
        String firstNameSplit = fullNameSplit.substring(fullNameSplit.indexOf(' ') + 1, fullNameSplit.lastIndexOf(' '));
        String middleNameSplit = fullNameSplit.substring(fullNameSplit.lastIndexOf(' ') + 1);
        String lastNameSplit = fullNameSplit.substring(0, fullNameSplit.indexOf(' '));
        System.out.println("Имя сотрудника - " + firstNameSplit);
        System.out.println("Отчество сотрудника - " + middleNameSplit);
        System.out.println("Фамилия сотрудника - " + lastNameSplit);
    }

    private static void task6() {
        //Задача 6
        String fullNameLower = "ivanov ivan ivanovich";
        char lit1 = fullNameLower.charAt(0);
        char litUp1 = Character.toUpperCase(lit1);
        char lit2 = fullNameLower.charAt(fullNameLower.indexOf(' ') + 1);
        char litUp2 = Character.toUpperCase(lit2);
        char lit3 = fullNameLower.charAt(fullNameLower.lastIndexOf(' ') + 1);
        char litUp3 = Character.toUpperCase(lit3);
        StringBuilder s = new StringBuilder(fullNameLower);
        s.setCharAt(0, litUp1);
        s.setCharAt(fullNameLower.indexOf(' ') + 1, litUp2);
        s.setCharAt(fullNameLower.lastIndexOf(' ') + 1, litUp3);
        System.out.println(s);
    }

    private static void task7() {
        //Задача 7
        String s1 = "135";
        String s2 = "246";
        String sum = s1 + s2;
        char[] arr = sum.toCharArray();
        Arrays.sort(arr);
        String sortedSum = new String(arr);
        System.out.println(sortedSum);
    }

    private static void task8() {
        //Задача 8
        String doubles = "aabccddefgghiijjkk";
        String addition = doubles + "0";
        char[] sb = addition.toCharArray();
        for (int i = 1; i < sb.length - 1; i++) {
            if (sb[i + 1] != sb[i]) {
                sb[i] = '0';
            }
        }
        String zeros = new String(sb);
        String completed = zeros.replace("0", "");
        System.out.println(completed);
    }
}
