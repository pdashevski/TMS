package com.javaHome.task7.spaceport;

public class Cosmodrome {
    public void zapusk(IStart iStart) throws InterruptedException {
        if (!iStart.prelaunchSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.engineStart();
            for (int i = 10; i > 0; i--) {
                System.out.println("\n" + i);
                Thread.sleep(1000);
            }
            iStart.start();
        }
    }
}
