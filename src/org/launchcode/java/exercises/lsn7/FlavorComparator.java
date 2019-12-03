package org.launchcode.java.exercises.lsn7;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        int num1 = o1.getAllergens().size();
        int num2 = o2.getAllergens().size();
        return num1 - num2;
    }

}
