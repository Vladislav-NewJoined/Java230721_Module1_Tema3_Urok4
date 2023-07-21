public class Task1_3_4_5 {
    public static void main(String[] args) {
        System.out.println("Задание: \n5.  Создайте класс, который делает из трех маленьких строк " +
                "\nодну большую. Ко всем переменным обращаться можно ТОЛЬКО используя this." +
                "\n\nРешение: ");
        System.out.println("Ниже создан класс ConcatStrings");

        ConcatStrings concatStrings = new ConcatStrings();
        concatStrings.concStr();
    }
}
class ConcatStrings {
    String str1 = "I love Java.";;
    String str2 = "I love to learn programming.";
    String str3 = "I strive to overmaster programming.";

    void concStr() {
        System.out.println("Исходные строки: ");
        System.out.print("Строка 1: " + this.str1 + "\n");
        System.out.print("Строка 2: " + this.str2 + "\n");
        System.out.print("Строка 3: " + this.str3 + "\n");
        System.out.print("Итоговая строка: \n");
//        System.out.println(this.str1 + " " + this.str2 + " " + this.str3);
        String concftenated = this.str1 + " " + this.str2 + " " + this.str3;
        System.out.println(concftenated);
    }
}