package lesson;

public class HW_07 {
    public static void main(String[] args) {

        System.out.println("======= TASK 1 =======");
        /*
        Задача 1.
        С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
        Пример:для числа n=3
        1 в кубе 1
        2 в кубе 8
        3 в кубе 27
        */

        int i = 1;
        int a = 1;
        int b = 15;
        int n = (int) (Math.random() * (b + a));
        System.out.println("The number \"n\" is " + n);

        while (i <= n) {
            System.out.println("Cube of number " + i + " is " + (int) Math.pow(i, 3));
            i++;
        }
        System.out.println();

        System.out.println("======= TASK 2 =======");
        /*
        Задача 2.
        С помощью цикла while написать программу, выводящую на экран результат умножения
        данного цисла n на все целые числа от 0 до n.
        Пример: для числа 3 результат будет 0, 3, 6, 9
        */

        i = 0;
        b = 10;
        int m = (int) (Math.random() * (b + a));

        System.out.println("The number \"m\" is " + m);

        while (i <= m) {
            System.out.println("The result is " + (m * i));
            i++;
        }

    }
}
