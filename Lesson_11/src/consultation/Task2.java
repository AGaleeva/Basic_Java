package consultation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий две строки и печатающий их таким образом, что
        если принятые строки Hi и Bye, то напечатано будет HiByeByeHi.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first string: ");
        String firstStr = scanner.next();
        System.out.println("Please enter second string: ");
        String secondStr = scanner.next();

        System.out.println();

        stickyStrigsRev(firstStr, secondStr);

    }

    public static void stickyStrigsRev(String str1, String str2) {
        System.out.print(str1 + str2 + str2 + str1);
    }

}
