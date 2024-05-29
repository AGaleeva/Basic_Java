package consultation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и печатающий ее два первых символа.
        Hello -> He
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();

        str2BegSymb(word);

    }

    public static void str2BegSymb(String str) {
        System.out.print("First 2 symbols of the word are " + "\"" + str.charAt(0) + str.charAt(1) + "\"");
    }

}
