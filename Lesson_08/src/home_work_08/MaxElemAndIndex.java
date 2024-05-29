package home_work_08;

public class MaxElemAndIndex {
    public static void main(String[] args) {

        /*
        Задача 2.
        Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        Найдите максимальный элемент массива и его индекс.
        */


        int[] numArr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int i = 0;
        int maxEl = numArr[0];
        int pointer = 0;

        while (i < numArr.length) {
            if (maxEl < numArr[i]) {
                maxEl = numArr[i];
                pointer = i;
            }
            i++;
        }
        System.out.println("Maximal element of the array is " + maxEl + " and its index is " + pointer + ".");

    }
}
