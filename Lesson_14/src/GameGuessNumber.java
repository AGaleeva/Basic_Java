import java.util.Scanner;

public class GameGuessNumber {
    /*
    Написать игру "угадай число", в которой за ограниченное число попыток
    ввода числа с клавиатуры, нужно угадать загаданное число от 0 до 9.

    Условия:
    1. Код игры находится в текущем классе.
    2. Класс должен содержать:
        - сканер для ввода числа
        - переменную secret, в которой записано загаданное чивло
        - следующие методы:
            - метод, считывающий количество предоставляемых попыток
            - метод, считывающий вводимое число
            - метод, содержащий логику игры
            - метод последовательности вызова предыдущих методов
    */

    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void main(String[] args) {
        start();
    }

//    ===================================================================

//    4-й метод для старта программы.
    public static void start() {
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }

//  считывает с клавиатуры количество попыток
    static int readNumberOfAttempts() {
        System.out.println("Please give me a number of attempts: ");
        return scanner.nextInt();
    }
//  считывает с клавиатуры вводимое пользователем число
    static int readNumber() {
        System.out.println("Please guess a number from 0 to 9: ");
        return scanner.nextInt();
    }

    static void guessNumber(int attempts) {
        while(attempts > 0) {
            int number = readNumber();
            attempts--;
            if (number == secret) {
                System.out.println("Bingo! You have guessed the secret number!!!");
                return;
            } else {
                System.out.println("Wrong! But you still haave " + attempts + " attempts.");
            }
        }
        System.out.println("Sorry, buddy. May be next time.");
    }

//    ===================================================================
}
