package com.javaHome.task7.spaceport;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cosmodrome = new Cosmodrome(new Shuttle());
        cosmodrome.zapusk();

        Cosmodrome cosmodrome1 = new Cosmodrome(new Proton());
        cosmodrome1.zapusk();
    }
}
