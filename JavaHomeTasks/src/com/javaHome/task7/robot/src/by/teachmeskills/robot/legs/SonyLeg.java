package com.javaHome.task7.robot.src.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
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
    public void step() {
        System.out.println("Нога Sony делает шаг");
    }
}
