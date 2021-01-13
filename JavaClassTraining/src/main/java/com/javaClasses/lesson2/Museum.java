package com.javaClasses.lesson2;

public class Museum {
    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(212121);
        artifact1.printInfo();
        Artifact artifact2 = new Artifact(212122, "Aztecs");
        artifact2.printInfo();
        Artifact artifact3 = new Artifact(212123, "Aztecss",12);
        artifact3.printInfo();

        System.out.println();
        Artifact artifact5 = new Artifact(212122, "Aztecs", 0);
        artifact5.setArtNumber(100);
        artifact5.printInfo();
    }
}
