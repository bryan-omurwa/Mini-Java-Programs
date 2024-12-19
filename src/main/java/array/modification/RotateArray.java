package array.modification;

public class RotateArray {

    // Function to rotate a 2D array in a 90° clockwise direction
    public int[][] rotateArray (int[][] arr) {

        // Validate input matrix
        if (arr == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }

        // Input the rotated array
        int[][] rotated_array = new int[arr.length][arr.length];
        // Traverse each cycle
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // Check if the matrix is square
                if (arr.length != arr[i].length) {
                    throw new IllegalArgumentException("Matrix must be square");
                }

                // Swap elements in each cycle in a
                // clockwise direction
                rotated_array[j][arr.length - 1 - i] = arr[i][j];
            }
        }

        // Return the rotated array
        return rotated_array;
    }
}
