package basic.math;

import java.util.ArrayList;

public class PrimeNumbers {
    public ArrayList<Integer> getPrimeNumbers(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        // If input is a negative number, throw an exception
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // If input number is 0 or 1, return an empty array
        if (n == 1 || n == 0) {
            return primeNumbers;
        }

        // Loop through the number to find the prime numbers
        for (int i = 1; i <= n; i++) {
            if (i == 2) {
                primeNumbers.add(i);
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    primeNumbers.add(i);
                }
            }
        }
        return primeNumbers;
    }
}