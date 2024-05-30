package practicum;

public class ReturnFromMethods2 {

    public static void main(String[] args) {
        int[] myArray = {4, 9, 54, 63, 75, 1, 0, 7};

        sumOfArray(myArray);
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += sum;
        }

        return sum;
//        System.out.println("The sum of all munbers in the array = " + sum);

    }

}
