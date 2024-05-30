package home_work_12_analysis;

public class FindIndxInArr_Task3 {

    /*
    Задача 3.
    Написать метод, принимающий массив целых чисел и число
    и находящий индекс этого числа(элемента) в массиве.
    Если такой элемент есть, возвращается его индекс, если нет,
    метод возвращает -1.
    В методе main() вывести получившийся результат на экран
    */

    public static void main(String[] args) {

        int[] array = {999, 23, 28, 0, -38, 8, -1, 1001, 56};

        System.out.println(findIndexOfNum(array, 0, 2));
    }

    public static int findIndexOfNum(int[] arr, int x, int index) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x && index == i) {
                return i;
            }
        }
        return -1;
    }

}
