public class Triangle {
    public static void main(String[] args) {
        /*
        Задание 3. Даны 3 целых числа 10, 3 и 2 - длины отрезков.
        Проверьте, можно ли из них составить треугольник или нельзя?
        */

        // неравенство треугольника - длина любой стороны треугольника всегда меньше суммы длин двух его других сторон

        int a, b, c;
        a = 10;
        b = 3;
        c = 2;

        // && - двойной амперсанд экономит время: если первое же проверяемое значение ложное,
        // остальные операнды не рассматриваются

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Yes, triangle can be constructed.");
        } else {
            System.out.println("No, triangle can not be constructed.");
        }

    }
}
