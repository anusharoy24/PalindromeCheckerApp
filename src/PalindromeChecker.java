import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "radar";
        String cleanInput = original.toLowerCase();

        // Key Concept: Data Structure - String
        String reversed = "";

        // Key Concept: Loop (for loop)
        // We start at the last index and move toward the first
        for (int i = cleanInput.length() - 1; i >= 0; i--) {
            // Key Concept: String Concatenation (+)
            // Every iteration creates a new String object in memory
            reversed = reversed + cleanInput.charAt(i);
        }

        // Key Concept: equals() Method
        if (cleanInput.equals(reversed)) {
            System.out.println("The word '" + original + "' is a palindrome.");
        } else {
            System.out.println("The word '" + original + "' is not a palindrome.");
        }
    }
}