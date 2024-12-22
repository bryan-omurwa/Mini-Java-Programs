package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnmixStringTest {

    @Test
    public void testRegularEvenLengthString() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("214365", StringUnmixer.unmixString("123456"));
    }

    @Test
    public void testSimpleOddLengthString() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("badcfeg", StringUnmixer.unmixString("abcdefg"));
    }

    @Test
    public void testSingleCharacter() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("a", StringUnmixer.unmixString("a"));
    }

    @Test
    public void testEmptyString() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("", StringUnmixer.unmixString(""));
    }

    @Test
    public void testSwappedTwoCharacters() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("12", StringUnmixer.unmixString("21"));
    }

    @Test
    public void testRepeatingCharacters() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("aacc", StringUnmixer.unmixString("aacc"));
    }

    @Test
    public void testShortSwappedNumbers() {
        UnmixString StringUnmixer = new UnmixString();
        assertEquals("98", StringUnmixer.unmixString("89"));
    }
}
