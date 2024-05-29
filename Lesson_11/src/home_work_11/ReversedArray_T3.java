package home_work_11;

import java.util.Random;

public class ReversedArray_T3 {
    public static void main(String[] args) {

        /*
        Задача 3.
        Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
        Сначала последний элемент, потом предпоследний, и т. д.
        */

        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
            System.out.print(array[i] + " | ");
        }
        System.out.println();

        revArr(array);

    }

    public static void revArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }

}
