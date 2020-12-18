package com.javaHome.task7.robot.src.by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
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
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }
}
