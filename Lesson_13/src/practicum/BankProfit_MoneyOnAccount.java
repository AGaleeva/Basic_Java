package practicum;

public class BankProfit_MoneyOnAccount {

    /*
    Задание 1. Реализуйте метод, который получает на вход сумму вклада,
    процентную ставку и количество дней, а возвращает накопленный доход.
    Формула для расчета: https://www.raiffeisen.ru/wiki/kak-rasschitat-procenty-po-vkladu/
    */

    public static void main(String[] args) {

        double sum = 0;
        double percent = 0;
        int days = 0;

        System.out.printf("The profit is %.2f", calculateProfit(350_000, 4.7, 273));

    }

    public static double calculateProfit(double sum, double perct, int days) {
//        double s = sum;
//        double p = perct;
//        int d = days;
//        int dy = 365;
//
//        double profit = (s * p * d / dy) / 100.0;
//
//        return profit;

        return (sum * perct * days / 365) / 100.0;
    }

}
