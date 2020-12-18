package com.javaHome.task7.person;

public class Pants implements  IPants {
    private String pantsColor;

    public Pants(String pantsColor) {
        this.pantsColor = pantsColor;
    }

    public String getPantsColor() {
        return pantsColor;
    }

    public void setPantsColor(String pantsColor) {
        this.pantsColor = pantsColor;
    }

    @Override
    public void putOn() {
        System.out.println("Штаны " + pantsColor + " надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны " + pantsColor + " сняты");
    }
}
