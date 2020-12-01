package com.javaHome.task2;

public class Task6 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            //System.out.println("*");
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("");

        for(int i = 4; i != 0; i--) {
            System.out.println("*");
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
