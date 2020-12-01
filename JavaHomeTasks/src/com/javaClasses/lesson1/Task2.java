package com.javaClasses.lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 256) {
            a += b;
            b *= 2;
            System.out.println(b);

        }
        //System.out.println(b);
    }
}
