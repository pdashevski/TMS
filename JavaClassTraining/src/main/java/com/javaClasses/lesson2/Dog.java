package com.javaClasses.lesson2;

public class Dog extends Animal {
    private int countOfCommands;

    public Dog(String name, int age, int countOfCommands) {
        super(name, age);
        this.countOfCommands = countOfCommands;
    }

    public int getCountOfCommands() {
        return countOfCommands;
    }

    public void setCountOfCommands(int countOfCommands) {
        this.countOfCommands = countOfCommands;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("countOfCommands = " + countOfCommands);
    }

    @Override
    public void say() {
        System.out.println("woof");
    }
}
