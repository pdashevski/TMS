package com.javaHome.task3;

/*
    8. Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
    массива должен равняться отношению элемента из первого массива с i-ым
    индексом к элементу из второго массива с i-ым индексом. Вывести все три
    массива на экран (каждый на отдельной строке), затем вывести количество
    целых элементов в третьем массиве.
 */

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        Random randomNumber = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNumber.nextInt(9);
            array2[i] = randomNumber.nextInt(9);
            array3[i] = (double) array1[i] / array2[i];
        }

        int countOfIntegrNumbers = 0;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 1 == 0) {
                countOfIntegrNumbers++;
            }
        }

        for (int a : array1) {
            System.out.print(a + " ");
        }

        System.out.println("\n");

        for (int b : array2) {
            System.out.print(b + " ");
        }

        System.out.println("\n");

        for (double c : array3) {
            System.out.print(c + "  ");
        }
        System.out.println("\n");

        System.out.print("Количество целых элементов в 3 массиве: " + countOfIntegrNumbers);
    }
}
