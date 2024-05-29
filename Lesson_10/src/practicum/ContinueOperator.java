package practicum;

public class ContinueOperator {
    public static void main(String[] args) {

        //        key word "continue;"
//        Оно используется в цикле. Если программа встречает слово continue,
//        то идущая за ним часть цикла пропускается и
//        происходит переход к выполнению следующей итерации цикла.

        int arr[] = {2, 67, 34, 8};

        for (int i = 0; i < arr.length; i++) {

            if (i > 2) { // в этом случае массив после индекса "2" не печатается, т.е "8" не будет выведена на экран
                continue;
            }
            System.out.println(arr[i]);
        }

        System.out.println("==============================");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 60) {  // в этом случае распечатаются все элементы, кроме 67
                continue;
            }
            System.out.println(arr[i]);
        }

        System.out.println("==============================");

        for (int i = 0; i <= 5; i++) {
            if (i == 3) { // распечатаются все элементы от 0 до 5, кроме "3"
                continue;
            }
            System.out.println(i);
        }
    }
}
