package com.javaClasses.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product(1, "Milk", 100);
        Product product2 = new Product(2, "Sugar", 150);
        Product product3 = new Product(3, "Water", 50);
        Product product4 = new Product(4,"Cost", 110);

        products.add(product1);
        products.add(product2);
        products.add(product3);


        System.out.println("Выводим продукты в порядке добавления:");
        for (Product prod : products) {
            System.out.println(prod);
        }
        System.out.println("-----------------------------------------");

        System.out.println("Найти товары в списке по id (2):");
        for (Product prod : products) {
            if (prod.getId() == 2) {
                System.out.println(prod);
            }
        }
        System.out.println("-----------------------------------------");

        System.out.println("Изменить цену товара по id (1):");
        for (Product prod : products) {
            if (prod.getId() == 1) {
                prod.setPrice(100.5);
                System.out.println(prod);
            }
        }
        System.out.println("-----------------------------------------");

        System.out.println("Удалить товар из списка по id (1):");
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
            Product next = iterator.next();
            if(next.getId() == 1) {
                iterator.remove();
            }
        }
        System.out.println("после удаления:");
        for (Product prod : products) {
            System.out.println(prod);
        }
        System.out.println("-----------------------------------------");

        System.out.println("Вывести товары по убыванию цены:");
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
            Product next = iterator.next();
            if(iterator.hasNext()) {
                double max = next.getPrice();
                if(next.getPrice() >= max ) {
                    System.out.println(iterator);
                } else {
                    max = next.getPrice();
                }
            }
        }


    }
}
