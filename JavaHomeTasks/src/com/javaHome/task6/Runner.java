package com.javaHome.task6;

public class Runner {
    public static void main(String[] args) {
        Passenger p = new Passenger(190,250,2,"Audi",4,10,"sedan",4);
        System.out.println(p.inf());
        p.distanceAndFuel(2.5);

        Freight f = new Freight(500,110,4,"MAZ",12,50,2);
        System.out.println("\n" + f.inf());
        f.capacity(3);
        f.capacity(2);

        CivilAir a = new CivilAir(1500,600, 10,"Boing",10,3,110,true);
        System.out.println("\n" + a.inf());
        a.capacity(111);
        a.capacity(109);

        MilitaryAir m = new MilitaryAir(1300,450,6,"SU",3,1,true,3);
        System.out.println("\n" + m.inf());
        m.piu();
        m.piu();
        m.piu();
        m.piu();
        m.catapult();
    }
}
