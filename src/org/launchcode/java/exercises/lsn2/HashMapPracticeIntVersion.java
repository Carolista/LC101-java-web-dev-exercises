package org.launchcode.java.exercises.lsn2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPracticeIntVersion {
    public static void main(String[] args) {

        // Initialize HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Get keys (ID numbers) and values (names) from user
        Scanner input = new Scanner(System.in);
        int newID = 0; // will be read in as String first, then converted to int

        while (true) {
            System.out.println("\nEnter new student (or press enter to finish): \n");
            System.out.print("Student ID: ");
            String newLine = input.nextLine();

            if (newLine.length() > 0) {
                newID = Integer.parseInt(newLine);
            } else {
                break;
            }

            System.out.print("Full name: ");
            String newName = input.nextLine(); // use .nextLine() to get full name
            students.put(newID, newName);
            System.out.println("Success! Student added to roster."); // debug

        }

        // Print list of students
        System.out.println("\nClass roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
