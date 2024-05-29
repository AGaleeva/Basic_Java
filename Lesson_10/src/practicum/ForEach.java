package practicum;

public class ForEach {
    public static void main(String[] args) {
        int ints[] = {2, 67, 34, 8};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

//      for - each loop (enhanced for)
//      Цикл for-each служит для перебора элементов массива без указания
//      индексов и длины массива.

        System.out.println("Print out elements with for-each method.");
        for (int num : ints) {  // Создается итерационная переменная num, в которую последовательно
                                // на каждом шаге цикла записывается очередное значение элемента.
                                // Она записывается в скобках после ключевого слова for.
                                // Дальше ставится двоеточие и справа от двоеточия пишется имя перебираемого массива.

            System.out.println(num);
        }

    }
}
