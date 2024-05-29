public class NegativeOrPositive {
    public static void main(String[] args) {
        /*
        Задание 2. Имеются два целых числа n и m, задайте их самостоятельно в программе.
        Выясните, является ли хотя бы одно из них отрицательным?
        */

        int n, m;

        n = 8;
        m = -3;

        if (n < 0 | m < 0) {
            System.out.println("One of the numbers is negative.");
        } else {
            System.out.println("Both numbers are positive.");
        }

    }
}
