package practicum;

public class ReturnFromMethods3 {
    public static void main(String[] args) {

//      написать метод, принимающий имя и возвращающий строку тима Hello, name!
        String res = helloName("John");
        System.out.println(res);

        System.out.println(helloName("Ann"));

    }

    static String helloName(String name) {
//        String res = "Hello, " + name + "!";
//
//        return res;

        return "Hello, " + name + "!";
    }

}
