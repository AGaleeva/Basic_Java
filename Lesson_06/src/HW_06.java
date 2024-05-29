public class HW_06 {
    public static void main(String[] args) {
        /*
        Задача 1.
        Написать программу, выводящую на экран максимальное из трех целых чисел.
        Числа задайте самостоятельно внутри программы. Решите эту задачу с помощью
        if ... else и также с помощью тернарного оператора.
        */

        System.out.println("======= TASK 1 =======");

        int a, b, c;

        a = 2;
        b = -3;
        c = 7;

        if (a > b && a > c) {
            System.out.println("The maximal number of numbers " + a + ", " + b + " and " + c + " is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The maximal number of numbers " + a + ", " + b + " and " + c + " is: " + b);
        }
        else {
            System.out.println("The maximal number of numbers " + a + ", " + b + " and " + c + " is: " + c);
        }

        System.out.println();

        System.out.println("Solution with the ternary operator");

        a = 90;
        b = -14;
        c = 33;

        int numMax = (a > b) ? a : b;
        numMax = (c > numMax) ? c : numMax;
        System.out.println("The maximal number of numbers " + a + ", " + b + " and " + c + " is: " + numMax);

        System.out.println();

        /*
        Задача 2. В программе задаются случайным образом две целочисленные координаты x и y
        в интервале от -10 до 10. Определите, в какую четверть попадает точка с координатами ( x, y).
        */

        System.out.println("======= TASK 2 =======");

        int x1, y1, x2, y2;

        x1 = -3;
        x2 = 3;
        y1 = -3;
        y2 = 3;

        int xRand = (int)(Math.random() * (x2 - x1 + 1) + x1);
        int yRand = (int)(Math.random() * (y2 - y1 + 1) + y1);

        System.out.println(xRand);
        System.out.println(yRand);

       /* if (xRand > 0 & yRand > 0) {
            System.out.println("The point is in 1st quarter.");
        } else if (xRand > 0 & yRand < 0)  {
            System.out.println("The point is in 2nd quarter.");
        } else if (xRand < 0 & yRand < 0) {
            System.out.println("The point is in 3rd quarter.");
        } else if (xRand < 0 & yRand > 0) {
            System.out.println("The point is in 4th quarter.");
        } else if ((xRand != 0 & yRand == 0) || (xRand == 0 & yRand != 0)) {
            System.out.println("The point is at the line.");
        } else {
            System.out.println("The point is at the origin.");
        }*/

        String resStr;

        if (xRand >= 0) {
            resStr = "right ";
        } else {
            resStr = "left ";
        }
        if (yRand >= 0) {
            // resStr = resStr + "upper";
            resStr += "upper";
        } else {
            // resStr = resStr + "lower";
            resStr += "lower";
        }
        System.out.println("The point is in " + resStr + " quarter.");

        /*
        String result = (xRand >= 0 ? "right " : "left ") + (yRand >= 0 ? "upper " : "lower ");
        System.out.println("The point is in " + result + "quarter.");
        */

        System.out.println();

        /*
        Задача 3. По данному числу n закончите фразу "На лугу пасется..."
        одним из возможных продолжений: "n коров", "n корова", "n коровы",
        правильно склоняя слово "корова".
        Входные данные: Дано целое положительное число n (n <= 10),
        Выходные данные: Программа должна вывести введенное число n и одно
        из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.
        */

        System.out.println("======= TASK 3 =======");

        int n = 8;

        switch (n) {
            case 0, 5, 6, 7, 8, 9, 10: {
                System.out.println( "На лугу пасется " + n + " коров.");
                break;
            }
            case 1: {
                System.out.println( "На лугу пасется " + n + " корова.");
                break;
            }
            case 2, 3, 4: {
                System.out.println( "На лугу пасется " + n + " коровы.");
                break;
            }
            default: {
                System.out.println("Луг скосили.");
            }
        }

        System.out.println();

        /*
        Задача 4(*). Написать программу, определяющую является ли год високосным
        (значение года задается в программе). Для того чтобы быть високосным,
        год должен: делится без остатка на 4 и либо не должен делится без остатка на 100,
        либо, если он делится на 100, то он должен делится также на 400.
        */

        System.out.println("======= TASK 4 =======");

        int yearLeapOrNot = 2017;

        if ((yearLeapOrNot % 4 == 0) || ((yearLeapOrNot % 100 == 0) && (yearLeapOrNot % 400 == 0))) {
            System.out.println("The given year " + yearLeapOrNot + " is a leap-year.");
        } else {
            System.out.println("The given year " + yearLeapOrNot + " is a non-leap year.");
        }
    }
}
