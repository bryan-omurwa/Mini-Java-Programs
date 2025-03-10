package math.operations;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    /*
    public List<Integer> getPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        // If input is a negative number, throw an exception
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // If input number is 0 or 1, return an empty array
        if (n < 2) {
            return primeNumbers;
        }
        primeNumbers.add(2);

        // Loop through the number to find the prime numbers
        for (int i = 2; i <= n; i++) {
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

     */ // Case one

    public List<Integer> getPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();

        // If input is a negative number, throw an exception
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        // If input number is 0 or 1, return an empty array
        if (n < 2) {
            return primeNumbers;
        }

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int k = 2; k <= n; k++) {
            if (isPrime[k]) primeNumbers.add(k);
        }

        return primeNumbers;

    }
}