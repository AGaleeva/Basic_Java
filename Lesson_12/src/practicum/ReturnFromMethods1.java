package practicum;

public class ReturnFromMethods1 {

    public static void main(String[] args) {
        int result = sumNumbers(1, 2); // вернувшееся значение sum записывается в переменную
                                             // result, а дальше ее уже можно исользовать
        System.out.println(result + 1);

        System.out.println(sumNumbers(2, 7)); // тоже можно обойтись без дополнительной переменной (result)
    }


    static int sumNumbers(int a, int b) { // здесь нужно указать тип того, что возвращает метод, void -  не возвращает ничего
//        int sum = a + b;
//        System.out.println(sum);
//        return sum;
        return a + b; // можно в таких простых вариантах обойтись без лишней переменной, а просто возвращать результат выражения
    }
}
