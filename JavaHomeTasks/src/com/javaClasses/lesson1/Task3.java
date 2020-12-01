package com.javaClasses.lesson1;

public class Task3 {
    public static void main(String[] args) {
        double y = 10;
        double x = 10;
        int i = 1;

        while (i < 7) {
            i++;
            y += y * 0.1;
            x += y;

        }
        System.out.println((int)x);


    }
}
