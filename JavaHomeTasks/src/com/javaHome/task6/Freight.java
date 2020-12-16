package com.javaHome.task6;

public class Freight extends LandTransport {    //грузовой транспорт
    private int carryingCapacity;   //грузоподъемность (т)

    public Freight(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelConsuption, int carryingCapacity) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelConsuption);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String inf() {
        return super.inf() + ", Грузоподъемность: " + getCarryingCapacity() + " т., Мощность в кВ: " + powerKW();
    }

    public void capacity(int gruz) {
        if (gruz <= getCarryingCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }


}
