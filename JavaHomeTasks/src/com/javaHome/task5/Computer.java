package com.javaHome.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Computer {

    private String cpuName;
    private int ramQuantity;
    private int hddVolume;
    private int pcCycles;
    private static boolean isBurned;
    private static int computerCount = 1;

    public Computer(String cpuName, int ramQuantity, int hddVolume, int pcCycles) {
        this.cpuName = cpuName;
        this.ramQuantity = ramQuantity;
        this.hddVolume = hddVolume;
        this.pcCycles = pcCycles;
        isBurned = false;
        computerCount++;
    }

    public Computer() {

    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getRamQuantity() {
        return ramQuantity;
    }

    public void setRamQuantity(int ramQuantity) {
        this.ramQuantity = ramQuantity;
    }

    public int getHddVolume() {
        return hddVolume;
    }

    public void setHddVolume(int hddVolume) {
        this.hddVolume = hddVolume;
    }

    public int getPcCycles() {
        return pcCycles;
    }

    public void setPcCycles(int pcCycles) {
        this.pcCycles = pcCycles;
    }

    public void pcInfo() {
        String cpu = getCpuName();
        int ram = getRamQuantity(), hdd = getHddVolume(), cycles = getPcCycles();
        System.out.println("Computer number is: " + computerCount);
        System.out.println("CPU name: " + cpu);
        System.out.println("RAM quantity: " + ram);
        System.out.println("HDD volume: " + hdd);
        System.out.println("PC cycle quantity: " + cycles);
    }

    public void pcTurnOn() throws IOException {
        if (!isBurned) {
            System.out.println("PC " + getCpuName() + " is ON!");
            int countOfStarts = 0;
            while (countOfStarts < getPcCycles()) {
                if (randomNumber() == userNumber()) {
                    countOfStarts++;
                    if (countOfStarts < getPcCycles()) {
                        pcTurnOff();
                    } else {
                        pcBurn();
                        isBurned = true;
                        break;
                    }
                } else {
                    pcBurn();
                    isBurned = true;
                    break;
                }
            }
        } else {
            System.out.println("Нельзя запустить " + getCpuName() + ", он сгорел!");
        }
    }

    public void pcTurnOff() {
        System.out.println("PC " + getCpuName() + "  is OFF!");

    }

    public void pcBurn() {
        System.out.println("PC " + getCpuName() + " is Burned!");
    }

    public static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("(~computer random number~): " + randomNumber);
        return randomNumber;
    }

    public static int userNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
