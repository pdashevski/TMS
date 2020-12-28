package com.javaHome.task9.products1;

import java.util.*;

public class Shop {
    private List<Tovar> tovars = new ArrayList<>();

    public Shop(List<Tovar> tovars) {
        this.tovars = tovars;
    }

    public Shop() {

    }

    public List<Tovar> getTovars() {
        return tovars;
    }

    public void setTovars(List<Tovar> tovars) {
        this.tovars = tovars;
    }

    public void addTovarsToList(Tovar tovar) {
        int x = tovar.getId();
        for (Iterator<Tovar> iterator = tovars.iterator(); iterator.hasNext(); ) {
            Tovar next =  iterator.next();
            if(next.getId() == x) {
                iterator.remove();
            } else {
                continue;
            }
        }
        tovars.add(tovar);

    }

    public List<Tovar> getAllTovars() {
        return getTovars();
    }

    public void removeTovarsFromList(int id) {
        tovars.removeIf(next -> next.getId() == id);
    }

    public void editTovar(Tovar tovar) {
        for (Tovar tvr : tovars) {
            if (tovar.hashCode() != tvr.hashCode()) {
                tvr.setName(tovar.getName());
                //tvr.setPrice(tovar.getPrice());
                break;
            }
        }
    }

}
