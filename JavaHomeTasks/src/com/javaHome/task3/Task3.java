package com.javaHome.task3;

/*
    3. Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    это количество на экран на отдельной строке.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random randomNumber = new Random();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(99);
            if (array[i] % 2 == 0 && array[i] != 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "В массиве " + count + " чётных элементов");
    }
}
