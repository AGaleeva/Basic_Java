package home_work_13_analysis;

import java.util.Arrays;
import java.util.Random;

public class CharArrayT2 {

     /*
    Задача 2
    Реализуйте метод, который заполняет массив случайными буквами.
    Размер массива подается на вход методу.
    */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randomLetters(20)));

        System.out.println("Print words");
        System.out.println(Arrays.toString(randomWords(10)));
    }

//    ===========================================================
    public static char[] randomLetters(int length) {
        char[] letters = new char[length];
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
//            letters[i] = (char) random.nextInt(65, 91);
            letters[i] = (char) (random.nextInt(90 - 65) + 65);
        }
        return letters;
    }

    public static String[] randomWords(int length) {
        String[] words = new String[length];
        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
//            words[i] = (char) random.nextInt(65, 91);
            words[i] = String.valueOf((char) (random.nextInt(90 - 65) + 65));
        }
        return words;
    }

//    ===========================================================

}
