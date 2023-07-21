import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
public class Task1_3_4_4 {
    public static void main(String args[]) {
        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");
        System.out.println("Для решения ниже создан класс 'FindMax'.");

        FindMax findMax = new FindMax();
        findMax.inputIntegers();

        findMax.printResult();
    }
}

class FindMax {
    Scanner scanner = new Scanner(System.in);
    int[] inputList;
    int max;

    void inputIntegers() {
        this.scanner = scanner;
        System.out.print("Please enter integer a: ");
        int a = this.scanner.nextInt();
        System.out.print("Please enter integer b: ");
        int b = this.scanner.nextInt();
        System.out.print("Please enter integer c: ");
        int c = this.scanner.nextInt();

//        this.a = a;
//        this.b = b;
//        this.c = c;

        this.inputList = new int[]{a, b, c};
        this.max = max;

//        for (int i = 0; i < inputList.length; i++) {
//            if (max < inputList[i]) {
//                max = inputList[i];
        for (int i = 0; i < this.inputList.length; i++) {
            if (this.max < this.inputList[i]) {
                this.max = this.inputList[i];
            }
        }
//        System.out.println("The max number is: " + this.max);


    }

    void printResult() {
        System.out.println("The max number is: " + this.max);
    }

}
//        Конец Примера _ КККККККККККККККК








////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_6 {
//    public static void main(String args[]) {
//        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
//                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");
//        System.out.println("Создан класс 'TaskDefinition'.");
////        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
////                "без this в нашем случае результат будет null, т.е. некорректным.");
////        Draft_Task1_3_4_6 s1 = new Draft_Task1_3_4_6();
////        s1.result(max);
////        s1.print();
////    }
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Please enter integer a: ");
////        int a = scanner.nextInt();
////        System.out.print("Please enter integer b: ");
////        int b = scanner.nextInt();
////        System.out.print("Please enter integer c: ");
////        int c = scanner.nextInt();
////
////        int[] inputList = {a, b, c};
////        int max = inputList[0];
////
////        for (int i = 0; i < inputList.length; i++) {
////            if (max < inputList[i]) {
////                max = inputList[i];
////            }
////        }
////        System.out.println("The max number is: " + max);
//
//        TaskDefinition findMax = new TaskDefinition();
//        findMax.inputIntegers();
//
//        findMax.printResult();
////        void result (int max) {
////            this.max = max;
////        }
////        void print () {
////            System.out.println("With \"this\", name is: "/* + name*/);
////        }
//    }
//}
////        Конец Примера 3 КККККККККККККККК










////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_6 {
//    public static void main(String args[]) {
//        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
//                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");
//
////        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
////                "без this в нашем случае результат будет null, т.е. некорректным.");
////        Draft_Task1_3_4_6 s1 = new Draft_Task1_3_4_6();
////        s1.result(max);
////        s1.print();
////    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter integer a: ");
//        int a = scanner.nextInt();
//        System.out.print("Please enter integer b: ");
//        int b = scanner.nextInt();
//        System.out.print("Please enter integer c: ");
//        int c = scanner.nextInt();
//
//        int[] inputList = {a, b, c};
//        int max = inputList[0];
//
//        for (int i = 0; i < inputList.length; i++) {
//            if (max < inputList[i]) {
//                max = inputList[i];
//            }
//        }
//        System.out.println("The max number is: " + max);
//
//        TaskDefinition findMax = new TaskDefinition();
//        findMax.inputIntegers();
//
//
////        void result (int max) {
////            this.max = max;
////        }
////        void print () {
////            System.out.println("With \"this\", name is: "/* + name*/);
////        }
//    }
//}
////        Конец Примера 2 КККККККККККККККК









////        Пример 1 ППППППППППППППППППППППППППППППППППП Из задания 2.
//public class Draft_Task1_3_4_6 {
//    String name;
//
//    void result(String name) {
//        this.name = name;
//    }
//    void print() {
//        System.out.println("With \"this\", name is: " + name);
//    }
//    public static void main(String args[]) {
//        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
//                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");
//
//        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
//                "без this в нашем случае результат будет null, т.е. некорректным.");
//        Draft_Task1_3_4_6 s1 = new Draft_Task1_3_4_6();
//        s1.result("Alex");
//        s1.print();
//    }
//}
////        Конец Примера 1 КККККККККККККККК







