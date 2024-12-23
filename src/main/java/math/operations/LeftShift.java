package math.operations;

public class LeftShift {
    public int shiftToLeft(int x, int y) {
        // Base case: if no shifts remain, return the number
        if (y == 0) {
            return x;
        }

        // Recursive step: multiply the number by 2 and decrement shifts
        return 2 * ((y > 1) ? shiftToLeft(x, y - 1) : x);   // Alternative: shiftToLeft(number * 2, shifts - 1)
    }
}
