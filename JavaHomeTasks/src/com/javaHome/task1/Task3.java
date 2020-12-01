package com.javaHome.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
    3. Даны 3 целых числа. Найти количество положительных чисел в исходном
    наборе.
 */

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите вервое число: ");
        String s1 = reader1.readLine();
        int x1 = Integer.parseInt(s1);
        list.add(x1);

        System.out.println("Введите второе число: ");
        String s2 = reader2.readLine();
        int x2 = Integer.parseInt(s2);
        list.add(x2);

        System.out.println("Введите третье число: ");
        String s3 = reader3.readLine();
        int x3 = Integer.parseInt(s3);
        list.add(x3);

        reader1.close();
        reader2.close();
        reader3.close();

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                count++;
            }
        }

        System.out.println("Количетсво положительных чисел в сиходном наборе: " + count);
    }
}

