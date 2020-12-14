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
    private boolean isBurned;
    private static int computerCount = 0;
    private int countOfCycle;

    public Computer(String cpuName, int ramQuantity, int hddVolume, int pcCycles) {
        this.cpuName = cpuName;
        this.ramQuantity = ramQuantity;
        this.hddVolume = hddVolume;
        this.pcCycles = pcCycles;
        isBurned = false;
        computerCount++;
        this.countOfCycle = pcCycles;
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
        System.out.println("Computer number is: " + computerCount);
        System.out.println("CPU name: " + cpuName);
        System.out.println("RAM quantity: " + ramQuantity);
        System.out.println("HDD volume: " + hddVolume);
        System.out.println("PC cycle quantity: " + pcCycles);
    }

    public void pcTurnOn() throws IOException {
        if (!isBurned) {
            System.out.println("PC " + cpuName + " is ON!");
            while (countOfCycle != 0) {
                countOfCycle--;
                if (randomNumber() == userNumber()) {
                    if (countOfCycle != 0) {
                        pcTurnOff();
                    } else {
                        pcBurn();
                        //isBurned = true;
                        //break;
                    }
                } else {
                    //isBurned = true;
                    pcBurn();
                    //break;
                }
            }
        } else {
            System.out.println("Нельзя запустить " + cpuName + ", он сгорел!");
        }
    }

    public void pcTurnOff() throws IOException {
        if (!isBurned) {
            System.out.println("PC " + cpuName + " is OFF!");
            while (countOfCycle != 0) {
                countOfCycle--;
                if (randomNumber() == userNumber()) {
                    if (countOfCycle != 0) {
                        pcTurnOn();
                    } else {
                        pcBurn();
                        //isBurned = true;
                        //break;
                    }
                } else {
                    //isBurned = true;
                    pcBurn();
                    //break;
                }
            }
        } else {
            System.out.println("Нельзя запустить " + cpuName + ", он сгорел!");
        }
    }

    public void pcBurn() {
        isBurned = true;
        System.out.println("PC " + cpuName + " is Burned!");
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
