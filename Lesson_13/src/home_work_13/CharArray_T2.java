package home_work_13;

import java.util.Arrays;

public class CharArray_T2 {

    /*
    Задача 2
    Реализуйте метод, который заполняет массив случайными буквами.
    Размер массива подается на вход методу.
    */

    public static void main(String[] args) {
        int i = (int) (Math.random() * 25 + 1);
        System.out.println("The array length is " + i);
        char[] charArrRes = randCharArray(i);
        for (char ch : charArrRes) {
            System.out.print(ch + " | ");
        }

        System.out.println();
        System.out.println(Arrays.toString(charArrRes));
    }

//    =========================================================
    public static char[] randCharArray(int i) {
        char[] arr = new char[i];
        for (int j = 0; j < i; j++) {
            arr[j] = (char) (Math.random() * (122 - 97 + 1) + 97);
        }
        return arr;
    }

//    =========================================================

}
