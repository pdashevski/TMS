package com.javaHome.task8;

/*
    2. Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
    позиции 0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Input string:");
            String s = reader.readLine();
            System.out.println(s.replace(s.charAt(3), s.charAt(0)));
        }
        catch (Exception e) {

        }
    }
}
