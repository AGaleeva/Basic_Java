package consultation;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий две строки и печатающий эти строки, соединенные вместе,
        но без первых букв и большими буквами.
        Пример: "Hello", "There" -> ELLOHERE
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String firstStr = scanner.next();
        System.out.println("Please enter the second string: ");
        String secondStr = scanner.next();
        System.out.println();

        twoStringsToUppC(firstStr, secondStr);

    }

    public static void twoStringsToUppC(String str1, String str2) {
        System.out.println(str1.substring(1).toUpperCase() + str2.substring(1).toUpperCase());
    }

}
