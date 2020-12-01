package com.javaHome.task2;

public class Task4 {
    public static void main(String[] args) {
        double oneInch = 2.54;
        int inch = 0;
        System.out.println("Таблица перевода расстояний из дюймов в сантиметры:");

        while (inch < 20) {
            inch++;
            if (inch == 1) {
                System.out.println(inch + " дюйм = " + inch * oneInch);
            } else if (inch > 1 && inch < 5) {
                System.out.println(inch + " дюйма = " + inch * oneInch);
            } else {
                System.out.println(inch + " дюймов = " + inch * oneInch);
            }
        }
    }
}
