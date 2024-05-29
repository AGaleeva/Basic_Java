package home_work_09;

import java.util.Random;

public class MaxMinDiffer_T3 {
    public static void main(String[] args) {

        /*
        Задача 3
        Есть массив целых чисел. Написать программу, находящую разницу между
        значением максимального и минимального элементов. (max - min).
        */

        Random random = new Random();

        int[] randArr = new int[10];


        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = random.nextInt(11, 101);
            System.out.print(randArr[i] + " | ");
        }
        System.out.println();

        int arrMax = randArr[0], arrMin = randArr[0];
        for (int i = 0; i < randArr.length; i++) {
            arrMax = (arrMax < randArr[i]) ? randArr[i] : arrMax;
            arrMin = (arrMin > randArr[i]) ? randArr[i] : arrMin;
            }
        System.out.println("The difference between max and min values of the array is " + (arrMax - arrMin));



    }
}
