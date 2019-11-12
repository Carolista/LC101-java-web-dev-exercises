package org.launchcode.java.exercises.lsn2;

import java.util.ArrayList;

public class SumEvenNums {
    public static int sumEvens(ArrayList<Integer> numList) {
        int total = 0;
        for (int num : numList) {
            if (num % 2 == 0) {
                total += num;
                System.out.println(num + " was added and the total is now " + total + ".");
            }
        }
        return total;
    }
}
