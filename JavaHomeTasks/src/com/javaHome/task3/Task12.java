package com.javaHome.task3;

/*
    2) Найти среднее арифметическое элементов с нечетными номерами.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива:");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array = new int[arraySize];
        Random randomNumber = new Random();
        double average = 0;
        int count = 0;

        System.out.print("Исходный массив: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10);
            if (i % 2 == 0) {
                count++;
                average += array[i];
            }
            System.out.print(array[i] + " ");
        }

        System.out.print("\nСреднее арифметическое элементов с нечетными номерами " + average / count);
    }
}
