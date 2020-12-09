package com.javaHome.task4;

/*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter matrix size N:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        int n = Integer.parseInt(sN);
        Random randomNumber = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = randomNumber.nextInt(9);
        }

        arrayPrinter(array);
        System.out.println();
        arrayPrinter(runningSum(array));
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    public static void arrayPrinter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
