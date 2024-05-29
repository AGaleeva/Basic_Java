package home_work_08_analysis;

import java.util.Random;

public class Task3_RandomArrayModified {
    public static void main(String[] args) {

        Random random = new Random();
//        random.nextInt(100); // генератор сгенерирует число до 100
//      System.out.println(random.nextInt(10, 21));
//        random.nextInt(10, 21); // сгенерирует число от 10 до 20

//       random.nextInt(max - min + 1 ) + min - сгенерирует число в границе
//       от min до max, если не пользоваться автоматическим свойством.


        int[] numms = new int[20];

        int maxRandom = 20;
        int minRandom = 10;

        int i = 0;

        while (i < numms.length) {
            numms[i] = random.nextInt(maxRandom - minRandom + 1) + minRandom;
            System.out.print(numms[i] + " | ");
            i++;
        }

        System.out.println();

        int temp = numms[0];
        numms[0] = numms[numms.length - 1];
        numms[numms.length - 1] = temp;

        i = 0;
        while (i < numms.length) {
            System.out.print(numms[i] + " | ");
            i++;
        }

    }
}
