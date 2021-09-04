package pro.sky.java.course1.homework5;

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
        int i1 = 0;
        int i2 = fullNameLower.indexOf(' ') + 1;
        int i3 = fullNameLower.lastIndexOf(' ') + 1;
        char lit1 = fullNameLower.charAt(i1);
        char litUp1 = Character.toUpperCase(lit1);
        char lit2 = fullNameLower.charAt(i2);
        char litUp2 = Character.toUpperCase(lit2);
        char lit3 = fullNameLower.charAt(i3);
        char litUp3 = Character.toUpperCase(lit3);
        StringBuilder s = new StringBuilder(fullNameLower);
        s.setCharAt(i1, litUp1);
        s.setCharAt(i2, litUp2);
        s.setCharAt(i3, litUp3);
        System.out.println(s);
    }

    private static void task7() {
        //Задача 7
        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        System.out.println(sb);
    }

    private static void task8() {
        //Задача 8
        String doubles = "aabccddefgghiijjkk";
        char[] arr = doubles.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
