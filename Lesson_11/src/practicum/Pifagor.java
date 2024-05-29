package practicum;

import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {

        /*
        Задача 1. Реализуйте метод, который вычисляет длину гипотенузы прямоугольного
        треугольника по двум заданным пользователем катетам (теорема Пифагора).
        */

       // Шаг 1. Создать и включить сканер.
       // Шаг 2. Получить от пользователя данные про катеты.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of catet a: ");
        double a = scanner.nextDouble();

        System.out.println("Please enter the length of catet b: ");
        double b = scanner.nextDouble();

        // Шаг 4. вызов метода

        pifagorMethod(a , b);

    }
    // Шаг 3. создание метода

    // ---------------- Methods ----------------
    // объявляем метод с параметрами на входе
    public static void pifagorMethod(double x, double y) {
        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // или по-простому (x * x + y * y)
        System.out.printf("Hypotenuse = %.2f", c);
    }


    // ---------------- End of methods ----------------

}
