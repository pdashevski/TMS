package com.javaHome.task7.spaceport;

public class Cosmodrome {
    private IStart str;

    public Cosmodrome(IStart str) {
        this.str = str;
    }

    public void zapusk() throws InterruptedException {
        if (!str.prelaunchSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            str.engineStart();
            for(int i = 10; i > 0; i--) {
                System.out.println("\n" + i);
                Thread.sleep(1000);
            }
            str.start();
        }
    }
}
