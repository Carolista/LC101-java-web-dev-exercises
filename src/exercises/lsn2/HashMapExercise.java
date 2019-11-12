package exercises.lsn2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newID;

        System.out.println("\nEnter your students (or ENTER to finish):\n");

        // Get student information
        do {
            System.out.print("Student ID: ");
            newID = input.nextLine();

            if (!newID.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newID, newName);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
