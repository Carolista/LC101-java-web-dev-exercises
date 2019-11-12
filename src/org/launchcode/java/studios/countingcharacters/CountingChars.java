package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {

        // Have user input string
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String excerpt = input.nextLine();

        // Create array of lowercase, alphanumeric characters from string
        char[] charsInExcerpt = excerpt.replaceAll("[^a-zA-Z0-9]+","").toLowerCase().toCharArray();
        HashMap<Character, Integer> breakdown = new HashMap<>();

        // Add characters one by one to HashMap
        for (char singleChar : charsInExcerpt) {
            if (breakdown.containsKey(singleChar)) {
                breakdown.put(singleChar, breakdown.get(singleChar) + 1);
            } else {
                breakdown.put(singleChar, 1);
            }
        }

        // Print out all keys and values, one set per line
        for (Map.Entry<Character, Integer> charCount : breakdown.entrySet()) {
            System.out.println(charCount.getKey() + ": " + charCount.getValue());
        }
    }
}
