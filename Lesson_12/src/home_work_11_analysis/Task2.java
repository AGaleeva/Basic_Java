package home_work_11_analysis;

public class Task2 {
    /*
    Задача 2.
    Реализуйте метод sumOfArray (сумма элементов массива), который получает
    на вход массив и определяет сумму его элементов.
    */

     static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += sum;
        }
        System.out.println("The sum of all munbers in the array = " + sum);
    }

    public static void main(String[] args) { // метод main можно писать в любом месте кода

        int[] myArray = {4, 9, 54, 63, 75, 1, 0, 7};

        sumOfArray(myArray);
    }

}
