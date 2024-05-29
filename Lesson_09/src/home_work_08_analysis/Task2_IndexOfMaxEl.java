package home_work_08_analysis;

public class Task2_IndexOfMaxEl {
    public static void main(String[] args) {

        int[] ints = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = ints[0];
        int index = 0;
        int i = 0;

        while (i < ints.length) {
            if (ints[i] > max) {
                max = ints[i];
                index = i;
            }
            i++;
        }
        System.out.println("Max element of the array is " + max + " and its index is " + index);

    }
}
