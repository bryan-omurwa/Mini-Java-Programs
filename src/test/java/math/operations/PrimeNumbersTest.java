package math.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Unit test for PrimeNumbers class.
 */
public class PrimeNumbersTest {

    @Test
    public void testZeroInput() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(0);
        assertTrue(result.isEmpty(), "Expected no prime numbers for input 0");
    }

    @Test
    public void testOneInput() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(1);
        assertTrue(result.isEmpty(), "Expected no prime numbers for input 1");
    }

    @Test
    public void testTwoInput() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(2);
        assertEquals(List.of(2), result, "Expected only prime number 2 for input 2");
    }

    @Test
    public void testSmallNumbers() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(10);
        assertEquals(List.of(2, 3, 5, 7), result, "Prime numbers up to 10 should be 2, 3, 5, and 7");
    }

    @Test
    public void testMediumNumbers() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(20);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), result, "Prime numbers up to 20 should be correct");
    }

    @Test
    public void testLargerNumbers() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(50);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47),
                result, "Prime numbers up to 50 should be correct");
    }

    @Test
    public void testPrimeAtUpperLimit() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(17);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17), result, "Expected the upper boundary prime number 17 to be included");
    }

    @Test
    public void testNonPrimeAtUpperLimit() {
        PrimeNumbers finder = new PrimeNumbers();
        List<Integer> result = finder.getPrimeNumbers(18);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17), result, "Expected upper boundary non-prime 18 not to be included");
    }

    @Test
    public void testLargeInputPerformance() {
        PrimeNumbers finder = new PrimeNumbers();
        // Test large input, just checking the method executes in a reasonable time for 1000
        List<Integer> result = finder.getPrimeNumbers(1000);
        assertFalse(result.isEmpty(), "Expected prime numbers for large input 1000");
    }

    @Test
    public void testInvalidInputHandling() {
        PrimeNumbers finder = new PrimeNumbers();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            finder.getPrimeNumbers(-10); // Implementation throws an exception for invalid inputs
        });
        assertEquals("Input must be a non-negative integer", exception.getMessage());
    }
}

