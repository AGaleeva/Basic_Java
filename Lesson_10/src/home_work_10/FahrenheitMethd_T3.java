package home_work_10;

import java.util.Scanner;

public class FahrenheitMethd_T3 {
    public static void main(String[] args) {
        /*
        Задача 3.
        Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
        Формула для расчета С = 5*(F-32)/9.
        Результат вывести на экран.
        */
        fahrenheit();
    }

    static void fahrenheit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit degrees: ");
        float f = scanner.nextFloat();
        System.out.println();

        float c = 0;

        c = 5 * (f - 32) / 9;
        System.out.printf("The temperature in Celsius degrees: %.2f ", c);
        System.out.println();
    }
}
