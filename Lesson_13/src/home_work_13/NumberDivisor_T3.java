package home_work_13;

import java.util.Scanner;

public class NumberDivisor_T3 {

    /*
    Задание 3.
    Реализовать метод, выводящий на экран все делители введенного
    пользователем целого числа. Вернуть массив со всеми делителями числа.
    */

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please give me an integer:");
        int m = scann.nextInt();

        int[] resArr = findNumDivisors(m);
        for (int val : resArr) {
            System.out.print(val + " | ");
        }

    }

//    ==============================================================
    public static int[] findNumDivisors(int m) {
        int[] arr = new int[m/2];
        int index = 0;
        for (int d = 1; d <= m; d++) {
            if (m % d == 0) {
                arr[index++] = d;
            }
        }

        int[] resultArray = new int[index];
        for (int i = 0; i < index; i++) {
            resultArray[i] = arr[i];
        }
        return resultArray;
    }

//    ==============================================================

}
