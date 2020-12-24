package com.javaHome.task8;

/*
    8. Слить две строки, вставив символы одной строки между символами другой строки
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input first string:");
            String s1 = reader.readLine();
            System.out.println("Input second string:");
            String s2 = reader.readLine();

            String[] s1s2 = new String[s1.length() + s2.length()];

            int index1 = 0;
            int index2 = 0;

            for (int i = 0; i < s1s2.length; i++) {
                if (i % 2 != 0 && index1 < 3) {

                    s1s2[i] = String.valueOf(s2.charAt(index1));
                    index1++;
                } else {
                    s1s2[i] = String.valueOf(s1.charAt(index2));
                    index2++;
                }
            }

            for (String str : s1s2) {
                System.out.print(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
