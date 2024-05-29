package practicum_arrays;

public class MinElementAndIndex {
    public static void main(String[] args) {
        /*
        Задача 1.
        Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        Найдите минимальный элемент массива и его индекс.
        */

        int[] arrayNums = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int i = 0;
        int min = arrayNums[0]; // как минимум взят 1-й элемент массива (просто произвольно)
        int pointer = 0; // указатель на элемент (минимальный, который мы ищем), пока он обозначен как "0".

        while (i < arrayNums.length) {
            if (arrayNums[i] < min) { // если текущий эл-т массива меньше указанного min
                min = arrayNums[i];  // схватили элемент
                pointer = i;        // схватили индекс
            }
            i++;
        }
        System.out.println("Min = " + min + ", and its index in the array = " + pointer);


    }
}
