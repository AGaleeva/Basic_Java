package lesson;

public class HW_06_Analysis {
    public static void main(String[] args) {
        /*
        Задача 1. Максимальное из 3-х чисел (полностью, см. в L6_ HomeWork_06)
        */

        int n1 = 78;
        int n2 = 4;
        int n3 = 5;

        System.out.println("solution with \"else if\"");

        if (n1 > n2 && n1 > n3) {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n2);
        } else {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n3);
        }

        System.out.println();

        System.out.println("solution without \"else if\"");

        if (n1 > n2 && n1 > n3) {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n1);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n2);
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("The maximal number of numbers " + n1 + ", " + n2 + " and " + n3 + " is: " + n3);
        }

        System.out.println();

        System.out.println("solution with \"ternary operator\"");

        int a = 1;
        int b = 2;
        int c = 3;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("max of " + a + ", " + b + " and " + c + " is: " + max);

        /*
        Задача 3. Коровы
        */

        int n = 2;

        if (n >= 2 && n <= 4) {
            System.out.println("На лугу пасется " + n + " коровы");
        } else if (n >= 5 && n <= 10 || n == 0) {
            System.out.println("На лугу пасется " + n + " коров");
        } else {
            System.out.println("На лугу пасется " + n + " корова");
        }

        /*
        Задача 4. Високосный год
        */

        int year = 2023;

        boolean a1 = (year % 4) == 0;
        boolean b1 = (year % 100) !=0;
        boolean c1 = ((year % 100 == 0) && (year % 400 == 0));
        boolean result = a1 && (b1 || c1);
        System.out.println("Is " + year + " a leap year? " + result);

    }
}
