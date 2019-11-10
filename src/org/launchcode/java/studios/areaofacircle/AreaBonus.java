package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0;

        // THIS IS NOT WORKING YET
        System.out.print("Enter a radius: ");

        do {
            if ( ! input.hasNextDouble() || input.nextDouble() < 1) {
                System.out.print("Oops! Enter a number greater than zero: ");
                input.nextLine();
            } else {
                r = input.nextDouble();
                System.out.println("Radius has been set to " + r + ".");
            }
        } while (r < 1);

        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
