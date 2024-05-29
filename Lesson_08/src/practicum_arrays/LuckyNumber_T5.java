package practicum_arrays;

public class LuckyNumber_T5 {
    public static void main(String[] args) {

        /*
        Задача 5.
        Задано 6ти значное число, которое является номером автобусного билета.
        Проверьте, является ли этот билет счастливым.
        */

        int i = 0;
        int busTicketNum = 254632;
        int[] busTicketNumToArray = new int[6];
        for ( ; i < 6; i++) {
            busTicketNumToArray[i] = busTicketNum % 10;
            busTicketNum = busTicketNum / 10;
            System.out.print(busTicketNumToArray[i] + " ");
        }
        System.out.println();
        System.out.println();

        if (busTicketNumToArray[0] + busTicketNumToArray[1] + busTicketNumToArray[2] ==
                busTicketNumToArray[3] + busTicketNumToArray[4] + busTicketNumToArray[5]) {
            System.out.println("You have lucky ticket!");
        }


    }
}
