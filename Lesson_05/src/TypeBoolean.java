public class TypeBoolean {
    public static void main(String[] args) {
        // Тип boolean
        /*
        boolean занимает 1 бит и может принимать два значения true (1) или false (0)
        */

        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        // результатом выполнения операции сравнения в Java будет true или false
        // 10 > 9
        System.out.println("10 > 9 ? " + (10 > 9));
        System.out.println("10 > 9 ? " + (10 < 9));

        /*
           int a = 10;
           int c = 12;
           if (a < c) {
               System.out.println("a < c");
        }; */

        // Relational operators
        /*
        > больше чем
        < меньше чем
        >= больше или равно
        <= меньше или равно
        == равно
        != не равно

        Результатом выполнения операторов сравнения будет true или false
        * */

        int i = 11;
        int j = 10;
        System.out.println("comparing i and j");
        System.out.println("i = " + i + " and j =  "+ j);
        System.out.println("i < j " + (i < j));
        System.out.println("i > j " + (i > j));
        System.out.println("i <= j " + (i <= j));
        System.out.println("i >= j " + (i >= j));
        System.out.println("i == j " + (i == j));
        System.out.println("i != j " + (i != j));

        // Logical operators

        /*
         & - AND  И
         | - OR   ИЛИ
         ! - NOT  НЕ
         ^ - XOR (exclusive OR) исключающее ИЛИ
         */

        /*
          p           q         p & q (*)      p | q (+)         p ^ q      ! p

        False (0)    False       False        False (0 + 0)      False      True
        True (1)     False       False        True (1 + 0)       True       False
        False        True        False        True (0 + 1)       True       True
        True         True        True         True (1 + 1)       False      False

        p ^ q (XOR) - если операторы разные (один true, другой false), то результат будет true; а если операторы
                      одинаковые (false и false, true и true) - False
        */
        System.out.println();

        boolean b1 = true; // = 1
        boolean b2 = false; // = 0

        System.out.println("b1 & b2 " + (b1 & b2)); // 1 * 0 = 0 (false)
        System.out.println("! b1 & b2 " + !(b1 & b2)); // ! 0 = 1 (true)
        System.out.println("b1 | b2 " + (b1 | b2)); // 1 + 0 = 1 (true)
        System.out.println("b1 ^ b2 " + (b1 ^ b2));


        /*
        &&  -  Conditional -AND and
        ||  -  Conditional -OR
        Эти операторы будут проверять второй операнд только в случае необходимости, если результат непонятен.
        Обычные OR и AND будут всегда проверять оба операнда.
        */

        System.out.println();

        int n, d;

        n = 10;
        d = 2;

        if ( d != 0 && (n % d) == 0 ) {
            System.out.println("n can be divided by d without remainder");
        }

        if ( d != 0 & (n % d) == 0 ) {
            System.out.println("n can be divided by d without remainder");
        }

        d = 0;
        if ( d != 0 & (n % d) == 0 ) {
            System.out.println("n can be divided by d without remainder");
        }

        // по умолчанию мы используем && (нестрогое "И"), но если нужно обязательно проверить оба условия, то тогда - & (строгое "И").
    }
}
