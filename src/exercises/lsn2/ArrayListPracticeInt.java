package exercises.lsn2;

import java.util.ArrayList;

public class ArrayListPracticeInt {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            int square = i * i;
            numList.add(square);
            System.out.println("Added " + square + " to the array list.");
        }
        int total = SumEvenNums.sumEvens(numList);
        System.out.println("The total of all numbers in the list is " + total + ".");
    }
}
