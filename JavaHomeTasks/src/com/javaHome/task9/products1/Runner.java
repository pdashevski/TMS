package com.javaHome.task9.products1;

import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        shop1.addTovarsToList(new Tovar(1,"asd", 112));
        shop1.addTovarsToList(new Tovar(1,"odin", 115));
        shop1.addTovarsToList(new Tovar(2,"asdf", 113));
        shop1.addTovarsToList(new Tovar(3,"asdfg", 114));

        shop1.getTovars().sort(Comparator.comparingDouble(Tovar::getPrice));
        System.out.println(shop1.getAllTovars());

        shop1.removeTovarsFromList(2);
        shop1.getTovars().sort(Comparator.comparingDouble(Tovar::getId));
        System.out.println(shop1.getAllTovars());

        shop1.editTovar(shop1.getTovars().get(0));
        System.out.println(shop1.getAllTovars());

    }
}
