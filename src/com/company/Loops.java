package com.company;

public class Loops {
    public static void main(String[] args) {
//        int i = 0;

//        while (i <= 10) {
//
//            System.out.println(i);
//            i++;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);)

//        while (i <= 10) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++, System.out.println(i));


        int j = 0;
        for (; ; ) {
            if (j >100) break;
            j++;
            if (j%2==0) continue;

            System.out.println(j);


        }


    }
}

