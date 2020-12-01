package com.javaClasses.lesson1;

public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while (a < 100) {
            a++;
            if(a % 2 != 0) {
                sum += a;

            }
        }
        System.out.println(sum);
    }

}
