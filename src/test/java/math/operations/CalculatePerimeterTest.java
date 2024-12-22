package math.operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatePerimeterTest {

    @Test
    void testTrianglePerimeter() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] triangle = {
                {0, 0},
                {0, 3},
                {4, 0}
        };

        double expectedPerimeter = 12.0; // 3 + 5 + 4
        assertEquals(expectedPerimeter, calculateTests.calculatePerimeter(triangle), 0.001);
    }

    @Test
    void testRectanglePerimeter() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] rectangle = {
                {0, 0},
                {0, 2},
                {3, 2},
                {3, 0}
        };

        double expectedPerimeter = 10.0; // 2 + 3 + 2 + 3
        assertEquals(expectedPerimeter, calculateTests.calculatePerimeter(rectangle), 0.001);
    }

    @Test
    void testIrregularShapePerimeter() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] irregularShape = {
                {1, 1},
                {4, 1},
                {4, 5},
                {2, 7},
                {1, 5}
        };

        double expectedPerimeter = 16.064; // Pre-calculated value
        assertEquals(expectedPerimeter, calculateTests.calculatePerimeter(irregularShape), 0.001);
    }

    @Test
    void testSinglePoint() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] singlePoint = {
                {1, 1}
        };

        assertThrows(IllegalArgumentException.class, () -> calculateTests.calculatePerimeter(singlePoint));
    }

    @Test
    void testEmptyArray() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] emptyArray = {};

        assertThrows(IllegalArgumentException.class, () -> calculateTests.calculatePerimeter(emptyArray));
    }

    @Test
    void testNegativeCoordinates() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] shape = {
                {-2, -3},
                {-2, 1},
                {3, 1},
                {3, -3}
        };

        double expectedPerimeter = 18.0; // 4 + 5 + 4 + 5
        assertEquals(expectedPerimeter, calculateTests.calculatePerimeter(shape), 0.001);
    }

    @Test
    void testLargeCoordinates() {
        CalculatePerimeter calculateTests = new CalculatePerimeter();
        int[][] largeShape = {
                {1000, 1000},
                {1000, 2000},
                {2000, 2000},
                {2000, 1000}
        };

        double expectedPerimeter = 4000.0; // 1000 + 1000 + 1000 + 1000
        assertEquals(expectedPerimeter, calculateTests.calculatePerimeter(largeShape), 0.001);
    }
}
