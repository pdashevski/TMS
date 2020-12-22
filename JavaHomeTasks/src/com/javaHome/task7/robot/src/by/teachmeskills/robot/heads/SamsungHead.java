package com.javaHome.task7.robot.src.by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }
}
