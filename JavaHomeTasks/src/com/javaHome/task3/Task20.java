package com.javaHome.task3;

/*
    10) Найти максимальный элемент в массиве и поменять его местами с нулевым
    элементом
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива:");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array = new int[arraySize];
        Random randomNumber = new Random();
        int min = 0,max = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10);
            if (array[min] > array[i]) {
                min = i;
            }
            if (array[max] < array[i]) {
                max = i;
            }
        }

        System.out.print("\n");
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальный элемент массива: " + array[min]);
        System.out.println("Максимальный элемент массива: " + array[max]);

        temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        System.out.println(Arrays.toString(array));
    }
}
