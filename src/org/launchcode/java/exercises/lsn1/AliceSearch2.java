package org.launchcode.java.exercises.lsn1;

import java.util.Scanner;

public class AliceSearch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String excerpt = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String excerptLC = excerpt.toLowerCase();
        System.out.println("Enter a search term: ");
        String term = input.nextLine().toLowerCase(); // allow phrase instead of limiting with .next()
        if (excerptLC.contains(term)) {
            int loc = excerptLC.indexOf(term);
            int termLength = term.length();
            String removed = excerpt.substring(0, (loc - 1)) + excerpt.substring(loc + termLength);
            System.out.println("The term '" + term + "' has " + "a length of " + termLength + " and " +
                    "is located at index " + loc  + ".");
            System.out.println("CONFIRMATION: " + removed);
        } else {
            System.out.println("Search term not found.");
        }
    }
}
