package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

//        Решение задания 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] + 1) % 2;
        }
        System.out.println(Arrays.toString(arr1));

//      Решение задания 2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) arr2[i] = i + 1;
        System.out.println(Arrays.toString(arr2));

        // Решение задания 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        // Решение задания 4
        int n = 4;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr4[i][i] = 1;
            arr4[i][n - 1 - i] = 1;
        }
        int initialValue = (int) (Math.random() * 100);
        arrayReturn(4, initialValue);
    }

    // Решение задания 5

    public static int[] arrayReturn(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr5));
        return arr5;
    }

}
