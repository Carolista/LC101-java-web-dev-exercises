package exercises.lsn1;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String excerpt = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a search term: ");
        String term = input.nextLine(); // allow phrase instead of limiting with .next()
        System.out.println(excerpt.toLowerCase().contains(term.toLowerCase()));
    }
}
