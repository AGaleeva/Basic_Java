package practicum;

public class ArrayMethod {
    public static void main(String[] args) {

        /*
        Задача 4. реализуйте метод, который получает на вход массив и находит его минимальный элемент.
        */
        // Шаг 1. Создать массивю
        // Шаг 2. Создать метод.

        int[] array = {14, 73, 20, -2001, 8, -15, -45, 212, -999};

        minElOfArray(array); // вызов метода

    }
    //-------------- Methods --------------

    public static void minElOfArray(int[] arr) {
        // ищем минимальный элемент массива
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element of the array is: " + min);

    }

    //-------------- End of methods --------------

}
