package com.javaHome.task9.products1;

import java.util.Objects;

public class Tovar {
    private int id;
    private String name;
    private double price;

    public Tovar(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTovar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals (Object otherObject){
        if(!(otherObject instanceof Tovar)){
            return false;
        }
        if(((Tovar)otherObject).getId() == (this.id)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
