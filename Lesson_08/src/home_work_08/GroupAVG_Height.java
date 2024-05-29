package home_work_08;

public class GroupAVG_Height {
    public static void main(String[] args) {

        /*
        Задача 1.
        Собрать в массив данные о росте (или возрасте) членов группы.
        Выведите на печать максимальное и минимальное значение.
        */

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

        int sum = 0;
        i = 0;
        while (i < grHeight.length) {
            sum = grHeight[i] + sum;
            i++;
        }
        int grAVGheight = sum / grHeight.length;

        System.out.println("The average height of the group is: " + grAVGheight);

    }
}
