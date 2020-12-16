package com.javaHome.task6;


public abstract class LandTransport extends Transport {     //наземный транспорт
    private int wheelCount;     //количество колёс
    private double fuelConsuption;      //расход топлива (л/100км)

    public LandTransport(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelConsuption) {
        super(power, maxSpeed, weight, brand);
        this.wheelCount = wheelCount;
        this.fuelConsuption = fuelConsuption;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(double fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public String inf() {
        return "Мощность: " + super.getPower() + " л.с" + ", Максимальная скорость: " + super.getMaxSpeed() + " км/ч" + ", Масса: " + getWeight() + " т." + ", Марка: " + super.getBrand() +
                ", Количество колёс: " + wheelCount + ", Расход топлива: " + fuelConsuption + " л/100км";
    }

    public double powerKW() {
        return getPower() * 0.74;
    }
}
