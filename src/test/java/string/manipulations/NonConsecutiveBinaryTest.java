package string.manipulations;


import org.junit.Assert;
import org.junit.Test;

public class NonConsecutiveBinaryTest {

    @Test
    public void testGenerateNonconsecutiveWithNEquals0() {

        NonConsecutiveBinary binaryNumber = new NonConsecutiveBinary(); // Create an object

        String expected = "";
        String actual = binaryNumber.generateNonconsecutive(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateNonconsecutiveWithNEquals1() {

        NonConsecutiveBinary binaryNumber = new NonConsecutiveBinary(); // Create an object

        String expected = "0 1";
        String actual = binaryNumber.generateNonconsecutive(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateNonconsecutiveWithNEquals2() {

        NonConsecutiveBinary binaryNumber = new NonConsecutiveBinary(); // Create an object

        String expected = "00 01 10";
        String actual = binaryNumber.generateNonconsecutive(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateNonconsecutiveWithNEquals3() {

        NonConsecutiveBinary binaryNumber = new NonConsecutiveBinary(); // Create an object

        String expected = "000 001 010 100 101";
        String actual = binaryNumber.generateNonconsecutive(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateNonconsecutiveWithNEquals4() {

        NonConsecutiveBinary binaryNumber = new NonConsecutiveBinary(); // Create an object

        String expected = "0000 0001 0010 0100 0101 1000 1001 1010";
        String actual = binaryNumber.generateNonconsecutive(4);
        Assert.assertEquals(expected, actual);
    }
}

