package math.operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternCheckerTest {

    @Test
    public void testPrimeNumbers() {
        assertEquals(true, PatternChecker.method(2));
        assertEquals(true, PatternChecker.method(3));
        assertEquals(true, PatternChecker.method(5));
        assertEquals(true, PatternChecker.method(11));
        assertEquals(true, PatternChecker.method(13));
    }

    @Test
    public void testCompositeNumbers() {
        assertEquals(false, PatternChecker.method(1));  // 1 is not prime
        assertEquals(false, PatternChecker.method(4));  // Composite
        assertEquals(false, PatternChecker.method(6));  // Composite
        assertEquals(false, PatternChecker.method(9));  // Composite
        assertEquals(false, PatternChecker.method(10)); // Composite
    }

    @Test
    public void testMultiplesOfSeven() {
        assertNull(PatternChecker.method(7));   // Multiple of 7
        assertNull(PatternChecker.method(14));  // Multiple of 7
        assertNull(PatternChecker.method(21));  // Multiple of 7
        assertNull(PatternChecker.method(28));  // Multiple of 7
    }

    @Test
    public void testEdgeCases() {
        assertEquals(false, PatternChecker.method(0));  // 0 is not prime
        assertEquals(false, PatternChecker.method(-1)); // Negative numbers are not prime
        assertEquals(false, PatternChecker.method(-7)); // Negative multiples of 7
    }
}
