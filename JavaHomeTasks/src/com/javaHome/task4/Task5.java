package com.javaHome.task4;

/*
    5. Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
    строкой и т. д.)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task5 {
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
        System.out.println("Первоначальная матрица: ");
        arrayPrinter(array);
        System.out.println("Транспонированная матрица: ");
        arrayPrinter(matrixTrans(array));


    }
    public static void arrayPrinter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixTrans(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }
}
