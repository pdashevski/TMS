package com.javaHome.task8;

/*
    6. Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented
    programming» (не учитываем регистр символов) на «OOP». Например, строка
    "Object-oriented programming is a programming language model organized around
    objects rather than "actions" and data rather than logic. Object-oriented programming
    blabla. Object-oriented programming bla." должна быть преобразована в
    "Object-oriented programming is a programming language model organized around
    objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented
    programming bla."
 */

public class Strings6 {
    public static void main(String[] args) {
        String s = "Object-oriented programming is a programming language model organized around" +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming" +
                " blabla. Object-oriented programming bla.";

        System.out.println(s);

        System.out.println("----------");





        String[] lines = s.split(" ");


        for (String line : lines) {
            //находим индекс первого вхождения символа ":" в подстроке
            int pos = line.indexOf("-");
            //вычленяем имя атрибута из подстроки
            String attributeName = line.substring(0, pos);
            //вычленяем значение атрибута
            String value = line.substring(pos + 1, line.length());
            //вывод на экран вычлененных значений в нужном нам формате.
            System.out.println(attributeName + " - " + value);
        }


    }



}
