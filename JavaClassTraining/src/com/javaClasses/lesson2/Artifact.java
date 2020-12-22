package com.javaClasses.lesson2;

public class Artifact {
    private int artNumber;
    private String culture;
    private int century;
    private static int counter;



    public Artifact(int artNumber) {
        this(artNumber, "unknown");
    }

    public Artifact(int artNumber, String culture) {
        this(artNumber, culture, Integer.MIN_VALUE);
    }

    public Artifact(int artNumber, String culture, int century) {
        this.artNumber = artNumber;
        this.culture = culture;
        this.century = century;
    }

    public void printInfo() {
        System.out.println("Artifact id: " + getArtNumber() + ", artifact culture: " + getCulture() + ", artifact century: " + getCentury());
    }

    public int getArtNumber() {
        return artNumber;
    }

    public String getCulture() {
        return culture;
    }

    public int getCentury() {
        return century;
    }

    //set

    public void setArtNumber(int artNumber) {
        this.artNumber = artNumber;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public void setCentury(int century) {
        this.century = century;
    }
}
