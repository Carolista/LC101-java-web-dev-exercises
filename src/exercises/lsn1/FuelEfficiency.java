package exercises.lsn1;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        float milesDriven = input.nextFloat();
        System.out.println("How many gallons of gas has your vehicle consumed? ");
        float fuelUsed = input.nextFloat();
        float mpg = milesDriven / fuelUsed;
        System.out.println("Your vehicle's gas mileage is " + mpg + " mpg.");
    }
}
