package org.launchcode.java.exercises.lsn2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        // Initialize HashMap
        HashMap<String, String> students = new HashMap<>();

        // Get keys (ID numbers) and values (names) from user

        Scanner input = new Scanner(System.in);
        String newID; // allow for non-numeric characters, ex: B259-20376

            // Note: I moved the instruction inside the loop

        do {
            System.out.println("\nEnter new student (or press enter to finish): \n");
            System.out.print("Student ID: ");
            newID = input.nextLine();
            if ( ! newID.equals("") ) {
                System.out.print("Full name: ");
                String newName = input.nextLine(); // use .nextLine() to get full name
                students.put(newID, newName);
                System.out.println("Success! Student added to roster."); // debug

                // This is where it gets stuck unless I press enter again... WHY?
                input.nextLine(); // read in new line before looping back

                System.out.println("This prints only after enter is pressed again"); // debug
            }
        } while ( ! newID.equals("") );

        // Print list of students
        System.out.println("\nClass roster: ");
        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
