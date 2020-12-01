package com.javaHome.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    6. (Дополнительно) В переменную записываете количество программистов. В
    зависимости от количества программистов необходимо вывести правильно
    окончание. Например:
        2 программиста
        1 программист
        10 программистов
        и т.д.
 */

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число программистов: ");
        String s = reader.readLine();
        int count = Integer.parseInt(s);
        reader.close();
        if (count < 0) {
            System.out.println("Нет программистов!");
        } else if (count % 10 == 1 && count % 100 != 11) { //если число заканчиватся на 1, но не заканчивается на 11...
            System.out.println(count + " программист");
        } else if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 > 20)) { //если заканчивается на 2 3 4, но не на 12 и 14
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }

    }
}

