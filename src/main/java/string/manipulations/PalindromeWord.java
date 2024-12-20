package string.manipulations;

public class PalindromeWord {

    // A function that determines whether a word is a palindrome or not.
    public boolean isPalindrome(String wrd) {
        if (wrd == null || wrd.isEmpty()) return false; // Handle null or empty input

        int length = wrd.length();  // Length of the word
        wrd = wrd.toLowerCase();    // Convert to lowercase to handle case insensitivity

        // Iterate through the word
        for (int i = 0; i < length; i++) {

            // Checks if opposite characters match
            if (wrd.charAt(i) != wrd.charAt(length - (1 + i))) return false;
        }
        return true;    // All characters matched
    }
}
