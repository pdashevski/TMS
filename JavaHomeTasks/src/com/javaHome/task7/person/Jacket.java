package com.javaHome.task7.person;

public class Jacket implements IJacket {
    private String jacketName;

    public Jacket(String jacketName) {
        this.jacketName = jacketName;
    }

    public String getJacketName() {
        return jacketName;
    }

    public void setJacketName(String jacketName) {
        this.jacketName = jacketName;
    }

    @Override
    public void putOn() {
        System.out.println("Куртка " +  jacketName + " надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка " +  jacketName + " снята");
    }
}
