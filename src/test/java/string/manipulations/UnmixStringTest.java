package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnmixStringTest {

    UnmixString StringUnmixer = new UnmixString();

    @Test
    public void testRegularEvenLengthString() {
        assertEquals("214365", StringUnmixer.unmixString("123456"));
    }

    @Test
    public void testSimpleOddLengthString() {
        assertEquals("badcfeg", StringUnmixer.unmixString("abcdefg"));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", StringUnmixer.unmixString("a"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", StringUnmixer.unmixString(""));
    }

    @Test
    public void testSwappedTwoCharacters() {
        assertEquals("12", StringUnmixer.unmixString("21"));
    }

    @Test
    public void testRepeatingCharacters() {
        assertEquals("aacc", StringUnmixer.unmixString("aacc"));
    }

    @Test
    public void testShortSwappedNumbers() {
        assertEquals("98", StringUnmixer.unmixString("89"));
    }
}
