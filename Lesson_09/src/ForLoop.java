public class ForLoop {
    public static void main(String[] args) {

        // Цикл For;
        /*
        for (initialisation, condition, increment/decrement) {
            statement(s);
        }
        initialisation - присвоение начального значения переменной (счетчика), которая будет изменяться в цикле
        condition - булеановское выражение, определяющее будет ли выполняться цикл (условия выполнения цикла)
        increment/decrement - изменение счетчика
        */

        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
        }

        for (int i = 100; i >= - 100; i -=20) {
            System.out.println(i);
        }
        System.out.println("End of For-loop");

        for (int i = 10; i < 5; i++) {
            i++;
        } // Цикл вообще не запуститься, поскольку с самого начала условие ложно.

//        int i, j; // объявляем переменную в глобальной области видимости
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);
        }

        // "подражание" циклу while
        int i = 0;
        for (; i < 10;) {
//            System.out.println(i);
            i++;
        }
        System.out.println();

//        цикл может быть вообще пустой в блоке условий - получается бесконечный цикл
//        for ( ; ; ) {}

//        задача: посчитать сумму чисел от 0 до n, используя for цикл

        int n = 10;
        int sum = 0;

        for (int j = 0; j <= n; j++) {
            sum = sum + j;
        }
        System.out.println("Summa of numbers from 0 to 10 is " + sum);

        // For-loop без тела цикла
        sum = 0;
        for (int y = 0; y <= n; sum = sum + y++);

        System.out.println("Summa calculation without loop body is " + sum);





    }
}
