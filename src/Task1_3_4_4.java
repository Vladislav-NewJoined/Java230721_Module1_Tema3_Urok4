import java.util.Scanner;

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

        this.inputList = new int[]{a, b, c};
        this.max = max;

        for (int i = 0; i < this.inputList.length; i++) {
            if (this.max < this.inputList[i]) {
                this.max = this.inputList[i];
            }
        }
    }
    void printResult() {
        System.out.println("The max number is: " + this.max);
    }
}