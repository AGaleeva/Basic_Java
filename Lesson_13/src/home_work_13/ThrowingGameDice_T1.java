package home_work_13;

public class ThrowingGameDice_T1 {

    /*
    Задача 1
    Напишите метод, который имитирует бросание игрового кубика.
    На вход методу подается число бросков, на выходе метод
    возвращает результаты всех бросков.
    */

    public static void main(String[] args) {
        int n = (int) (Math.random() * 20 + 1);
        System.out.println("The amount of throwing dice is " + n);
        System.out.println("The result is: ");
        int[] thrDice = throwGameDice(n);
        for (int val : thrDice) {
            System.out.print(val + " | ");
        }
    }

//    ==========================================================

    public static int[] throwGameDice(int n) {
        int[] allThr = new int[n];
        for (int i = 0; i < n; i++) {
            allThr[i] = (int) (Math.random() * 6 + 1);
        }
        return allThr;
    }


//    ==========================================================
}
