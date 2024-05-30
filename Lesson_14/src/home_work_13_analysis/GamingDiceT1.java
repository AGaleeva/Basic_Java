package home_work_13_analysis;

import java.util.Arrays;
import java.util.Random;

public class GamingDiceT1 {

    /*
    Задача 1
    Напишите метод, который имитирует бросание игрового кубика.
    На вход методу подается число бросков, на выходе метод
    возвращает результаты всех бросков.
    */

    public static void main(String[] args) {

        int[] game = throwDice(10);
        for (int el : game) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Print array with Arrays.toString");
        System.out.println(Arrays.toString(game));
    }

//    ======================================================
    public static int[] throwDice(int numberOfTosses) {
        int[] result = new int[numberOfTosses];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1, 7);
        }
        return result;
    }


//    ======================================================
}
