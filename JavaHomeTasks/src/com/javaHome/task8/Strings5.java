package com.javaHome.task8;

/*
    5. Даны два предложения посчитать сколько слов совпадает.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input first string with words:");
            String s1 = reader.readLine();
            System.out.println("Input second string with words:");
            String s2 = reader.readLine();

            int count1 = 0;

            for (String str1 : s1.split(" ")) {
                for (String str2 : s2.split(" ")) {
                    if (str1.equals(str2)) {
                        count1++;
                    }
                }
            }

            System.out.println("Count of equals words in strings:" + count1);
        }
        catch (Exception e) {

        }
    }

}
