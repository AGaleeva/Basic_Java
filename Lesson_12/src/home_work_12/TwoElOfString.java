package home_work_12;

import java.util.Scanner;

public class TwoElOfString {

    public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и печатающий ее второй и третий символы заглавными буквами.
        Hello -> EL
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();

        System.out.println(firstSecElToUppCase(word));

    }

    public static String firstSecElToUppCase(String str) {
        return str.toUpperCase().substring(1, 3);
    }

}