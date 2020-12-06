package com.javaHome.task3;

/*
    4) Найти наименьший нечетный элемент.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива: ");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array1 = new int[arraySize];
        Random randomNumber = new Random();

        System.out.print("Исходный массив: ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber.nextInt(10);
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n");

        int[] array2 = new int[array1.length / 2];
        int incr = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array2[incr] = array1[i];
                incr++;
            }
        }
        System.out.print("Нечетные элементы массива: ");
        for (int a : array2) {
            System.out.print(a + " ");
        }
        Arrays.sort(array2);
        System.out.print("\nНаименьший нечетный элемент массива: " + array2[0]);
    }
}
