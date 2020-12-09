package com.javaHome.task4;

/*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
    i customer has the j in the bank. Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter matrix size NxM:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        String sm = reader.readLine();
        int n = Integer.parseInt(sN);
        int m = Integer.parseInt(sm);
        Random randomNumber = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = randomNumber.nextInt(9);
            }
        }

        arrayPrinter(array);
        System.out.println("Wealth that the richest customer has: " + maximumWealth(array));

    }

    public static void arrayPrinter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i < accounts.length; i++){
            int res = 0;
            for(int j = 0; j < accounts[0].length; j++){
                res += accounts[i][j];
            }
            ans = Math.max(ans,res);
        }
        return ans;
    }
}
