package org.launchcode.java.exercises.lsn2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeString {
    public static void main(String[] args) {

        // Initialize ArrayList
        ArrayList<String> words = new ArrayList<>();

        // BONUS: Turns out I had already done this with different text
        String excerpt = "Inner silence is for our race difficult " +
                "achievement. There is a chattering part of the mind " +
                "which continues, until it is corrected, to chatter on " +
                "even in the holiest places. Thus, while one part of " +
                "Ransom remained, as it were, prostrated in a hush of " +
                "fear and love that resembled a kind of death, something " +
                "else inside of him, wholly unaffected by reverence, " +
                "continued to pour queries and objections into his brain.";

        // Remove punctuation, split on spaces, and add to 'words'
        for (String word : excerpt.replaceAll("\\p{Punct}","").split(" ")) {
            words.add(word);
        }
        // Ask user for number of letters
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many letters long should the words be? ");
        int num = input.nextInt();

        // Find and print list of words that fit criteria
        System.out.println("\nThe following words have exactly " + num + " letters:\n");
        int count = 0; // Keep track in case there are no words of that length
        String prefix;
        for (String word: words) {
            if (word.length() == num) {
                count += 1;
                if (count < 10) {
                    prefix = "    ";
                } else {
                    prefix = "   ";
                }
                System.out.println(prefix + count + ". " + word);
            }
        }
        // If no words of the requested length exist, print this instead
        if (count == 0) {
            System.out.println("     ...actually, there are no words " + num + " letters long!");
        }
    }
}
