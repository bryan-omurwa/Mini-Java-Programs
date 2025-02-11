package math.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleSquarePRNGTest {

    private MiddleSquarePRNG rand;

    @BeforeEach
    void setUp() {
        rand = new MiddleSquarePRNG();
    }

    @Test
    void testSequence() {
        rand.seed(6492);
        assertEquals(643, rand.next());
        assertEquals(6, rand.next());
        assertEquals(0, rand.next());
        assertEquals(0, rand.next());
    }

    @Test
    void testZeroSeed() {
        rand.seed(0);
        assertEquals(0, rand.next());
        assertEquals(0, rand.next());
    }

    @Test
    void testRepeatedNumbers() {
        rand.seed(1111); // Some numbers might loop in the middle square method
        int first = rand.next();
        int second = rand.next();
        assertEquals(second, rand.next()); // Ensuring stable looping behavior
    }

    @Test
    void testLargeSeed() {
        rand.seed(9999);
        assertEquals(998, rand.next()); // Expected based on the squaring method
    }
}
