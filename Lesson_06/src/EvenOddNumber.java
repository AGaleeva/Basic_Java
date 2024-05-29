public class EvenOddNumber {
    public static void main(String[] args) {
        /*
        Задание 1. Имеется целое число n, задайте его самостоятельно в программе.
        Выясните, является ли это число четным? Является ли это число кратным 3?
        Кратным 5? Кратным 10?
        */

        int n = 3;
        // четное - это то число, которое делится на 2 без остатка (остаток = 0).
        // % - это деление с остатком

        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // кратное 3 - это то число, которое делится на 3 без остатка (остаток = 0).

        int k = 11;

        if (k % 3 == 0) {
            System.out.println("The number " + k + " is multiple of 3");
        } else {
            System.out.println("The number " + k + " is not multiple of 3");
        }

        // кратное 5 - это то число, которое делится на 5 без остатка (остаток = 0).

        int l = 25;

        if (l % 5 == 0) {
            System.out.println("The number " + l + " is multiple of 5");
        } else {
            System.out.println("The number " + l + " is not multiple of 5");
        }
    }
}
