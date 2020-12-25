package com.javaClasses.lesson;

public class Book implements Printable{

    private String name;
    private String authot;

    public Book(String name, String authot) {
        this.name = name;
        this.authot = authot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthot() {
        return authot;
    }

    public void setAuthot(String authot) {
        this.authot = authot;
    }

    @Override
    public void print() {
        System.out.println("print book");
    }

    @Override
    public void printTitle() {
        System.out.println("print book title");
    }
}
