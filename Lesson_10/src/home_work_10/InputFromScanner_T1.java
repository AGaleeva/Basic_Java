package home_work_10;

import java.util.Scanner;

public class InputFromScanner_T1 {
    public static void main(String[] args) {

        /*
        Задача 1.
        Написать программу, которая принимает с клавиатуры имя,
        фамилию и возраст (Ваши или воображаемого персонажа) и
        выводит в консоль эту информацию в следующем виде:

        First name: John

        Last name: Smith

        Age: 25
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println();

        System.out.println("First name: " + firstName);
        System.out.println();
        System.out.println("Last name: " + lastName);
        System.out.println();
        System.out.println("Age: " + age);

    }
}
