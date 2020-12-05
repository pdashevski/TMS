package com.javaHome.task3;

/*
    10. Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
    переменную n. Если пользователь ввел не подходящее число, то программа
    должна выдать соответствующее сообщение. Создать массив из n случайных
    целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
    только из четных элементов первого массива, если они там есть, и вывести его
    на экран.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random randomNumber = new Random();

        for (; ;) {
            System.out.println("Введите число большее 3:");
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            int n1 = 0;

            if (n < 3) {
                System.out.println("Вы ввели число меньше, чем 3!");
                break;
            } else {
                int[] array1 = new int[n];

                for (int i = 0; i < array1.length; i++) {
                    array1[i] = randomNumber.nextInt(n);
                    System.out.print(array1[i] + " ");
                }

                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] % 2 == 0) {
                        n1++;
                    }
                }

                int[] array2 = new int[n1];
                System.out.print("\n");

                int incr = 0;
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] % 2 == 0) {
                        array2[incr] = array1[i];
                        incr++;
                    }
                }

                System.out.print("\n");
                for (int a : array2) {
                    System.out.print(a + " ");
                }
            }
            break;
        }
    }
}

