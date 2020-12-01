package com.javaHome.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1. Дано целое число. Если оно является положительным, то прибавить к нему 1.
    Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
    10. Вывести полученное число.
 */

public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите целое число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        int x = Integer.parseInt(s);

        if (x > 0 && x != 0) {
            System.out.println((x += 1) + " - число положительное");
        } else if (x < 0 && x != 0) {
            System.out.println((x -= 2) + " - число отрицательное");
        } else if (x == 0) {
            System.out.println((x = 10) + " нулевое число");
        }


    }

}

