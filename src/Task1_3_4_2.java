
public class Task1_3_4_2 {
    String name;

    void result(String name) {
        this.name = name;
    }
    void result2(String name) {
        name = name;
    }

    void print() {
        System.out.println("With \"this\", name is: " + name);
    }
    void print2() {
        System.out.println("Without \"this\", name is: " + name);
    }

    public static void main(String args[]) {
        System.out.println("Задание: \n2.  Можно ли обратиться к полям класса, не используя " +
                "ключевое слово this? Как?\n\nРешение: ");

        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
                "без this в нашем случае результат будет null, т.е. некорректным.");
        Task1_3_4_2 s1 = new Task1_3_4_2();
        Task1_3_4_2 s2 = new Task1_3_4_2();
        s1.result("Alex");
        s1.print();
        s2.result2("Alex");
        s2.print2();
    }
}