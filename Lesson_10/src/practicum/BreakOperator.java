package practicum;

public class BreakOperator {
    public static void main(String[] args) {

        //        key word "break;" оно означает выход из цикла

        System.out.println("Key word \"break;\".");
        System.out.println();

        for (int i = 1; i < 100; i++) {
            System.out.println(i); // если строчку поставить до условия if, то будет распечатано 50 цифр.
            if (i == 50) {
                break;
            }
        }
        System.out.println("out of for loop");

        for (int i = 1; i < 100; i++) { // если строчку переставить после условия if, то будет распечатано только до 49.
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of for loop");



    }
}
