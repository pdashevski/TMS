package com.javaHome.task7.robot.src.by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
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
        System.out.println("Нога Toshiba делает шаг");
    }
}
