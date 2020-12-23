package com.javaHome.task8;

/*
    4. Посчитать сколько строка содержит слов и определить является ли хотя бы одно
    из слов палиндромом
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input string with words separated with whitespaces:");
            String s = reader.readLine();
            System.out.println("Words count in string: " + wordsCount(s));

            for (String s1 : s.split(" ")) {
                System.out.println(s1 + ": " + isPalindrome(s1));
            }

        }
        catch (Exception e) {

        }

    }

    public static int wordsCount(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s) {
        StringBuffer rev = new StringBuffer(s).reverse();
        String strRev = rev.toString();
        if(s.equalsIgnoreCase(strRev)) {
            return true;
        } else {
            return false;
        }
    }
}
