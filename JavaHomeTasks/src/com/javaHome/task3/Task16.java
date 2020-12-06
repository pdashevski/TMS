package com.javaHome.task3;

/*
    6) Проверить, различны ли все элементы массива.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива: ");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array1 = new int[10];
        Random randomNumber = new Random();

        System.out.print("Исходный массив: ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber.nextInt(10);
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n");
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] == array1[i]) {
                    count++;
                }
            }
        }

        System.out.println(count == 0 ? "Все элементы массива различны" : "В массиве есть одинаковые элементы");

    }
}
