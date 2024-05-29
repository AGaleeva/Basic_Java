package consultation;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и печатающий ее второй и третий символы заглавными буквами.
        Hello -> EL
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();

        firstSecElToUppCase(word);

    }

    public static void firstSecElToUppCase(String str) {
        System.out.println(str.toUpperCase().charAt(1) + "" + str.toUpperCase().charAt(2));
        // System.out.println(String.valueOf(str.toUpperCase().charAt(1)) + String.valueOf(str.toUpperCase().charAt(2)));
    }

}
