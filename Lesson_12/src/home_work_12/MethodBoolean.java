package home_work_12;

import java.util.Random;

public class MethodBoolean {

    /*
    Задача 2.
    Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1.
    Если да, метод возвращает true, если нет false.
    static boolean checkOnesAndZeros( int[] ints)
    В методе main() вывести получившийся результат на экран
    */

    public static boolean checkOnesAndZeros(int[] arr, int x) {

        for (int val : arr)
            if (val == x) {
                return true;
            }
        return false;
    }

    public static boolean checkOnesAndZeros(int[] arr, int x, int y) {

        for (int val : arr)
            if (val == x || val == y) {
                return true;
            }
        return false;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(-10, 10);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println(checkOnesAndZeros(myArray, 0));
        System.out.println(checkOnesAndZeros(myArray, 0, -1));
    }
}
