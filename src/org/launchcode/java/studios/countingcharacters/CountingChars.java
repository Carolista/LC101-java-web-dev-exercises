package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
        String excerpt = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInExcerpt = excerpt.toCharArray();
        HashMap<Character, Integer> breakdown = new HashMap<>();

        // add characters one by one to HashMap
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
