package com.javaHome.task7.person;

public class Person implements  IPerson {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
