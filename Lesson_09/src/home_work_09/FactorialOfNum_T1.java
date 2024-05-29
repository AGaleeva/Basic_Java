package home_work_09;

public class FactorialOfNum_T1 {
    public static void main(String[] args) {

        /*
        Задача 1.
        Написать программу, вычисляющую факториал числа 5.
        Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
        ! -обозначение факториала.
        */

        int fact = 1;
        for (int i = 5; i > 0; fact *= i--);
        System.out.println("Factorial of the number 5 is " + fact);

    }
}
