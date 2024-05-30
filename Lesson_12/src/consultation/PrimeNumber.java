package consultation;

public class PrimeNumber {

    /*
    Нaписать метод, принимающий целое число и проверяющий является ли число прострым.
    Если является, метод должен вернуть true, не является - false.
    Простое число - делится на себя и на единицу.
    Надо в цикле перебрать все числа, начиная с двойки до самого числа и проверить:
    если остаток от деления хоть раз будет равен нулю, то число является не простым.
    */

    public static boolean checkPrimeNum(int a) {
//        boolean result = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeNum(32));
    }
}
