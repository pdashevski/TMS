package com.javaHome.task8;

/*
    1. Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
    последнего вхождения символа(B).
 */

public class Strings1 {
    public static void main(String[] args) {
        String s = "qwertyaqwerbty";
        System.out.println(s.substring(s.indexOf('a'), s.indexOf('b') + 1));
    }
}
