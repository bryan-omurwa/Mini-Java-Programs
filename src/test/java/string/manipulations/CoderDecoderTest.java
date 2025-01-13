package string.manipulations;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoderDecoderTest {

    @Test
    public void testEncodeAlphabetOnly() {

        CoderDecoder encodeMessage = new CoderDecoder(); // Create object

        String message = "hello";
        String expectedEncodedMessage = "svool";
        String actualEncodedMessage = encodeMessage.encode(message);
        assertEquals(expectedEncodedMessage, actualEncodedMessage);
    }

    @Test
    public void testDecodeAlphabetOnly() {

        CoderDecoder decodeMessage = new CoderDecoder(); // Create object

        String encodedMessage = "svool";
        String expectedDecodedMessage = "hello";
        String actualDecodedMessage = decodeMessage.decode(encodedMessage);
        assertEquals(expectedDecodedMessage, actualDecodedMessage);
    }

    @Test
    public void testEncodeWithUpperCaseAlphabet() {

        CoderDecoder encodeMessage = new CoderDecoder(); // Create object

        String message = "Hello";
        String expectedEncodedMessage = "svool"; // Converted to lowercase for encoding
        String actualEncodedMessage = encodeMessage.encode(message);
        assertEquals(expectedEncodedMessage, actualEncodedMessage);
    }

    @Test
    public void testDecodeWithUpperCaseAlphabetEncoded() {

        CoderDecoder decodeMessage = new CoderDecoder(); // Create object

        String encodedMessage = "SVOOL"; // Assuming encoded message is case insensitive
        String expectedDecodedMessage = "hello";
        String actualDecodedMessage = decodeMessage.decode(encodedMessage);
        assertEquals(expectedDecodedMessage, actualDecodedMessage);
    }

    @Test
    public void testEncodeFullAlphabet() {

        CoderDecoder encodeMessage = new CoderDecoder(); // Create object

        String message = "abcdefghijklmnopqrstuvwxyz";
        String expectedEncodedMessage = "zyxwvutsrqponmlkjihgfedcba";
        String actualEncodedMessage = encodeMessage.encode(message);
        assertEquals(expectedEncodedMessage, actualEncodedMessage);
    }

    @Test
    public void testDecodeFullAlphabet() {

        CoderDecoder decodeMessage = new CoderDecoder(); // Create object

        String encodedMessage = "zyxwvutsrqponmlkjihgfedcba";
        String expectedDecodedMessage = "abcdefghijklmnopqrstuvwxyz";
        String actualDecodedMessage = decodeMessage.decode(encodedMessage);
        assertEquals(expectedDecodedMessage, actualDecodedMessage);
    }
}


