
//        Пример _ ППППППППППППППППППППППППППППППППППП Этот пример использовал
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
//        Конец Примера _ КККККККККККККККК



////        Пример 7 ППППППППППППППППППППППППППППППППППП Ещё один пример с this, не использовал
//public class Draft_Task1_3_4_2 {
//    public static void main(String[] args) {
//        Human human1 = new Human();
//        human1.setName("Volodya");
//        human1.print();
//    }
//}
//class Human {
//    String name;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    void print(){
//        System.out.println("With 'this': " + name);
//    }
//}
////        Конец Примера 7 КККККККККККККККК







////        Пример 6 ППППППППППППППППППППППППППППППППППП Ещё один пример без this, не использовал
//public class Draft_Task1_3_4_2 {
//    public static void main(String args[]) {
//        Human human1 = new Human();
//        human1.setName("Volodya");
//        human1.print();
//    }
//}
//
//class Human {
//    String name;
//    public String getName() {
//        return name;
//    }
//            public void setName(String newName) {
//                name = newName;
//        }
//        void print () {
//            System.out.println("Without 'this': " + name);
//    }
//}
////        Конец Примера 6 КККККККККККККККК







////        Пример 5 ППППППППППППППППППППППППППППППППППП
//class Draft_Task1_3_4_2 {
//    String name;
//
//    void data(String name) {
//        this.name = name;
////        name = name;
//    }
//
//    void disp() {
//        System.out.println("With \"this\", name: " + name);
//    }
//
//    public static void main(String args[]) {
//        Draft_Task1_3_4_2 s1 = new Draft_Task1_3_4_2();
//        s1.data("Alex");
//        s1.disp();
//    }
//}
////        Конец Примера 5 КККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП Берем в качестве примера
//public class Draft_Task1_3_4_2
//{
//    int a = 1;
//
//    void bar(int a)
//    {
//        System.out.println("Локальная переменная: " + a);
//        System.out.println("Экземпляр метода bar в классе new Draft_Task1_3_4_2() (который по сути является классом Main в данном коде):  " + this.a);
//    }
//
//    public static void main(String[] args)
//    {
//        new Draft_Task1_3_4_2().bar(2);
//    }
//}
////        Конец Примера 4 КККККККККККККККК






////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_2 {
//    private int a;
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n2.  Можно ли обратиться к полям класса, не используя ключевое слово this? Как?\n\nРешение: ");
//
//
//    }
//    public void printa(int a){
//        a=1;
//        System.out.println(a); // the argument a
//        System.out.println(this.a); // the field a
//
//    }
//}
////        Конец Примера 3 КККККККККККККККК






////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n2.  Можно ли обратиться к полям класса, не используя ключевое слово this? Как?\n\nРешение: ");
//        printa();
//
//    }
//
//    private static void printa(int a) {
//        System.out.println(a);
//        System.out.println(this.a);
//
//    }
//
//    public class thisThing {
//        public int a;
//
//        public void arrays() {
//            a = 1;
//
//        }
//
//
//        public void printa(int a) {
//            System.out.println(a);
//            System.out.println(this.a);
//        }
//    }
//}
////        Конец Примера 2 КККККККККККККККК






////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n2.  Можно ли обратиться к полям класса, не используя ключевое слово this? Как?\n\nРешение: ");
//
//
//    }
//    public class thisThing {
//        public int a;
//
//        public void arrays() {
//            a = 1;
//
//        }
//
//        public void A() {
//            this.a = 10;
//        }
//
//        public void printa() {
//            System.out.println(a);
//            System.out.println(this.a);
//        }
//    }
//}
////        Конец Примера 1 КККККККККККККККК








