package com.javaHome.task6;

public class MilitaryAir extends AirTransport {
    private boolean ejection;   //наличие системы катапультирования
    private int rocketCount;    //количество ракет на борту

    public MilitaryAir(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunWay, boolean ejection, int rocketCount) {
        super(power, maxSpeed, weight, brand, wingspan, minRunWay);
        this.ejection = ejection;
        this.rocketCount = rocketCount;
    }

    public boolean isEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    @Override
    public String inf() {
        return super.inf() + ", Наличие системы катапультирования: " + ejection + ", Количество ракет на борту: " + rocketCount;
    }

    public void piu() {
        if (rocketCount != 0 && rocketCount > 0) {
            rocketCount--;
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (ejection == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
