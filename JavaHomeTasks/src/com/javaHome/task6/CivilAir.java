package com.javaHome.task6;

public class CivilAir extends AirTransport {    //гражданский воздушный транспорт
    private int passengerCount;     //количество пассажиров
    private boolean businessCab;    //наличие бизнес класса

    public CivilAir(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunWay, int passengerCount, boolean businessCab) {
        super(power, maxSpeed, weight, brand, wingspan, minRunWay);
        this.passengerCount = passengerCount;
        this.businessCab = businessCab;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isBusinessCab() {
        return businessCab;
    }

    public void setBusinessCab(boolean businessCab) {
        this.businessCab = businessCab;
    }

    @Override
    public String inf() {
        return super.inf() + ", Количество пассажиров: " + passengerCount + ", Наличие бизнес класса: " + businessCab;
    }

    public void capacity(int passe) {
        if (passe <= getPassengerCount()) {
            System.out.println("Кабина самолета загружена");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
