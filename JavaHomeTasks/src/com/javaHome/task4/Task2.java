package com.javaHome.task4;

/*
    2. Проверить произведение элементов какой диагонали больше.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность массива NxM:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        String sm = reader.readLine();
        int n = Integer.parseInt(sN);
        int m = Integer.parseInt(sm);
        Random randomNumber = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = randomNumber.nextInt(9);
            }
        }

        arrayPrinter(array);
        System.out.println("Произведение главной диагонали: " + diagMain(array));
        System.out.println("Произведение побочной диагонали: " + diagSecond(array));
        System.out.println(diagMain(array) > diagSecond(array) ? "Произведение главной диагонали больше, чем побочной" :
                "Произведение побочной диагонали больше, чем главной");

    }

    public static void arrayPrinter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int diagMain(int[][] array) {
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                    mul *= array[i][j];
                }
            }
            System.out.println();
        }
        return mul;
    }

    public static int diagSecond(int[][] array) {
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length + 1 - 2) {
                    System.out.print(array[i][j] + " ");
                    mul *= array[i][j];
                }
            }
            System.out.println();
        }
        return mul;
    }
}
