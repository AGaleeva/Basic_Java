package practicum;

public class MethodsWithSameName {  // Это называется "перегрузка метода", когда методу с тем же именем вводят доп.параметры

    public static void main(String[] args) {
        System.out.println(sumNumbers(8, 95));
        System.out.println(sumNumbers(1, 5, 7));
        System.out.println(sumNumbers(1.6, 5.9));
    }

    static int sumNumbers(int a, int b) {
        return a + b;
    }

    static int sumNumbers(int a, int b, int c) {
        return a + b + c;
//        return 1; можем вообще вернуть что-то еще, технически это возможно, хотя в реалиях не нужну.
    }

    static double sumNumbers(double a, double b) {
        return a + b;
    }

}
