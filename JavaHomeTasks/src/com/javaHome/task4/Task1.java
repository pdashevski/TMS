package com.javaHome.task4;

/*
    1. Посчитать сумму четных элементов стоящих на главной диагонали.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {
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
        System.out.println("Сумма четных элементов стоящих на главной диагонали: " + diagEven(array));
    }

    public static void arrayPrinter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int diagEven (int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; ++j) {
                if (i == j) {
                    if (i % 2 == 1 && j % 2 == 1) {
                        sum += array[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
