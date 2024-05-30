package practicum;

import java.util.Scanner;

public class Garbage {

    /*
    Задание 3. Написать метод, который получает на вход вид выбрасываемого мусора (слово),
    а возвращает цвет урны, в которую его надо выбросить. Протестировать метод, вызвав
    его в методе main.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of garbage do you have: paper, bio, plastic, residual waste?");
        String w = scan.nextLine();

        String resp = colorBin(w);
        System.out.println("Please put your garbage in the " + resp + " container.");

    }

    public static String colorBin(String g) {
        switch (g) {
            case "paper" :
                return "blue";

            case "bio" :
                return "braun";

            case "residual waste" :
                return "grau";

            case "plastic" :
                return "yellow";

            default:
                return "your house" ;
        }
    }

}
