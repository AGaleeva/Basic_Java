package lesson;

public class WhileLoop {
    public static void main(String[] args) {
        // Цикл While

        // повторение одного действия без цикла
        /*
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        */

        // для такой задачи существуют циклы while (do while).

        // while ( condition (must be boolean) ) { statement (1 or many); }

        int i = 0; // initialization (присвоение нач-го зн-я переменной, контролирующей цикл)
        while (i < 10) {
            System.out.println(1);
            i++;
        }
        System.out.println("End of \"while loop\".");

        i = 1;
        while (i <= 10) {
            System.out.println(i); // System.out.println(i++); - более короткая запись
            i++;
        }
        System.out.println("End of \"while loop\".");

        System.out.println();

        int j = 10;
        while (j >= 1) {
            System.out.println(j--);
        }

        /*
        while (true) {  // это бесконечный цикл
            System.out.println("hello");
        }
        */

        // print out latin alphabet of small letters
        System.out.println("Alphabet");
        char ch = 'a';

        while (ch < 'z') {
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println();
        System.out.println();

        // Написать программу, считающую сумму чисел от 1 до 5.
        // 1 + 2 + 3 + 4 + 5

        int y = 1;
        int sum = 0;

        while (y <= 5) {
            sum = sum + y;
            y++;
        }
        System.out.println(sum);

        int n = 100;
        while (y <= n) {
            sum = sum + y;
            y++;
        }
        System.out.println("sum of " + n + " digits is " + sum);


        // DO-WHILE loop (цикл while может не выполниться ни разу, если условие на входе уже ложное
        // а цикл do-while выполняется по крайней мере один раз, поскольку условие проверяется после действия,
        // в конце цикла.

        /*
        do {
        statement(s)
        } while (condition);
        */

        System.out.println("Do-while loop example");

        int g =10;

        do {
            System.out.println(g--);
        } while (g >= 1);

        System.out.println();

        g = 0; // условие ложно, но происходит первая итерация цикла
        do {
            System.out.println(g--);
        } while (g >= 1);

        // Цикл можен находиться внутри другого цикла


        // Пример: написать программу, выводящую на экран таблицу умножения.

        System.out.println("таблица умножения");

        int i1 = 1;
        while (i1 <= 9) { // i1 = 1 и мы вошли во внешний цикл

            int j1 = 1;
            while (j1 <= 10) { // j1 = 1 и мы вошли во внутренний цикл
                System.out.println(i1 + " x " + j1 + " = " + (j1 * i1)); // здесь i1 не будет меняться на протяжении
                                                                        // всего внутреннего цикла до j1 = 10
                j1++;
            }
            System.out.println("**************");
            i1++;
        }

    }
}
