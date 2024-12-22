package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeWordTest {

    @Test
    void testPalindromeWord() {
        PalindromeWord palindromeChecker = new PalindromeWord();

        assertTrue(palindromeChecker.isPalindrome("racecar")); // A palindrome
        assertTrue(palindromeChecker.isPalindrome("madam"));   // A palindrome
        assertTrue(palindromeChecker.isPalindrome("radar"));   // A palindrome
    }

    @Test
    void testNonPalindromeWord() {
        PalindromeWord palindromeChecker = new PalindromeWord();

        assertFalse(palindromeChecker.isPalindrome("hello"));  // Not a palindrome
        assertFalse(palindromeChecker.isPalindrome("world"));  // Not a palindrome
        assertFalse(palindromeChecker.isPalindrome("java"));   // Not a palindrome
    }

    @Test
    void testEmptyAndNull() {
        PalindromeWord palindromeChecker = new PalindromeWord();

        assertFalse(palindromeChecker.isPalindrome(""));       // Empty string
        assertFalse(palindromeChecker.isPalindrome(null));     // Null input
    }

    @Test
    void testCaseSensitivity() {
        PalindromeWord palindromeChecker = new PalindromeWord();

        assertTrue(palindromeChecker.isPalindrome("RaceCar")); // Case-insensitive test
        assertTrue(palindromeChecker.isPalindrome("MadAm"));   // Case-insensitive test
    }
}

