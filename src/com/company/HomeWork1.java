package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        // ex1 - Приветствовать любого пользователя при вводе его имени через командную строку.
        /*System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);*/

        // ex2 - Отобразить в окне консоли аргументы командной строки в обратном порядке.
        /*System.out.println(Arrays.toString(args));
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }*/

        // ex3 - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

        // ex4 - Ввести пароль из командной строки и сравнить его со строкой образцом.
        /*String password = "as1as2";
        System.out.println("Please enter your password");
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.nextLine();

        if (newPassword.equals(password)) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Wrong password!");
        }*/

        // ex5 - Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и
        // вывести результат на консоль.

        /*int sum = 0;
        int multiple = 1;
        for (int i=0; i<args.length; i++) {

            int currentArg = Integer.parseInt(args[i]);
            sum += currentArg;
            multiple *= currentArg;

        }
        System.out.println("sum = " + sum);
        System.out.println("multiple = " + multiple);*/

        // ex6 - Ввести с консоли Целых чисел. На консоль вывести:

        int i = 0;
        int a[] = new int[6];

        while (i < a.length) {
            Scanner scanner = new Scanner(System.in);
            a[i] = Integer.parseInt(scanner.next());
            i++;
        }
//        System.out.println("a = " + Arrays.toString(a));
        // ex6.1 - Четные числа.
        /*for (int j = 0; j< a.length; j++) {
            if (a[j] % 2 == 0) {
                System.out.println(a[j]);
            }
        }*/
        // ex6.1 - Нечетные числа.
        /*for (int j = 0; j< a.length; j++) {
            if (a[j] % 2 != 0) {
                System.out.println(a[j]);
            }
        }*/

        // EX6.2. Наибольшее число.
        /*int max = 0;
        for (int x = 0; x < a.length; x++) {
            if (max < a[x]) {
                max = a[x];
            }
        }
        System.out.println("max = " + max);*/

        // EX6.2. Наименьшее число.
        /*int min = a[0];
        for (int x = 0; x < a.length; x++) {
            if (min > a[x]) {
                min = a[x];
            }
        }
        System.out.println("min = " + min);*/

        // EX.6.3 Числа, которые делятся на 3 или на 9.
        /*for (int k = 0; k< a.length; k++) {
            if ((a[k] % 3 == 0) || (a[k] % 9 == 0)) {
                System.out.println(a[k]);
            }
        }*/

        // EX.6.4. Числа, которые делятся на 5 и на 7.

        /*for (int l = 0; l< a.length; l++) {
            if ((a[l] % 5 == 0) && (a[l] % 7 == 0)) {
                System.out.println(a[l]);
            }
        }*/




    }
}
