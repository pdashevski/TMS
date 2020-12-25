package com.javaHome.task9.Products0;

import java.util.Comparator;

public class TovarNameComparator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
