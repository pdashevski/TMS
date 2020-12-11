package com.javaHome.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Computer computer1 = new Computer();
        System.out.println("Введите название CPU: ");
        computer1.setCpuName(reader.readLine());

        System.out.println("Введите количество RAM: ");
        computer1.setRamQuantity(Integer.parseInt(reader.readLine()));

        System.out.println("Введите объем HDD: ");
        computer1.setHddVolume(Integer.parseInt(reader.readLine()));

        System.out.println("Введите кол-во жц пк: ");
        computer1.setPcCycles(Integer.parseInt(reader.readLine()));

        computer1.pcInfo();
        computer1.pcTurnOn();
    }
}
