package ru.geekbrains.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        String tree1 = "Orange";
        String tree2 = "Banana";
        String tree3 = "Apple";
        printThreeWords(tree1, tree2, tree3);

        int value1 = (int) (Math.random() * 1000);
        int value2 = (int) (Math.random() * 1000);
        checkSumSing(value1, value2);

        int colour = (int) (Math.random() * 1000);
        printColour(colour);

        int value3 = (int) (Math.random() * 1000);
        int value4 = (int) (Math.random() * 1000);
        compareNumbers(value3, value4);

    }

    public static void printThreeWords(String tree1, String tree2, String tree3) {
        System.out.println(tree1 + "\n" + tree2 + "\n" + tree3);
    }

    public static void checkSumSing(int a, int b) {

        if (a + b >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColour(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        a = (int) (Math.random() * 1000);
        b = (int) (Math.random() * 1000);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
