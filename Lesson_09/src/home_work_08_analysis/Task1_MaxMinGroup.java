package home_work_08_analysis;

public class Task1_MaxMinGroup {
    public static void main(String[] args) {

        int[] age = {23, 22, 56, 18, 61, 43};

        int max = age[0];
        int min = age[0];
        int i = 0;

        while (i < age.length) {
            if (age[i] > max) {
                max = age[i];
            } else if (age[i] < min) {
                min = age[i];
            }
            i++;
        }
        System.out.println("Min age is " + min + " max age is " + max);


    }
}
