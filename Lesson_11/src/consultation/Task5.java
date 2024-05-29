package consultation;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        Написать метод, принимающий строку и печатающий  целое число, равное двойной длине строки.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();

        strDoubleLength(string);

    }

    public static void strDoubleLength(String str) {
        System.out.println("The double length of the string is " + (str.length() * 2));
    }

}
