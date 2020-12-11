package com.javaHome.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Computer computer1 = new Computer();
        System.out.println("Введите название CPU (AMD/Intel): ");
        computer1.setCpuName(reader.readLine());

        System.out.println("Введите количество RAM (MB): ");
        computer1.setRamQuantity(Integer.parseInt(reader.readLine()));

        System.out.println("Введите объем HDD (GB): ");
        computer1.setHddVolume(Integer.parseInt(reader.readLine()));

        System.out.println("Введите кол-во жц пк: ");
        computer1.setPcCycles(Integer.parseInt(reader.readLine()));

        computer1.pcInfo();
        computer1.pcTurnOn();
        computer1.pcTurnOn();

        Computer computer2 = new Computer("Intel", 4096, 1000, 3);

        computer2.pcInfo();
        computer2.pcTurnOn();
    }
}
