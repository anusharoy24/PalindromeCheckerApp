import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Key Concept: String Literal (Hardcoded value)
        String original = "madam";

        // Normalizing the string for accurate comparison
        String cleanInput = original.replaceAll("\\s+", "").toLowerCase();

        // Key Concept: String Manipulation (Reversing)
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        // Key Concept: Conditional Statement (if-else)
        if (cleanInput.equals(reversed)) {
            System.out.println("Result: '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is not a palindrome.");
        }

        // Flow: Program exits here
    }
}