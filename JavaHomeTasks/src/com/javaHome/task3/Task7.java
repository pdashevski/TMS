package com.javaHome.task3;

/*
    7. Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    какой элемент является в этом массиве максимальным и сообщите индекс его
    последнего вхождения в массив.
 */

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random randomNumber = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(20);
        }

        System.out.println("Исходный массив: ");

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\n");

        int maxNumber = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                index = i + 1;
            }
        }
        System.out.print("Элемент " + maxNumber + " массива с индексом " + index + " является максимальным");
    }
}
