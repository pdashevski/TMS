package com.javaHome.task3;

/*
    9. Пользователь должен указать с клавиатуры положительное число, а
    программа должна создать массив указанного размера из случайных целых
    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    определить и сообщить пользователю о том, сумма какой половины массива
    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
    пользователь введёт неподходящее число, то выдать соответствующее
    сообщение
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random randomNumber = new Random();
        System.out.println("Введите положительное ЧЕТНОЕ число:");
        String s = reader.readLine();
        int arraySize = Integer.parseInt(s);

        int sumLeft = 0, sumRight = 0;

        for (; ;) {
            if (arraySize % 2 != 0) {
                System.out.println("Вы ввели неподходящее число!");
                break;
            } else {
                int[] array = new int[arraySize];

                for (int i = 0; i < array.length; i ++) {
                    array[i] = randomNumber.nextInt(15);
                    System.out.print(array[i] + " ");
                }

                for (int i = 0; i < array.length / 2; i++) {
                    sumLeft += array[i];
                }

                for (int i = array.length / 2; i < array.length; i++) {
                    sumRight += array[i];
                }

                if (sumLeft == sumRight) {
                    System.out.println("Левая половина массива и правая равны!");
                } else {
                    System.out.print("\n");
                    System.out.println("Левая половина массива = " + sumLeft + ", правая половина массива = " + sumRight);
                    System.out.print("\n");
                    System.out.println(sumLeft > sumRight ? "Левая половина массива больше " + "(" + sumLeft + ")" : "Правая половина массива больше " + "(" + sumRight + ")");
                }





            }
            break;
        }




    }
}
