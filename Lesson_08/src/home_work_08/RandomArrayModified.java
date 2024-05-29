package home_work_08;

public class RandomArrayModified {
    public static void main(String[] args) {

        /*
        Задача 3.
        Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        Выведите массив на печать. Поменяйте местами первый и последний элементы
        массива и снова выведите массив на печать.
        */

        int a = 10;
        int b = 20;
        int i = 0;

        int[] randArr = new int[10];

        while (i < randArr.length) {
            randArr[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print(randArr[i] + " | " );
            i++;
        }

        System.out.println();

        int lastEl = randArr[0];
        randArr[0] = randArr[randArr.length - 1];
        randArr[randArr.length - 1] = lastEl;

//        randArr[randArr.length - 1];
//        randArr[0];

        i = 0;
        while (i < randArr.length) {
            System.out.print(randArr[i] + " | " );
            i++;
        }


    }
}
