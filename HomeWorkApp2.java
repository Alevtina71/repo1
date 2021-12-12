package ru.geekbrains.lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        boolean b1 = methodOne(a, b);
        System.out.println(b1);

        methodTwo(a);

        boolean b2 = methodThree(a);
        System.out.println(b1);

        methodFour(a, "Hello");
    }

    // решение задания 1
    public static boolean methodOne(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    //решение задания 2
    public static void methodTwo(int a) {
        if (a >= 0) System.out.println("Число " + a + " - положительное");
        else System.out.println("Число " + a + " - отрицательное");
    }

    //решение задания 3
    public static boolean methodThree(int a) {
        return a < 0;
    }
    //решение задания 4
    public static void methodFour(int a, String str){
        while (a>0) {
            System.out.println(str);
        a--;
        }
    }
}