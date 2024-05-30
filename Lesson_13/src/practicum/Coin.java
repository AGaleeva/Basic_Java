package practicum;

public class Coin {

    /*
    Задание 2. Написать методы, реализующие имитацию:

    бросание монеты
    стрельбу по мишени (вар 1 - попал/не попал, вар 2 - результат от 0 до 10)
    На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
    орел и решка n = (int)(Math.random() * (1 - 0 + 1) + 0)
    */
    public static void main(String[] args) {

//        int[] game = new int[10];
        int n = 20;
        int[] game = coin(n);
        for (int i = 0; i < n ; i++) {
            System.out.print(game[i] + " | ");
        }
    }

    public static int[] coin(int n)  {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
        }
        return arr;
    }

}
