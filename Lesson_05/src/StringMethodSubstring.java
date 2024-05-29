public class StringMethodSubstring {
    public static void main(String[] args) {

        // substring() method - 1) Находит часть строки, начиная с символа на указанной позиции

        //             0 1 2 3 4
        //             w o r l d
        String world = "world";
        String subWorld = world.substring(1);
        System.out.println(subWorld);

        // 2) Находит часть строк, начиная с символа на указанной позиции (beginIndex) и заканчивая (но, не включая) символом
        // на следующей указанной позиции (endIndex)

        subWorld = world.substring(1, 4); // если поставить вторым индексом "3", то будет только "or"
        System.out.println(subWorld);

        subWorld = world.substring(1, world.length() - 1);
        System.out.println(subWorld);

        subWorld = world.substring(0);
        System.out.println(subWorld);

        // В методе substring() символ на позиции начального индекса включается в подстроку, а конечного индекса - нет.
        // Индекс не может быть < 0 и индекс конца подстроки не может быть меньше индекса начала.
    }
}
