package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeWordTest {

    PalindromeWord palindromeChecker = new PalindromeWord();

    @Test
    void testPalindromeWord() {
        assertTrue(palindromeChecker.isPalindrome("racecar")); // A palindrome
        assertTrue(palindromeChecker.isPalindrome("madam"));   // A palindrome
        assertTrue(palindromeChecker.isPalindrome("radar"));   // A palindrome
    }

    @Test
    void testNonPalindromeWord() {
        assertFalse(palindromeChecker.isPalindrome("hello"));  // Not a palindrome
        assertFalse(palindromeChecker.isPalindrome("world"));  // Not a palindrome
        assertFalse(palindromeChecker.isPalindrome("java"));   // Not a palindrome
    }

    @Test
    void testEmptyAndNull() {
        assertFalse(palindromeChecker.isPalindrome(""));       // Empty string
        assertFalse(palindromeChecker.isPalindrome(null));     // Null input
    }

    @Test
    void testCaseSensitivity() {
        assertTrue(palindromeChecker.isPalindrome("RaceCar")); // Case-insensitive test
        assertTrue(palindromeChecker.isPalindrome("MadAm"));   // Case-insensitive test
    }
}

