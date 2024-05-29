// import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        /*
        Задание 4. Задайте в программе число myGuess в интервале от 1 до 5.
        Затем для переменной n вызовите датчик случайных в интервале от 1 до 5.
        int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное целое
        число в интервале [a, b] a может быть и b тоже может быть. Проверьте, угадали
        ли вы число, которое выдал датчик случайных чисел.
        */

        int myGuess;
        myGuess = 4;

        int a, b;
        a = 1;
        b = 5;
        int n = (int)(Math.random() * (b - a + 1) + a); // генерация числа от 0 до 1 (0, 1),
                                                        // int - преобразование типа натурального в целое число
        System.out.println("n = " + n);

        if (myGuess == n) {
            System.out.println("Bingo! Your guess is correct!");
        } else {
            System.out.println("You loose!");
        }

    }
}
