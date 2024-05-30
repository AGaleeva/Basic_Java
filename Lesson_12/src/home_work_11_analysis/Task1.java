package home_work_11_analysis;

import java.util.Scanner;

public class Task1 {

    /*
    Задача 1.
    Реализуйте с помощью метода конвертор, который переводит
    скорость в милях в час в скорость в км/час. 1 миля равна 1609 метров.
    Метод получает на вход данные от пользователя с клавиатуры.
    */

    public static void main(String[] args) {
//        convertSpeed(75.7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed in miles/h");
        double speedMiles = scanner.nextDouble();

        convertSpeed(speedMiles);

    }

    public static void convertSpeed(double sM) {
        double sK = 1.609 * sM;
        System.out.printf("Speed in %.2f miles/h is %.2f in km/h.", sM, sK);
        // printf: первый флажок отвечает за первую переменную, а второй флажок - за вторую переменную

        System.out.println();
    }
}
