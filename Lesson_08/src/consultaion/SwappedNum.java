package consultaion;

public class SwappedNum {
    public static void main(String[] args) {

        /*
         Есть трехзначное число. Написать программу:
         1. выводящую на экран все цифры этого числа.
         2. получить новое число, полученное перестановкой
         единиц и сотен заданного числа и вывести его на экран.
         3. Вывести на экран сумму цифр этого числа.
        */

        int num = 365;
        int i = 0;
        int digits = 0;
        int digitRev = 0;
        int sumDigits = 0;
        while (num > 0) {
            digits = num % 100;
            System.out.println(digits);
            digitRev = num % 10;
            num = num / 10;
            sumDigits = digitRev + sumDigits;
            System.out.print(digitRev);
            i++;
        }

        System.out.println();
        System.out.println("The summa of all digits is " + sumDigits);
        System.out.println("Number of the digits in the given number is " + i);

    }
}
