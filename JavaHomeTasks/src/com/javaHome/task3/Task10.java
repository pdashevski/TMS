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

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
    }
}
