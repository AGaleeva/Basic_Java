package consultation;

import java.util.Random;

public class ForEach {
    /*
    написать метод, определяющий есть ли в массиве число х
    */

    public static boolean incNumInArr(int[] arr, int x) {
        if (arr == null) {
            return false;
        } // проверка на null

        for (int value : arr) {
            if (value == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(-10, 10);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println(incNumInArr(myArray, 20));
    }

}
