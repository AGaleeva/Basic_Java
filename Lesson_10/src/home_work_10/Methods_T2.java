package home_work_10;

public class Methods_T2 {
    public static void main(String[] args) {

        /*
        Задача 2.
        Оформить решение задачи 1 про факториал и задачи 4 про треугольник
        из предыдущего домашнего задания в виде методов.
        */

        factorial();
        triangle();

    }
    static void factorial() {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
        fact *= i;
    }
        System.out.println("Factorial of " + n + " is " + fact);
        System.out.println();
    }

    static void triangle() {
    int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(j);
            }
        System.out.println();
        }

    }
}
