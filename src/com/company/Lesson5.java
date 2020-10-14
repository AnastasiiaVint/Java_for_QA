package com.company;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        /*String[] split = "   100    ml   ".trim().split("\\s+"); // разбор строки , trim убирает лишние пробелы сначала и в конце, \\s+ - означает бесконечное колличество пробелов
        System.out.println(Integer.parseInt(split[0] + 10));
        System.out.println(split[1].equals("ml"));
        System.out.println(Arrays.toString(split));*/

//        newMethod("4687");

        int i[] = {1,2,3,4,5,6,7};
      /*  for ( int i1:i) {
            System.out.println(i1);

        }

        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.println(i1);

        }*/

       /* for (int i1 = i.length ; i1 >= 0; i1--) {
            System.out.println(i1);

        }*/


        Arrays.stream(i).forEach(System.out::println); //?
        System.out.println(Arrays.stream(i).sum()); // min() max() average() distinct()
        Arrays.stream(i).distinct().map(s-> s*2).forEach(System.out::println);


//        int i[] = new int[8]; // обявление пустого массива, размер 8 ячеек памяти



    }

//    private static boolean newMethod(String number) {
//        String[] split = number.split(""); // разбор строки
//        System.out.println(Arrays.toString(split));
//
//        return Integer.parseInt(split[0]) + Integer.parseInt(split[1]) == Integer.parseInt(split[2]) + Integer.parseInt(split[3]);
//    }



}
