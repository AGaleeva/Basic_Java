package practicum;

import java.util.Random;

public class ReturnFromMethods4 {

        /*
        Задача 4 (*).
        Имеется массив данных - остатки на счетах клиентов банка
        (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        количество клиентских счетов = 20).
        Произошла деноминация, теперь 1 д.е = 100 старых д.е.
        Рассчитайте новые остатки денег на счетах клиентов.
        */

    public static void main(String[] args) {
        Random random = new Random();
        double[] randMoney = new double[20];

        for (int i = 0; i < randMoney.length; i++) {
            randMoney[i] = random.nextDouble(10000, 100000000);
            System.out.printf("%.2f %n", randMoney[i]);
        }
        double[] resDenom = countNewAmount(randMoney);
        System.out.println("Denominated money");
        for (int i = 0; i < resDenom.length; i++)
                System.out.printf("%.2f %n", resDenom[i]);

    }

    static double[] countNewAmount(double[] money) {
//        System.out.println("Denominated money");
        double[] denominated = new double[20];
        for (int i = 0; i < money.length; i++) {
            denominated[i] = money[i] / 100;
//            System.out.printf("%.2f %n", denominated[i]);
        }
        return denominated;
    }
}
