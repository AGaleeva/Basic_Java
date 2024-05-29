package home_work_09;

import java.util.Random;

public class EvenNum_T2 {
    public static void main(String[] args) {
        /*
        Задача 2.
        Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.
        */

        Random random = new Random();
        int[] randArr = new int[10];
        int amount = 0;

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = random.nextInt(11, 31);
            System.out.print(randArr[i] + " | ");
        }
        System.out.println();

        for (int i = 0; i < randArr.length; i++) {
            if (randArr[i] % 2 == 0) {
                amount = amount + 1;
            }
        }
        System.out.println("The amount of the even numbers in the current array is " + amount);

    }
}
