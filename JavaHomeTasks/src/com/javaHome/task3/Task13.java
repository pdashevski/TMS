package com.javaHome.task3;

/*
    3) Найти среднее арифметическое элементов массива, превосходящих некоторое число С.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину одномерного массива: ");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);
        int[] array = new int[arraySize];
        Random randomNumber = new Random();
        System.out.println("Введите некторое число C: ");
        String s1 = reader.readLine();
        int number = Integer.parseInt(s1);
        double average = 0;
        int count = 0;

        System.out.print("Исходный массив: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10);
            if (array[i] > number) {
                count++;
                average += array[i];
            }
            System.out.print(array[i] + " ");
        }

        System.out.print("\nСумма элементов, превосоходящих число " + number + " = " + average);
        System.out.println("\nКоличество элементов, превосоходящих число " + number + " = " + count);
        System.out.print("Среднее арифметическое элементов массива, превосходящих число " + number + " = " + average / count);
    }
}
