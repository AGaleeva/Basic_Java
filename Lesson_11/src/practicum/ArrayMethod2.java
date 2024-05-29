package practicum;

public class ArrayMethod2 {
    public static void main(String[] args) {

        /*
        Задача 5. реализуйте метод, который получает на вход массив,
        искомое число и отвечает на вопрос, нашлось ли это число в массиве.
        */

        int[] array = {14, 73, 20, -2001, 8, -15, -45, 212, -999};

        findNumInArray(array, 0);

    }
    //-------------- Methods ----------------

    public static void findNumInArray(int[] arr, int x) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("The number " + x + " presents in the array.");
        } else {
            System.out.println("The number " + x + " isn't present in the array.");}
    }


    //-------------- End of methods ----------------

}
