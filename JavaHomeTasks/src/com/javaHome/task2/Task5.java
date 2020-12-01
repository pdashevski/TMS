package com.javaHome.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    5. Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число А:");
        String s1 = reader1.readLine();
        System.out.println("ведите число B:");
        String s2 = reader2.readLine();

        reader1.close();
        reader2.close();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int result = 0;
        for(int i = 0; i < a; i++) {
            result += b;
        }

        System.out.println(result);
    }
}
