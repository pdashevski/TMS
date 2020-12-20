package com.javaHome.task7.spaceport;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.zapusk(new Shuttle());

        Cosmodrome cosmodrome1 = new Cosmodrome();
        cosmodrome1.zapusk(new Proton());
    }
}
