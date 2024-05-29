public class Consultation_06 {
    public static void main(String[] args) {
        /*
        Написать программу, определяющую является ли целое число положительным,
        отрицательным или нулем и выводит результат на экран.
        */

        // 1 решение с "else"

        int x = 10;
        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        System.out.println();

        // 2 решение без "else"

        x = -3;
        if (x > 0) {
            System.out.println("The number is positive.");
        }

        if (x < 0) {
            System.out.println("The number is negative.");
        }

        if (x == 0) {
            System.out.println("The number is Zero.");
        }

        System.out.println();


        /*
        Задача 2.
        Есть три переменные целого типа. Написать программу, определяющую равны ли
        эти числа или нет. Программа должна выводить на экран следующие сообщения:
        "Все числа равны" - если они равны, "Все числа разные" - если разные или
        "Некоторые из чисел равны" - если какие-то равны.
        */

        int a, b, c;
        a = 3;
        b = 6;
        c = 8;

        if (a == b & b == c) {
            System.out.println("All numbers are equal.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Some numbers are equal.");
        } else {
            System.out.println("All numbers are different");
        }

        System.out.println();

        /*
        Задача 3.
        Есть три переменных целого типа: x, y, z. Написать программу, определяющую их
        последовательность - если значения возрастают (1, 2, 3), то программа печатает
        increasing, если убывают (3, 2, 1) - decreasing, и "не убывают и не возрастают"
        во всех остальных случаях
        */

        int x1 = 1;
        int y1 = 2;
        int z1 = 3;

        if (x1 < y1 && y1 < z1) {
            System.out.println("increasing");
        } else if (x1 > y1 && y1 > z1) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither increasing nor decreasing");
        }

    }
}
