public class StringsTopic {
    // String class

    String john = "John"; // такой способ это можно применить у строчек, без использования new, поскольку это часто используемый класс

    // String bill = new String(); - это базовый метод для всех классов

    public static void main(String[] args) {
        String hello = "Hello";
        String java = "Java";
        // this is a consequence of the symbols   H e l l o
        //                                        0 1 2 3 4  length = 5

        System.out.println("Length of hello is " + hello.length()); // or
        int len = hello.length();
        System.out.println("Length of hello is " + len);

        int lenJava = java.length();
        System.out.println("Length of java is " + lenJava);

        // charAt() - метод, который символ на заданной позиции (по заданному индексу)

        char ch0 = hello.charAt(0); // H
        System.out.println(ch0);
        char ch1 = hello.charAt(1); // e
        System.out.println(ch1);
        char ch2 = hello.charAt(2); // l
        System.out.println(ch2);
        char ch3 = hello.charAt(3); // l
        System.out.println(ch3);
        char ch4 = hello.charAt(4); // o
        System.out.println(ch4);

        System.out.print(ch0);
        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4 + "\n");

        System.out.print(ch0 + " ");
        System.out.print(ch1 + " ");
        System.out.print(ch2 + " ");
        System.out.print(ch3 + " ");
        System.out.print(ch4 + " " + "\n");
        System.out.println();

        // перевод букв в верхний регистр

        System.out.println(hello.toUpperCase());
        String helloCapital = hello.toUpperCase();
        System.out.println(helloCapital);

        // перевод букв в нижний регистр

        String helloSmall = helloCapital.toLowerCase();
        System.out.println(helloSmall);
    }
}
