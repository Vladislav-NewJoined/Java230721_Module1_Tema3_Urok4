import java.util.Scanner;
import java.util.*;

//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
public class Task1_3_4_6 {
    public static void main(String args[]) {
        System.out.println("Задание: \n6.  Создайте класс, который принимает аргументом, какую задачу " +
                "\nон должен решить: “найти минимум из 2 чисел”, “найти сумму элементов " +
                "\nмассива”, “вывести строку с конца”. На выходе этот класс пишет в консоль " +
                "\nJava-код, который решает заданную задачу. Ко всем переменным обращаться " +
                "\nможно ТОЛЬКО используя this.\n\nРешение: ");
        System.out.println("Ниже создан класс 'TaskDefinition'.");

        TaskDefinition taskDefinition = new TaskDefinition();
        taskDefinition.inputNumberOfTask();
    }
}

class TaskDefinition {
    Scanner scanner = new Scanner(System.in);
    int taskNum;

    void inputNumberOfTask() {
        System.out.println("Нумерация задач: " +
                "\nЗадача 1.  Найти минимум из 2 чисел" +
                "\nЗадача 2.  Найти сумму элементов массива" +
                "\nЗадача 3.  Вывести строку с конца" +
                "\n");

        this.scanner = scanner;
        System.out.print("Введите номер задачи, от 1-го до 3-х: ");
        int taskNumber = this.scanner.nextInt();

        this.taskNum = taskNum;

        if (taskNumber == 1) {
            this.taskNum = 1;
            System.out.println("Выбрана задача 1. Найти минимум из 2 чисел" +
                    "\nРешение задачи: ");
        }
        if (taskNumber == 2) {
            this.taskNum = 2;
            System.out.println("Выбрана задача 2. Найти сумму элементов массива" +
                    "\nРешение задачи: ");
        }
        if (taskNumber == 3) {
            this.taskNum = 3;
            System.out.println("Выбрана задача 3. Вывести строку с конца" +
                    "\nРешение задачи: ");
        }

        if (taskNum == 1) {
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(20);
            System.out.print("Массив чисел: " + nums.toString() + "\n");

            int min = nums.get(0);

            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < min) {
                    min = nums.get(i);
                }
            }
            System.out.println("Минимальное число: " + min);
        }

        if (taskNum == 2) {
            ArrayList<Integer> nums2 = new ArrayList<>();
            nums2.add(1);
            nums2.add(3);
            nums2.add(5);
            nums2.add(7);
            System.out.print("Массив чисел: " + nums2.toString() + "\n");

            int sum = 0;
            for (int i = 0; i < nums2.size(); i++) {
                sum = sum + nums2.get(i);
            }
            System.out.println("Сумма элементов массива: " + sum);
        }

        if (taskNum == 3) {
            System.out.println("Исходная строка: \"Reverse String\"");
            System.out.print("Строка с конца: \"");
            String s = "Reverse String";
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print("\" + \n");
        }
    }
}
//        Конец Примера _ КККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_4_6 {
//    public static void main(String[] args) {
//        System.out.println("Исходная строка: \"Reverse String\"");
//        System.out.print("Строка с конца: \"");
//        String s = "Reverse String";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            System.out.print(s.charAt(i));
//        }
//        System.out.print("\"");
//    }
//}
//
////        Конец Примера 4 КККККККККККККККК











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







