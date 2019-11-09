package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0;

        // THIS IS NOT WORKING YET
        System.out.println("Enter a radius: ");
        do {
            if (input.hasNextDouble() && (input.nextDouble() > 0)) {
                r = input.nextDouble();
                break;
            }
            System.out.println("Oops! Enter a number greater than zero.");
            input.next();
        } while (r == 0);

        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
