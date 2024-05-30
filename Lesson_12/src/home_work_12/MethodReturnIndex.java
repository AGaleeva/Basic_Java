package home_work_12;

import java.util.Random;

public class MethodReturnIndex {

    /*
    Задача 3.
    Написать метод, принимающий массив целых чисел и число, и
    находящий индекс этого числа(элемента) в массиве.
    Если такой элемент есть, возвращается его индекс, если нет,
    метод возвращает -1.
    В методе main() вывести получившийся результат на экран.
    */

    public static int findIndexOfNum(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x) {
                return i;
            }
        return -1;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(-10, 10);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("The index of the given number is " + findIndexOfNum(myArray, 5));
    }
}
