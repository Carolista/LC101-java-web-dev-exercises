package org.launchcode.java.exercises.lsn7;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        double delta = o1.getCost() - o2.getCost();
        if (delta > 0) {
            return 1;
        } else if (delta == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}
