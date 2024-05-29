package consultation;

import java.util.Random;

public class OptionalTask_RandArr_SumEvenNum {
    public static void main(String[] args) {

        /*
        Задача. Создать массив случайных чисел из 20 элементов. Вывести на экран сам массив,
        количество четных чисел и их сумму.
        */

        Random random = new Random();

        int[] randArr = new int[20];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = random.nextInt(100);
            System.out.print(randArr[i] + " ");
            if (randArr[i] % 2 == 0) {
                count++;
                sum = sum + randArr[i];
            }
        }
        System.out.println();
        System.out.println("Amount of the even numbers is " + count);
        System.out.println("The summa of the even numbers in the array is " + sum);
    }
}
