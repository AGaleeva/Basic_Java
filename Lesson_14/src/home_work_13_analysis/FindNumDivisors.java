package home_work_13_analysis;

import java.util.Arrays;

public class FindNumDivisors {

    public static void main(String[] args) {

        System.out.println("Print all divisors");
        findAllDividers(8);

        System.out.println(Arrays.toString(findAllDividers(9)));

    }
    
    
//    =========================================================
    
    public static int[] findAllDividers(int n) {
        
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int index = 0;
        int[] divisors = new int[counter];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index] = i;
                index++;

            }
        }
        return divisors;
    }
    
    
//    =========================================================
}
