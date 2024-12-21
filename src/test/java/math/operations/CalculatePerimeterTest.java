package math.operations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatePerimeterTest {

    CalculatePerimeter calculateTests = new CalculatePerimeter();

    @Test
    public void test1() {
        int[][] arr = new int[3][2];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[2][0] = 0;
        arr[2][1] = 1;
        assertEquals(3.42, calculateTests.calculatePerimeter(arr), 0.1);
    }

}