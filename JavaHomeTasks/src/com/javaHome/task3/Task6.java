package com.javaHome.task3;

/*
    6. Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    на экран в строку. Определить и вывести на экран сообщение о том, является ли
    массив строго возрастающей последовательностью.
 */

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random randomNumber = new Random();
        boolean incr = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10);
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i++) {
            if(array[i] <= array[i - 1]){
                incr = false;
                break;
            }
        }

        System.out.print("\n");
        System.out.println(incr == true ? "Массив является строго возрастающей последовательностью" : "Массив не является строго возрастающей последовательностью");
    }
}
