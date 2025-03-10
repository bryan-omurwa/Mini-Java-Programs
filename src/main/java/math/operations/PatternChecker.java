package math.operations;

public class PatternChecker {
    public static Boolean method(int n) {
        if (n < 2) return false; // 1 is not prime

        if (n % 7 == 0) return null; // Return null for multiples of 7

        return isPrime(n); // Prime numbers return true
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        // We only check up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
