package practicum;

// импортировать класс Scanner, если импорт не происходт автоматически при создании нового класса в методе Main (new Scanner).
import java.util.Scanner;

public class IntScaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаем сканер
        System.out.println("Please enter an integer"); // если этого не написать, можно не понять, что запускается сканер
//        scanner.nextInt(); // scanner будет ждать введенное с клавиатуры целое число, но ее надо записать в переменную
                             // для дальнейшего использования.
        int num1 = scanner.nextInt();
        System.out.println("You entered " + num1);

        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();
        System.out.println("You entered " + num2);

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

        scanner.close(); // потоки в java надо закрывать


    }
}
