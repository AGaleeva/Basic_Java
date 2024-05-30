package home_work_13;

import java.util.Random;

public class ReturnMaxMinNum_T4 {

    /*
    Задача 4 (*).
    Написать метод, возвращающий минимальный и максимальный
    элемент из поданного ему на вход массива целых чисел.
    */

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-100, 100);
            System.out.print(array[i] + " | ");
        }
        System.out.println();
        System.out.println("=====================================================");
        int[] min_max = returnMaxMinNum(array);
        System.out.println("The minimal number of the array is " + min_max[0]);
        System.out.println("The maximal number of the array is " + min_max[1]);

//        можно написать следующим оБразом, но это будет "неэкономный" вариант,
//        поскольку каждый раз будет следовать вызов функции.
        System.out.println("The minimal number of the array is " + returnMaxMinNum(array)[0]);
        System.out.println("The maximal number of the array is " + returnMaxMinNum(array)[1]);

    }

//    ===========================================================

    public static int[] returnMaxMinNum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i] ? max : arr[i]);
            }
//        int[] resArr = {min, max};
//        return resArr;

        return new int[] {min, max};
    }

//    ===========================================================

}
