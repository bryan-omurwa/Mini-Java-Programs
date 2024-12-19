package array.modification;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the Rotate2DArray class.
 */
public class RotateArrayTests {

    @Test
    public void test3x3Matrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        int[][] result = rotate2DArray.rotateArray(matrix);
        assertArrayEquals(expected, result, "3x3 matrix should be rotated correctly.");
    }

    @Test
    public void test4x4Matrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] expected = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
        int[][] result = rotate2DArray.rotateArray(matrix);
        assertArrayEquals(expected, result, "4x4 matrix should be rotated correctly.");
    }

    @Test
    public void test2x2Matrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {3, 1},
                {4, 2}
        };
        int[][] result = rotate2DArray.rotateArray(matrix);
        assertArrayEquals(expected, result, "2x2 matrix should be rotated correctly.");
    }

    @Test
    public void test1x1Matrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {
                {1}
        };
        int[][] expected = {
                {1}
        };
        int[][] result = rotate2DArray.rotateArray(matrix);
        assertArrayEquals(expected, result, "1x1 matrix should remain the same.");
    }

    @Test
    public void testEmptyMatrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {};
        int[][] expected = {};
        int[][] result = rotate2DArray.rotateArray(matrix);
        assertArrayEquals(expected, result, "Empty matrix should remain empty.");
    }

    @Test
    public void testNonSquareMatrix() {
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Exception exception = assertThrows(IllegalArgumentException.class, () -> rotate2DArray.rotateArray(matrix));
        assertEquals("Matrix must be square", exception.getMessage(), "Non-square matrix should throw an exception.");
    }

    @Test
    public void testNullMatrix() {
        // Arrange
        RotateArray rotate2DArray = new RotateArray();
        int[][] matrix = null;

        // Act and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> rotate2DArray.rotateArray(null));
        assertEquals("Matrix cannot be null", exception.getMessage(), "Null matrix should throw an exception.");
    }
}
