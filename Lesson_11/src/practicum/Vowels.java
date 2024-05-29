package practicum;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        /*
        Задача 2. Реализуйте метод, который получает на вход строку
        на английском языке и сообщает количество гласных букв в ней.
        */
        // a, e, i, o, u, y - это гласные буквы

        // Шаг 1. Подключаем сканер.
        // Шаг 2. Получить от пользователя строку.
        // Шаг 3. Пишем метод, принимающий эту строку на вход.
        // Шаг 4. Пройти циклом по строке charAt(index) и посчитать кол-во гласных.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = scanner.nextLine().toLowerCase(); // читает строку с клавиатуры до нажатия ввода
                                                              // в любом регистре и приводит ее к маленьким буквам.
                                                              // Это позволяет в методе сравнивать только маленькие буквы

        findVocals(userString);

    }
    //---------------- Methods ---------------

    public static void findVocals(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' || st.charAt(i) == 'y') {
                count++;
            }
        }
        System.out.println("The amount of vowels are " + count);
    }
    //---------------- End of methods ---------------

}
