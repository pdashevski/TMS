package com.javaHome.task9.Products0;

/*
    Создать класс товар (идентификатор (id), имя, цена)
    Создать список товаров
    Вывести товары в порядке добавления
    Найти товар в списке по id
    Изменить цену товара по id
    Удалить товар из списка по id
    Вывести товары по убыванию цены;
    Вывести товары по алфавиту;
    Вывести товары в порядке добавления
 */

public class Tovar implements Comparable<Tovar> {
    private int id;
    private String name;
    private int price;

    public Tovar(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        return this.id - o.id;
    }

}
