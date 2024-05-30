package home_work_13;

import java.util.Scanner;

public class ShoottingTask {

    /*
    Задание 1a. Написать метод, реализующие имитацию:

    стрельбу по мишени (вар 1 - попал/не попал, вар 2 - результат от 0 до 10)
    На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
    n = (int)(Math.random() * (1 - 0 + 1) + 0)
    */

    public static void main(String[] args) {

        // Вариант 1: "попал/не попал"

        Scanner scann = new Scanner(System.in);
        System.out.println("How many shots would you like to do?\nGive me an integer from 2 bis 20:");
        int n = scann.nextInt();

        System.out.println("Your result is: ");
        System.out.println(hitOrNot(n));
        System.out.println();
        System.out.println();
        System.out.println("***********************************");
        System.out.println();

        // Вариант 2: результат от 0 до 10.

        System.out.println("How many shots would you like to do?\nGive me an integer from 2 bis 20:");
        int m = scann.nextInt();
        System.out.println("Your result is: ");
        int[] shots = shootAttemptQuality(m);
        for (int var : shots) {
            System.out.print(var + " | ");
        }

    }

    public static String hitOrNot(int n) {
        String shRes = "";
        for (int i = 0; i < n; i++) {
            switch ((int) (Math.random() * 2 + 0)){
                case 1:
                    shRes += " hit |";
                    break;
                default:
                    shRes += " lose |";
                    break;
            }
        }
        return shRes;
    }

    public static int[] shootAttemptQuality(int m) {
        int[] attmp = new int[m];
        for (int i = 0; i < m; i++) {
            attmp[i] = (int) (Math.random() * 11 + 0);
        }
        return attmp;
    }


}
