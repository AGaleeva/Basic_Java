package consultation;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

    /*
    Написать метод, который принимает имя (строку) и печатает
    Hello, name ,  заменяя переменную name на принятое значение:
    John -> Hello, John
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        nameGreet(name);
    }

    static public void nameGreet(String name) {
        System.out.println("Hello, " + name);
    }

}
