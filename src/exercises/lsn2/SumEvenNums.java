package exercises.lsn2;

import java.util.ArrayList;

public class SumEvenNums {
    public static int sumEvens(ArrayList<Integer> numList) {
        int lenArray = numList.size();
        int total = 0;
        for (int num : numList) {
            total += num;
        }
        return total;
    }
}
