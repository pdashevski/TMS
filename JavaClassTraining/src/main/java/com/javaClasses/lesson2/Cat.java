package com.javaClasses.lesson2;

public class Cat extends Animal{
    private boolean mouseCatcher;
    private String instLink;

    public Cat(String name, int age, boolean mouseCatcher, String instLink) {
        super(name, age);
        this.mouseCatcher = mouseCatcher;
        this.instLink = instLink;
    }

    public boolean isMouseCatcher() {
        return mouseCatcher;
    }

    public void setMouseCatcher(boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }

    public String getInstLink() {
        return instLink;
    }

    public void setInstLink(String instLink) {
        this.instLink = instLink;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("isCatcher: " + isMouseCatcher());
        System.out.println("ints page: " + instLink);
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
