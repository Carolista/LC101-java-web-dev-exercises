package org.launchcode.java.exercises.lsn7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case allItems = new Case();
        ArrayList<Flavor> flavors = allItems.getFlavors();
        ArrayList<Cone> cones = allItems.getCones();
        Comparator comp1 = new FlavorComparator();
        Comparator comp2 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array
        //  alphabetically by the 'name' field.
        // BONUS - change FlavorComparator to sort by Allergens (highest to lowest)

        flavors.sort(comp1); // not yet in reverse order

        // TODO: Use a Comparator class to sort the 'cones' array in
        //  increasing order by the 'cost' field.

        cones.sort(comp2);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear
        //  manner) to verify the sorting.

        for (Flavor flavor: flavors) {
            System.out.println(flavor);
        }

        for (Cone cone: cones) {
            System.out.println(cone);
        }
    }
}