package com.javaHome.task9.products1;

import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Shop foodShop = new Shop();
        foodShop.addTovarsToList(new Tovar(1,"Apple",112));
        foodShop.addTovarsToList(new Tovar(1,"Lemon",115));
        foodShop.addTovarsToList(new Tovar(2,"Milk",113));
        foodShop.addTovarsToList(new Tovar(3,"Water",111));

        foodShop.getTovars().sort(Comparator.comparingDouble(Tovar::getPrice));
        System.out.println(foodShop.getAllTovars());

        foodShop.removeTovarsFromList(2);
        foodShop.getTovars().sort(Comparator.comparingDouble(Tovar::getId));
        System.out.println(foodShop.getAllTovars());

        foodShop.editTovar(foodShop.getTovars().get(0));
        System.out.println(foodShop.getAllTovars());

    }
}
