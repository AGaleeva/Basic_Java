package home_work_08;

public class Cards {
    public static void main(String[] args) {

        /*
        Задача 4(*).
        Создайте массив, содержащий в себе название карточных мастей.
        Создайте массив, содержащий в себе карты от двойки до туза.
        Раздайте из колоды по 6 карт на 4 игрока.
        */

        String[] suits = {"spades ", "diamonds ", "clubs ", "hearts "};
        String[] cards = {"two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "jack ", "queen ", "king ", "ace "};

        int a = 0;
        int b = 3;
        int a1 = 0;
        int b1 = cards.length - 1;
        int n = 1;


       while (n <= 4) {
           System.out.println("Player " + n + " got: ");
           int k = 1;
           while (k <= 6) {
               int i = (int) (Math.random() * (b - a + 1) + a);
               int j = (int) (Math.random() * (b1 - a1 + 1) + a1);
               System.out.println(cards[j] + " " + suits[i]);
               k++;
           }
           n++;
           System.out.println();
       }


    }
}
