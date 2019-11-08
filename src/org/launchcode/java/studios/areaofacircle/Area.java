package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double r = input.nextDouble(); // get user input
        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
