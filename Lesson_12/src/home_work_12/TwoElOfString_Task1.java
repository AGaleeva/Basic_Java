package home_work_12;

import java.util.Scanner;

public class TwoElOfString_Task1 {

        public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и печатающий ее второй и третий символы заглавными буквами.
        Hello -> EL
        */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a word: ");
            String word = scanner.next();

            String[] lett = firstSecElToUppCase(word).split("~");

            for (String s: lett) {
            System.out.print(s);
        }

        }

        public static String firstSecElToUppCase(String str) {
            return str.toUpperCase().charAt(1) + "~" + str.toUpperCase().charAt(2);
//            return String.valueOf(str.toUpperCase().charAt(1)) + String.valueOf(str.toUpperCase().charAt(2));
        }

}
