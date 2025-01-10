package math.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DigitPersistenceCalculatorTest {

    @Test
    public void testAdditivePersistence() {
        DigitPersistenceCalculator calculator = new DigitPersistenceCalculator();

        // Test cases for additive persistence
        assertEquals(3, calculator.additivePersistence(1679583)); // Example: 1+6+7+9+5+8+3 = 39, 3+9 = 12, 1+2 = 3
        assertEquals(0, calculator.additivePersistence(0));       // Edge case: 0
        assertEquals(2, calculator.additivePersistence(19));      // 1+9 = 10, 1+0 = 1
        assertEquals(2, calculator.additivePersistence(12345));   // 1+2+3+4+5 = 15, 1+5 = 6
    }

    @Test
    public void testMultiplicativePersistence() {
        DigitPersistenceCalculator calculator = new DigitPersistenceCalculator();

        // Test cases for multiplicative persistence
        assertEquals(3, calculator.multiplicativePersistence(39));   // Example: 3*9 = 27, 2*7 = 14, 1*4 = 4
        assertEquals(0, calculator.multiplicativePersistence(0));    // Edge case: 0
        assertEquals(1, calculator.multiplicativePersistence(10));   // 1*0 = 0
        assertEquals(4, calculator.multiplicativePersistence(77));   // 7*7 = 49, 4*9 = 36, 3*6 = 18, 1*8 = 8
    }
}
