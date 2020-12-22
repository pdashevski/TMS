package com.javaHome.task7.person;

public class Shoes implements IShoes {
    private String shoesType;

    public Shoes(String shoesType) {
        this.shoesType = shoesType;
    }

    public String getShoesType() {
        return shoesType;
    }

    public void setShoesType(String shoesType) {
        this.shoesType = shoesType;
    }

    @Override
    public void putOn() {
        System.out.println("Обувь " + shoesType + " надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь " + shoesType + " сняты");
    }
}
