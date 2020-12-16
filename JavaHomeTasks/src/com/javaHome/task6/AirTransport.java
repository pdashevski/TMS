package com.javaHome.task6;

public abstract class AirTransport extends Transport {
    private int wingspan;   //размах крыльев (м)
    private int minRunWay;  //Минимальная длина взлётно-посадочной полосы для взлёта

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunWay) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunWay = minRunWay;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunWay() {
        return minRunWay;
    }

    public void setMinRunWay(int minRunWay) {
        this.minRunWay = minRunWay;
    }

    public String inf() {
        return "Мощность: " + super.getPower() + " л.с" + ", Максимальная скорость: " + super.getMaxSpeed() + " км/ч" + ", Масса: " + getWeight() + " т." + ", Марка: " + super.getBrand() +
                ", Размах крыльев: " + wingspan + ", Минимальная длина взлётно-посадочной полосы для взлёта: " + minRunWay;
    }
}
