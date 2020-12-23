package com.javaHome.task8;

/*
    3. Перевернуть строку, изменив расположение символов в строке задом наперёд.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input string:");
            StringBuilder sb = new StringBuilder(reader.readLine());
            System.out.println(sb.reverse());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
