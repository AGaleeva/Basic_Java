package practicum_arrays;

public class BeOrNotToBe_T4 {
    public static void main(String[] args) {

        /*
        Задача 4.
        Имеется строка "Быть или не быть".
        Распечатайте эту строку в обратном порядке.
        */

        String str = "Быть или не быть";
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)

        for (int i = strToArray.length -1; i >= 0; i--) {
            System.out.print(strToArray[i]);
        }


    }
}
