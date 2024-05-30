public class RetLastNegFromArray {

    /*
    Написать метод, который получает массив целых чисел, и возвращает последнее число в массиве,
    которое меньше 0. Если такого нет, - возвращает 0.
    */

    public static int getnLastNumberLessThenZero(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 5, 2, -7, 4, -2, 3}; // result will be -2
        int[] array1 = {6, 3, 5, 2, 7, 4, 2, 3}; // result will be 0
        System.out.println(getnLastNumberLessThenZero(array));
        System.out.println(getnLastNumberLessThenZero(array1));

        System.out.println(getnLastNumberLessThenZero1(array));
        System.out.println(getnLastNumberLessThenZero1(array1));
    }

    public static int getnLastNumberLessThenZero1(int[] arr) {

        int res = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                return arr[i];
            }
        }
        return res;
    }
}
