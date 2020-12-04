package com.javaHome.task3;

/*
    5. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние
    арифметические равны).
 */

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random randomNumber = new Random();
        double averageArray1 = 0, averageArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber.nextInt(15);
            averageArray1 += array1[i];
            System.out.print(array1[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = randomNumber.nextInt(15);
            averageArray2 += array2[i];
            System.out.print(array2[i] + " ");
        }

        System.out.print("\n");
        System.out.println("Среднее арифметическое элементов массива №1 = " + averageArray1 / array1.length);
        System.out.println("Среднее арифметическое элементов массива №2 = " + averageArray2 / array2.length);

        if ((averageArray1 / array1.length) > (averageArray2 / array2.length)) {
            System.out.println("Среднее арифметическое массива №1 оказалось больше");
        } else if ((averageArray1 / array1.length) < (averageArray2 / array2.length)) {
            System.out.println("Среднее арифметическое массива №2 оказалось больше");
        } else {
            System.out.println("Средние арифметические массивов №1 и №2 оказались равны");
        }
    }
}
