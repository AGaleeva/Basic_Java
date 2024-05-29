package practicum;

public class MethodsInJava {
    public static void main(String[] args) {

        printHello();
        System.out.println("After primtHelo method");
        sumNumbers();

/*        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello World");
        System.out.println("Hello Java");*/

    }

//     методы в Java можно создавать только обособленно от других методов,
//     т.е. за границами предыдущего метода.

    static void printHello() { // это сигнатура метода, а затем его надо вызвать в методе main

        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello World");
        System.out.println("Hello Java");
    }

    static void sumNumbers() {
        int a = 3;
        int b = 4;
        int sum = a + b;
        System.out.println("a + b = " + sum);
    }
}
