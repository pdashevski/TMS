package com.javaHome.task7.person;

public class Run {
    public static void main(String[] args) {
        Person alex = new Person("Alex", new Jacket("красная"), new Pants("черные"), new Shoes("туфли"));
        System.out.println("Что надето на " + alex.getName() + ": ");
        alex.getDressed();
        System.out.println("Что снято с " + alex.getName() + ": ");
        alex.undress();
        System.out.println("_______________________________");
        Person alina = new Person("Alina", new Jacket("белая"), new Pants("желтая"), new Shoes("кросовки"));
        System.out.println("Что надето на " + alina.getName() + ": ");
        alina.getDressed();
        System.out.println("Что снято с " + alina.getName() + ": ");
        alina.undress();
    }
}
