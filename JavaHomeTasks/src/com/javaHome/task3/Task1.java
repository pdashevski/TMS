package com.javaHome.task3;

/*
    1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
    массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
    созданием массива подумайте, какого он будет размера.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[20 / 2];

        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }

        for (int j : array) {
            System.out.print("\n" + j);
        }

    }
}
