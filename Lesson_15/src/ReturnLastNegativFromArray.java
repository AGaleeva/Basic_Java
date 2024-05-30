import java.util.Random;

public class ReturnLastNegativFromArray {

    /*
    Написать метод, который получает массив целых чисел, и возвращает последнее число в массиве,
    которое меньше 0. Если такого нет, - возвращает 0.
    */

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[20];
        int[] array1 = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-20, 20);
//            array1[i] = rand.nextInt(10, 50);
            System.out.print(array[i] + " | ");
        }

        System.out.println();

        System.out.println(returnLastNegativeNumberFromArray(array));
//        System.out.println(returnLastNegativeNumberFromArray(array1));
    }


    public static int returnLastNegativeNumberFromArray(int[] arr) {

        int lastNeg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                lastNeg = arr[i];
            }
        }

       return lastNeg;
    }
}
