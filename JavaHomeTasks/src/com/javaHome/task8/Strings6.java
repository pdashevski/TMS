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
                " objects rather than \"actions\" and data rather than logic. Object-oriented programming" +
                " blabla. Object-oriented programming bla.";
        System.out.println(s);
        change(s);
    }

    public static void change(String s) {
        System.out.println("----------");
        String[] subStr;
        String delimiter = "\\."; // Разделитель
        subStr = s.split(delimiter);
        subStr[1] = "OOP blabla";
        for (String ss : subStr) {
            System.out.print(ss + ". ");
        }
    }
}
