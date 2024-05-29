package home_work_08;

public class GroupMaxMinHeightOrAge {
    public static void main(String[] args) {

        /*
        Задача 1.
        Собрать в массив данные о росте (или возрасте) членов группы.
        Выведите на печать максимальное и минимальное значение.
        */

        System.out.println();

        int i = 0;
        int a = 162;
        int b = 182;
        int[] grHeight = new int[20];

        while (i < grHeight.length) {
            grHeight[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print(grHeight[i] + " | " );
            i++;
        }
        System.out.println();

        i = 0;
        int grHeightMax = grHeight[0];
        int grHeightMin = grHeight[0];
        while (i < grHeight.length) {
            grHeightMax = (grHeightMax < grHeight[i]) ? grHeight[i] : grHeightMax;
            grHeightMin = (grHeightMin > grHeight[i]) ? grHeight[i] : grHeightMin;
            i++;
        }
        System.out.println("Maximal height of the group is " + grHeightMax);
        System.out.println("Minimal height of the group is " + grHeightMin);

        System.out.println("************************************************************************************************************************");

        System.out.println();

        a = 25;
        b = 40;
        i = 0;
        int[] grAge = new int[20];

        while (i < grAge.length) {
            grAge[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print(grAge[i] + " | " );
            i++;
        }
        System.out.println();

        i = 0;
        int grAgeMax = grAge[0];
        int grAgeMin = grAge[0];
        while (i < grAge.length) {
            grAgeMax = (grAgeMax < grAge[i]) ? grAge[i] : grAgeMax;
            grAgeMin = (grAgeMin > grAge[i]) ? grAge[i] : grAgeMin;
            i++;
        }
        System.out.println("Maximal age of the group is " + grAgeMax);
        System.out.println("Minimal age of the group is " + grAgeMin);
    }
}
