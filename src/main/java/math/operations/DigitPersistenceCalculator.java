package math.operations;

public class DigitPersistenceCalculator {

    public int additivePersistence(int number) {
        int persistence = 0;

        while (number >= 10) {
            int sum = 0;

            // Sum the digits in a single loop
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            number = sum; // Update the number to the sum of its digits
            persistence++; // Increment persistence count
        }

        return persistence;
    }

    public int multiplicativePersistence(int number) {
        int persistence = 0;

        while (number >= 10) {
            int multiply = 1;

            // Sum the digits in a single loop
            while (number > 0) {
                multiply *= number % 10;
                number /= 10;
            }

            number = multiply; // Update the number to the multiplication of its digits
            persistence++; // Increment persistence count
        }

        return persistence;
    }
}
