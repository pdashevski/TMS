package com.javaHome.task8;

/*
    7. Даны строки разной длины (длина - четное число), необходимо вернуть ее два
    средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */

public class Strings7 {
    public static void main(String[] args) {
        trimmer("string");
        trimmer("code");
        trimmer("Practice");
    }

    public static void trimmer(String s) {
        if (s.length() % 2 == 0) {
            System.out.println(s.charAt(s.length() / 2 - 1) + "" +  s.charAt(s.length() / 2));
        }
    }
}
