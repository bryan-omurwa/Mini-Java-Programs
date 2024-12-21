package math.operations;

public class CalculatePerimeter {

    // Function to calculate perimeter from 2D coordinates
    public double calculatePerimeter(int[][] coordinates) {
        if (coordinates == null || coordinates.length < 2) {
            throw new IllegalArgumentException("At least two coordinates are required to form a shape.");
        }

        double perimeter = 0.0;

        // Iterate through the points and calculate distances
        for (int i = 0; i < coordinates.length; i++) {
            int[] current_coordinate = coordinates[i];
            int[] next_coordinate = coordinates[i == coordinates.length - 1 ? 0 : i + 1];   // Wrap around to the first point

            // Calculate distance between current and next point. AB = √((x2 – x1)² + (y2 – y1)²).
            double distance = Math.sqrt(Math.pow(next_coordinate[0] - current_coordinate[0], 2) + Math.pow(next_coordinate[1] - current_coordinate[1], 2));

            perimeter += distance;  // Add to the perimeter
        }

        return perimeter;
    }
}
