package com.javaHome.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    2. Даны 2 числа. Вывести большее из них.
 */

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        String s1 = reader1.readLine();
        System.out.println("Введите второе число: ");
        String s2 = reader2.readLine();

        reader1.close();
        reader2.close();

        int x1 = Integer.parseInt(s1);
        int x2 = Integer.parseInt(s2);

        System.out.println("Большим числом является: " + (x1 > x2 ? x1 : x2));
    }
}

