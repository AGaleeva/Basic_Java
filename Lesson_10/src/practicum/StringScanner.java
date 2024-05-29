package practicum;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        метод для чтения строк: nextLine() считывает пользовательский ввод в виде строки.
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + " " + surname + "! " + "You are " + age + " ears old.");

//       иногда в буфере остается "ввод", поэтому чтобы его сбросить может понадобиться ввести
//        "мусорную" переменную, котора переводт сканер на другую строку:
//        String bin = scanner.nextLine();

        System.out.println("==================================");
//        метод для чтения строк: next() считывает пользовательский ввод в виде строки до пробела.

        System.out.println("Enter your name and surname");
        String nameSecondName = scanner.next(); // John Smyth
        System.out.println(nameSecondName); // выведет только John

        scanner.close(); // потоки в java надо закрывать


    }
}
