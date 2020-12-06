package com.javaHome.task3;

/*
    7) Подсчитать, сколько раз встречается элемент с заданным значением.
    Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива: ");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array1 = new int[arraySize];
        Random randomNumber = new Random();
        System.out.println("Введите число до 10: ");
        String s2 = reader.readLine();
        int number = Integer.parseInt(s2);

        System.out.print("Исходный массив: ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber.nextInt(10);
            System.out.print(array1[i] + " ");
        }

        int count = 0, index = 0;
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == number) {
                index = i;
                count++;
            }
        }
        System.out.println("\nЧисло " + number + " встречается: " + count + " раз. Второй по величине элемент = " + array1[index + 1]);
    }
}
