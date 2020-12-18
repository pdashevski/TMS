package com.javaHome.task7.spaceport;

import java.util.Random;

public class Proton implements IStart {
    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return random.nextInt(5) < 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели ракеты запущены. Всё в норме!");
    }

    @Override
    public void start() {
        System.out.println("Старт ракеты ПРОТОН!");
    }
}
