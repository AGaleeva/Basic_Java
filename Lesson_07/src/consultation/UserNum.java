package consultation;

import java.util.Scanner;

public class UserNum {
    public static void main(String[] args) {

        /*
        Task 1.
        Перепишите решение задачи с использованием switch вместо if-else:

        Необходимо написать программу, где бы пользователю предлагалось
        ввести число на выбор: 1, 2 или 3, а программа должна сказать,
        какое число ввёл пользователь: 1, 2, или 3
        */

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Give me one of the numbers 1, 2 or 3: ");
        int num = userScanner.nextInt();

            switch (num) {
                case 1, 2, 3://
                    System.out.println("The user gave the number " + num + ".");
                    break;
                default:
                    System.out.println("The user gave a wrong number.");
            }
        }
    }

