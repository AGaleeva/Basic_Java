package practicum;

public class ReturnFromMethods5 {

    /*
    Написать метод, который принимет число и проверяет является ли число двузначным или трехзначным.
    Метод возвращает строку, в которой отвечает на этот вопрос.
    */

    public static void main(String[] args) {
        System.out.println(checkMunbers(321));
    }

    static  String checkMunbers(int num) {
        if(num >= 10 && num < 100)
            return num + " is two-digit number";
         else if (num >= 100 && num < 1000)
            return num + " is three-digit number";
//         else                                      // при наличии слов return последний else можноопустить
            return "This is not two- or three-digit number";
        }

}
