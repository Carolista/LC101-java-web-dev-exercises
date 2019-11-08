package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;

        // THIS IS NOT WORKING YET
        System.out.println("Enter a radius: ");
        while (!input.hasNextDouble() || input.nextDouble() < 1) {
            System.out.println("Oops! Enter a number.");
            input.next();
        }
        r = input.nextDouble();

        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
