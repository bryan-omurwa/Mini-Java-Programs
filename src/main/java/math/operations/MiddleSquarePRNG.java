package math.operations;

public class MiddleSquarePRNG {

    private int seed;

    // Method to set the initial seed
    public void seed(int seed) {
        this.seed = seed;
    }

    // Method to generate the next pseudo-random number
    public int next() {
        if (seed == 0) return 0;  // If seed becomes zero, it will stay zero

        // Square the seed
        long squared = (long) seed * seed & 0xFFFFFFFFL;

        // Extract the middle digits (assuming 4-digit seed for simplicity)
        String squaredStr = String.format("%08d", squared); // Ensure at least 8 digits
        int middle = Integer.parseInt(squaredStr.substring(2, 6));

        // Update the seed
        seed = middle;

        return middle;
    }
}
