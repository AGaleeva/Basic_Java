package practicum;

import java.util.Scanner;

public class CalculatorEnhanced {
    public static void main(String[] args) {
        /*
        Задача 3. Calculator:
        добавить ввод чисел и математического действия пользователем;
        реализовать все вычисления методами, которые получают данные для вычислений на вход.
        */

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter first number: ");
            double a = scanner.nextDouble();
//            String bin = scanner.nextLine();
            System.out.println("What kind of action?");
            String action = scanner.next();
            if (action.equals("q")) {
                return;
            }
            System.out.println("Please enter second number: ");
            double b = scanner.nextDouble();

        switch (action) {
            case "+" : {
                sum(a, b);
                break;
            }
            case "-" : {
                subst(a, b);
                break;
            }
            case "*" : {
                mult(a, b);
                break;
            }
            case "/" : {
                divis(a, b);
                break;
            }
            default: {
                System.out.println("No action");
            }
        }

        }


    }
    // ----------------- Methods ----------------

    public static void sum(double n, double m) {
        System.out.println(n + m);
    }

    public static void subst(double n, double m) {
        System.out.println(n - m);
    }

    public static void mult(double n, double m) {
        System.out.println(n * m);
    }

    public static void divis(double n, double m) {
        System.out.println(n / m);
    }

    // ----------------- End of methods ----------------

}
