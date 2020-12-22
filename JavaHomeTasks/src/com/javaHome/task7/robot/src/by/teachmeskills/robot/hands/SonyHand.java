package com.javaHome.task7.robot.src.by.teachmeskills.robot.hands;

public class SonyHand implements  IHand {
    private int price;

    public SonyHand(int price) {
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
        System.out.println("Поднимается рука Sony");
    }
}
