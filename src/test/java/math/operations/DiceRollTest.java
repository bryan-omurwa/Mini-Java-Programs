package math.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiceRollTest {

    @Test
    public void testDiceRoll() {

        DiceRoll TestDiceRoll = new DiceRoll(); // Create an object

        // Basic test cases
        assertEquals(4, TestDiceRoll.diceRoll(2, 5), "Failed test for (2,5)");
        assertEquals(3, TestDiceRoll.diceRoll(3, 4), "Failed test for (3,4)");
        assertEquals(1, TestDiceRoll.diceRoll(1, 3), "Failed test for (1,3)");
        assertEquals(0, TestDiceRoll.diceRoll(1, 7), "Failed test for (1,7)");

        // Edge cases
        assertEquals(1, TestDiceRoll.diceRoll(1, 1), "Failed test for (1,1)");
        assertEquals(0, TestDiceRoll.diceRoll(3, 20), "Failed test for (3,20)"); // Impossible sum
        assertEquals(27, TestDiceRoll.diceRoll(3, 10), "Failed test for (3,10)");
    }
}
