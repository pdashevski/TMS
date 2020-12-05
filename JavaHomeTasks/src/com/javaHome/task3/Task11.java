package com.javaHome.task3;

/*
    1) Найти произведение элементов, кратных 3.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task11 {
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

        int arr1Length = 0;
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 3 == 0) {
                arr1Length++;
            }
        }

        int[] arr1 = new int[arr1Length];
        int incr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 3 == 0) {
                arr1[incr] = array[i];
                incr++;
            }
        }

        if (incr > 0) {
            System.out.print("\nМассив, состоящй из элементов кратных трём из исходного массива: ");
            for (int ar : arr1) {
                System.out.print(ar + " ");
            }
            int multi = 1;
            for (int i = 0; i < arr1.length; i++) {
                multi *= arr1[i];
            }
            System.out.print("\nПроизведение элементов, кратных 3: " + multi);
        } else {
            System.out.println("В исходном массиве нет элементов, кртаных трём");
        }



        //System.out.println("Произведение элементов, кратных 3 = " + multiplication);
    }

}
