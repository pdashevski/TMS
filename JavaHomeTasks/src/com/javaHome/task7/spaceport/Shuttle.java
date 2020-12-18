package com.javaHome.task7.spaceport;

import java.util.Random;

public class Shuttle implements IStart{
    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return random.nextInt(10) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Всё в норме!");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла!");
    }
}
