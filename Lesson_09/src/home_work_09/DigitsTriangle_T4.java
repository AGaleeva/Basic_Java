package home_work_09;

public class DigitsTriangle_T4 {
    public static void main(String[] args) {

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


        for (int i = 0; i < 6; i++) {
            int n = 1;
            while (n <= i) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }


//        String printNums = "";
//
//        for (int i = 1; i <= 6; i++) {
//            System.out.println(printNums += i);
//        }

    }
}