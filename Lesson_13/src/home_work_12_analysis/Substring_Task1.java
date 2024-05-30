package home_work_12_analysis;

public class Substring_Task1 {

    /*
    Задача 1.
    Написать метод, принимающий строку и возвращающий второй
    и третий символы строки заглавными буквами.
    Пример : Hello-> EL
    В методе main() вывести получившийся результат на экран.
    */

    public static void main(String[] args) {
        String st = "Hello";

        System.out.println(bringTwoLettSubstr(st));
    }

    public static String bringTwoLettSubstr(String str) {
        return str.substring(1, 3).toUpperCase();
    }

}
