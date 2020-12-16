package com.javaHome.task6;

public class Passenger extends LandTransport {    //легковой транспорт
    private String bodyType;    //тип кузова
    private int passengerCount;     //количство пассажиров

    public Passenger(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelConsuption, String bodyType, int passengerCount) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelConsuption);
        this.bodyType = bodyType;
        this.passengerCount = passengerCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String inf() {
        return super.inf() + ", Тип кузова: " + bodyType + ", Количество пассажиров: " + passengerCount + ", Мощность в кВ: " + powerKW();
    }

    public void distanceAndFuel(double time) {
        System.out.println("За время " + time + "ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " +
                +(getMaxSpeed() * time) + " км и израсходует " + fuelCons(time) + " литров топлива");
    }

    private double fuelCons(double time) {
        return ((getMaxSpeed() * time) / getFuelConsuption());
    }


}
