package exercises.lsn2;

public class SumEvenNums {
    public static int sumEvens(int[] numArray) {
        int lenArray = numArray.length;
        int total = 0;
        for (int i = 0; i < lenArray; i++) {
            total += numArray[i];
        }
        return total;
    }
}
