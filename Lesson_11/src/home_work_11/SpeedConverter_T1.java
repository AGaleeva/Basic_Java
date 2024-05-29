package home_work_11;

import java.util.Scanner;

public class SpeedConverter_T1 {
    public static void main(String[] args) {

        /*
        Задача 1.
        Реализуйте с помощью метода конвертор, который переводит
        скорость в милях в час в скорость в км/час.
        1 миля равна 1609 метров.
        Метод получает на вход данные от пользователя с клавиатуры.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a speed in miles per hour, number: ");
        double speed = scanner.nextDouble();

        speedConv(speed);

    }

    public static void speedConv(double s) {
        double ms = 1.609 * s;
        System.out.println("The speed is " + ms + " km/h.");
    }

}
