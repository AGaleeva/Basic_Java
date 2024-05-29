public class CharsTopic {
    public static void main(String[] args) {
        // 101 = 1*2^2 + 0*2^1 + 1*2^0 = 4 + 0 + 1 = 5 - двоичная система
        System.out.println("\u0024");  // Unicode system - код в шестнадцатеричной системе

        char ch;
        ch = 'X';

        System.out.println("This is character: " + ch);
        System.out.println("This is character: " + 'X');

        ch++;
        System.out.println("This is character: " + ch);

        int chInt = 'X';
        System.out.println("chInt is " + chInt); // выводится числовое значение символа из таблицы Unicode.

        char char1 = 88;
        System.out.println("As a result is a character: " + char1);

        System.out.println("He says \"Hello\"");

        // \" - для передачи двойных кавычек
        // \ ' - одинарная кавычка
        // \\ -
        // \n - перевод каретки (переход на новую строку)

        System.out.print("Hello");
        System.out.print("\nJava\n");

        // \t - табуляция

        System.out.println("Hello\tJava\tHello");

        // \u0000 - 16-ричная константа, символ Unicode

        System.out.println("k"); // "k" - это строка из одного символа
        System.out.println('k'); // 'k' - это символ

        Person john = new Person();
        john.name = "John";
        john.age = 25;

        System.out.println("Person's name is " + john.name + ".");
        System.out.println("Person's age is " + john.age + ".");
        john.canWalk();
        john.canTalk();

        Person bill = new Person();
        bill.name = "Bill";
        bill.age = 46;

        System.out.println("Person's name is " + bill.name + ".");
        System.out.println("Person's age is " + bill.age + ".");
        bill.canWalk();
        bill.canTalk();
    }
}
