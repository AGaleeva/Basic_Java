package practicum;

import java.util.Scanner;

public class HomeWorkPrev_10 {
    public static void main(String[] args) {

        /*
        Задача 1.
        Чтение с клавиатуры данных и вывод их на экран (имя, фамилия, возраст).
        */

        Scanner scanner = new Scanner(System.in); // включаем прием ввода данных с клавиатуры

        System.out.println("Enter your name: "); // приглашение пользователя
        String name = scanner.nextLine(); // получение данных с клавиатуры от пользователя

        System.out.println("Enter your surname: "); // приглашение пользователя
        String surname = scanner.nextLine();

        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.println("Your name: " + name);
        System.out.println("Your surname " + surname);
        System.out.println("Your age " + age);
    }
}
