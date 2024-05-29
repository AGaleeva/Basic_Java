public class HW_4_Analysis {
    public static void main(String[] args) {
        /* Задача 1
         * Написать программу, вычисляющую и выводящую на печать значение символа "В" по ASCII.  */

        int charB = 'B';
        System.out.println(charB);
        charB ++;
        System.out.println(charB);

        int hex = 0xFF; // 16-ричное число
        System.out.println(hex); // 255

        int binary = 0b1100; // двоичное число
        System.out.println(binary);

        /* Задача 2
         * Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
         * Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi */

        String a = "Hi";
        String b = "Bye";

        String result = a + b + b + a;
        System.out.println(result);

        /*Задача 3
         * Написать прогрмму, выводящую на экран символ строки с индексом 2.
         * Например, если строка Java, то результат будет 'v'. */

        String javaString = "Java";

        char chJava = javaString.charAt(2);
        System.out.println("Symbol at the 2nd place in the word \"Java\" is " + chJava);

        javaString = "Hi";
        int lengthHi = javaString.length();
        char chHi = javaString.charAt(lengthHi - 1);
        System.out.println("Symbol at the last position in the word \"" + javaString + "\" is " + chHi);

        javaString = "Bye";
        int lengthBye = javaString.length();
        char chBye = javaString.charAt(lengthBye - 1);
        System.out.println("Symbol at the last position in the word \"" + javaString + "\" is " + chBye);
    }
}
