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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TovarRunner {
    public static void main(String[] args) {
        List<Tovar> tovarPeace = new ArrayList<>();
        tovarPeace.add(new Tovar(1, "Milk", 100));
        tovarPeace.add(new Tovar(2, "Water", 30));
        tovarPeace.add(new Tovar(3, "Meet", 300));

        System.out.println("Вывести товары в порядке добавления:");
        for (Tovar pc : tovarPeace) {
            System.out.println(pc);
        }
        System.out.println("-----------------------------------------");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Найти товар в списке по id:");
            System.out.println("Введите id товара для поиска:");
            int s1 = Integer.parseInt(reader.readLine());
            for (Tovar pc : tovarPeace) {
                if (s1 == (pc.getId())) {
                    System.out.println(pc);
                    break;
                }
            }
            System.out.println("-----------------------------------------");

            System.out.println("Изменить цену товара по id:");
            System.out.println("Введите id товара для поиска:");
            int s111 = Integer.parseInt(reader.readLine());
            for (Tovar pc : tovarPeace) {
                if (s111 == (pc.getId())) {
                    System.out.println(pc);
                    System.out.println("Введите новую цену товара:");
                    int s21 = Integer.parseInt(reader.readLine());
                    pc.setPrice(s21);
                    System.out.println("Новая цен товара:");
                    System.out.println(pc);
                    break;
                }
            }
            System.out.println("-----------------------------------------");

            System.out.println("Удалить товар из списка по id");
            System.out.println("Введите id товара для удаления:");
            int s112 = Integer.parseInt(reader.readLine());
                System.out.println("Будет удален товар: " + s112);
                tovarPeace.removeIf(next -> next.getId() == s112);
                //break;
            for (Tovar pc : tovarPeace) {
                System.out.println(pc);
            }
            System.out.println("-----------------------------------------");

            System.out.println("Вывести товары по убыванию цены:");
            Collections.sort(tovarPeace);
            for (Tovar pc : tovarPeace) {
                System.out.println(pc);
            }
            System.out.println("-----------------------------------------");

            System.out.println("Вывести товары по алфавиту:");
            Collections.sort(tovarPeace, new TovarNameComparator());
            for (Tovar pc : tovarPeace) {
                System.out.println(pc);
            }
            System.out.println("-----------------------------------------");

            System.out.println("Вывести товары в порядке добавления:");
            for (Tovar pc : tovarPeace) {
                System.out.println(pc);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
