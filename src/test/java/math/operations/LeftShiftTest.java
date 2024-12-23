package math.operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftShiftTest {

    @Test
    void testBasicShifts() {
        LeftShift leftShiftMimic = new LeftShift();
        assertEquals(20, leftShiftMimic.shiftToLeft(5, 2)); // 5 << 2 = 20
        assertEquals(80, leftShiftMimic.shiftToLeft(10, 3)); // 10 << 3 = 80
    }

    @Test
    void testNoShift() {
        LeftShift leftShiftMimic = new LeftShift();
        assertEquals(7, leftShiftMimic.shiftToLeft(7, 0)); // 7 << 0 = 7
        assertEquals(123, leftShiftMimic.shiftToLeft(123, 0)); // 123 << 0 = 123
    }

    @Test
    void testSingleShift() {
        LeftShift leftShiftMimic = new LeftShift();
        assertEquals(10, leftShiftMimic.shiftToLeft(5, 1)); // 5 << 1 = 10
        assertEquals(246, leftShiftMimic.shiftToLeft(123, 1)); // 123 << 1 = 246
    }

    @Test
    void testLargeShifts() {
        LeftShift leftShiftMimic = new LeftShift();
        assertEquals(1024, leftShiftMimic.shiftToLeft(1, 10)); // 1 << 10 = 1024
        assertEquals(33554432, leftShiftMimic.shiftToLeft(2, 24)); // 2 << 24 = 33554432
    }

    @Test
    void testEdgeCases() {
        LeftShift leftShiftMimic = new LeftShift();
        assertEquals(0, leftShiftMimic.shiftToLeft(0, 10)); // 0 << 10 = 0
        assertEquals(1, leftShiftMimic.shiftToLeft(1, 0)); // 1 << 0 = 1
    }
}

