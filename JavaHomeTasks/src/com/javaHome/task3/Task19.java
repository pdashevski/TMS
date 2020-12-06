package com.javaHome.task3;

/*
    9) Найти наименьший элемент среди элементов с четными индексами массива
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива:");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array = new int[arraySize];
        Random randomNumber = new Random();

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        int[] array2 = new int[array.length / 2];
        int incr = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array2[incr] = array[i];
                incr++;
            }
        }
        System.out.print("Четные элементы массива: ");
        for (int a : array2) {
            System.out.print(a + " ");
        }
        Arrays.sort(array2);
        System.out.print("\nНаименьший четный элемент массива: " + array2[0]);
    }
}
