package practicum;

public class HW_09_Analysis {
    public static void main(String[] args) {

//        Задача 1. Факториал числа (произведение всех чисел от 1 до числа).

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is " + fact);

//        Задача 2. Количество четных чисел в массиве.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("The amount of even numbers in array is " + counter);

//        Задача 3. Разница между макс и мин числом массива.

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The difference between max and min elements of the array is " + (max - min));

        /*
        Задача 4(*).
        Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        1
        12
        123
        1234
        12345
        123456
        */

        int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
