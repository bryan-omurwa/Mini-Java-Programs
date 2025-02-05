package string.manipulations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SentenceSearcherTest {

    @Test
    void testValidIndex() {

        SentenceSearcher sentenceAtIndex = new SentenceSearcher(); // Create an object

        final String txt = "I love Tesh. My world evolves in hers. My love for life.";

        assertEquals("I love Tesh.", sentenceAtIndex.sentenceSearcher(txt, 0));
        assertEquals("I love Tesh.", sentenceAtIndex.sentenceSearcher(txt, 2));
        assertEquals("My world evolves in hers.", sentenceAtIndex.sentenceSearcher(txt, 4));
        assertEquals("My world evolves in hers.", sentenceAtIndex.sentenceSearcher(txt, 6));
        assertEquals("My love for life.", sentenceAtIndex.sentenceSearcher(txt, 10));
    }

    @Test
    void testOutOfBoundsIndex() {

        SentenceSearcher sentenceAtIndex = new SentenceSearcher(); // Create an object

        final String txt = "I love Tesh. My world evolves in hers. My love for life.";

        assertEquals("My love for life.", sentenceAtIndex.sentenceSearcher(txt, -1)); // Negative index
        assertEquals("", sentenceAtIndex.sentenceSearcher(txt, 12)); // Index exceeds word count
    }

    @Test
    void testSingleSentence() {

        SentenceSearcher sentenceAtIndex = new SentenceSearcher(); // Create an object

        final String txt = "This is a simple test.";

        assertEquals("This is a simple test.", sentenceAtIndex.sentenceSearcher(txt, 3));
        assertEquals("", sentenceAtIndex.sentenceSearcher(txt, 5)); // Out of range
    }

    @Test
    void testSentenceWithMultipleSpaces() {

        SentenceSearcher sentenceAtIndex = new SentenceSearcher(); // Create an object

        final String txt = "Hello   world.   This    is  Java.";

        assertEquals("Hello   world.", sentenceAtIndex.sentenceSearcher(txt, 1));
        assertEquals("This    is  Java.", sentenceAtIndex.sentenceSearcher(txt, 3));
    }

    @Test
    void testSentenceWithPunctuation() {

        SentenceSearcher sentenceAtIndex = new SentenceSearcher(); // Create an object

        final String txt = "Wow! That’s amazing. Can you believe it?";

        assertEquals("That’s amazing.", sentenceAtIndex.sentenceSearcher(txt, 2));
        assertEquals("Can you believe it?", sentenceAtIndex.sentenceSearcher(txt, 4));
    }
}

