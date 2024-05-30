package home_work_12_analysis;

public class CheckZeroOrOne_Task2 {

    public static void main(String[] args) {

        /*
        Задача 2.
        Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1.
        Если да, метод возвращает true, если нет false.
        static boolean checkOnesAndZeros( int[] ints)
        В методе main() вывести получившийся результат на экран.
        */

        int[] array = {999, 23, 28, 0, -38, 8, -1, 1001, 56};

        System.out.println(checkOnesAndZeros(array));

        System.out.println(checkMinOnesAndZeros(array));

    }

    public static boolean checkOnesAndZeros(int[] arr) {
        for (int val : arr)
            if(val == 0 || val == -1) {
                return true;
            }
        return false;
    }

    // Метод с циклом for(i) и "флагом"
    public static boolean checkMinOnesAndZeros(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == 0 || arr[i] == -1) {
                flag = true;
            }
        return flag;
    }
}
