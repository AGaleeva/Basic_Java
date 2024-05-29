package home_work_11;

import java.util.Random;

public class MethodSumOfArray_T2 {
    public static void main(String[] args) {

        /*
        Задача 2.
        Реализуйте метод sumOfArray (сумма элементов массива),
        который получает на вход массив и определяет сумму его элементов.
        */

        Random random = new Random();
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= random.nextInt(-50, 50);
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();

        sumOfArray(myArray);

    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("A sum of all numbers in the array is " + sum);

    }

}
