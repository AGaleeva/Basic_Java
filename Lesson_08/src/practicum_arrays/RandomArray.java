package practicum_arrays;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        /*
        Задача 3. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        Запросите у пользователя какое-то натуральное число. Определите, есть ли это число
        в массиве.
        */

        int[] randomArr = new int[10]; // просто объявили новый массив
                                      // надо заполнить массив случайными числами

        int a = 1;
        int b = 100;
        int i = 0; // индекс элементов массива
        while (i < randomArr.length) {
            randomArr[i] = (int) (Math.random() * (b - a + 1) + a); // заполнение случайными числами
            System.out.print(randomArr[i] + " | " );
            i++;
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in); // подключаем сканер для чтения с клавиатуры
        System.out.println("Give me a number: ");
        int n = scanner.nextInt(); // это число с клавиатуры от пользователя

        // ищем, полученное с клавиатуры число в массиве

        boolean flag = false;
        i = 0;
        while (i < randomArr.length) {
            if (randomArr[i] == n) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Sorry...");
        }

    }
}
