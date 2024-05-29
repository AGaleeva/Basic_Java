package home_work_11;

import java.util.Random;

public class MoneyArray_T4 {
    public static void main(String[] args) {

        /*
        Задача 4 (*).
        Имеется массив данных - остатки на счетах клиентов банка
        (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        количество клиентских счетов = 20).
        Произошла деноминация, теперь 1 д.е = 100 старых д.е.
        Рассчитайте новые остатки денег на счетах клиентов.
        */

        Random random = new Random();

        double[] moneyArr = new double[20];
        for (int i = 0; i < moneyArr.length; i++) {
            moneyArr[i] = random.nextDouble(10000.0, 100000000.0);
            System.out.printf("%.2f | ", moneyArr[i]);
        }
        System.out.println();

        moneyRecalc(moneyArr);

    }
    public static void moneyRecalc(double[] arr) {
        double[] newMoney = new double[20];
        for (int i = 0; i < arr.length; i++) {
            newMoney[i]  = arr[i] / 100;
            System.out.printf("%.2f | ", newMoney[i]);
        }

    }
}
