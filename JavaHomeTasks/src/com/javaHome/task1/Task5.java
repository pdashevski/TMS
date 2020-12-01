package com.javaHome.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    5. В переменную записываем число. Надо вывести на экран сколько в этом
    числе цифр и положительное оно или отрицательное. Например, "это
    однозначное положительное число". Достаточно будет определить, является ли
    число однозначным, "двузначным или трехзначным и более.
 */

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String s = String.valueOf(reader.readLine());
        reader.close();
        isPositiveAndZero(s);
        countOfDigits(s);

    }

    public static void isPositiveAndZero (String s) {
        int x = Integer.parseInt(s);
        if (x > 0 && x != 0) {
            System.out.print("Число положительное ");
        } else if (x < 0) {
            System.out.print("Число отрицательное ");
        }
        else {
            System.out.print("Ноль ");
        }
    }

    public static void countOfDigits (String s) {
        if (String.valueOf(Math.abs(Integer.parseInt(s))).length() == 1) {
            System.out.print("однозначное");
        } else if (String.valueOf(Math.abs(Integer.parseInt(s))).length() == 2) {
            System.out.print("двузначное");
        } else if (String.valueOf(Math.abs(Integer.parseInt(s))).length() == 3) {
            System.out.print("трехзначное");
        } else if (String.valueOf(Math.abs(Integer.parseInt(s))).length() == 4) {
            System.out.print("четырехзначное");
        }
    }
}

