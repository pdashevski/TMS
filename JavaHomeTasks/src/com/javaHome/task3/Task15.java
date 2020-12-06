package com.javaHome.task3;

/*
    5) "Сожмите" массив, выбросив из него каждый второй элемент.
    Освободившиеся места массива заполните нулями.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task15 {
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
        for (int i = 0; i < array1.length; i++) {
            if(i % 2 == 1){
                array1[i] = 0;
            }
        }

        System.out.print("Каждый второй элемент массива = 0: ");
        for (int a : array1) {
            System.out.print(a + " ");
        }
    }
}
