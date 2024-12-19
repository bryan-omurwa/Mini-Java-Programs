package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ConcentricLayersTest {

    // Helper method to create an instance of RugLayerCounter and call countLayers
    private int countLayers(String[] rug) {
        ConcentricLayers rugCounter = new ConcentricLayers();
        return rugCounter.countLayers(rug);
    }

    @Test
    public void testSingleLayerUniformRows() {
        String[] rug = {"AAAA", "AAAA", "AAAA"};
        assertEquals(1, countLayers(rug));
    }

    @Test
    public void testTwoLayers() {
        String[] rug = {"AAAA", "ABBA", "AAAA"};
        assertEquals(2, countLayers(rug));
    }

    @Test
    public void testThreeLayers() {
        String[] rug = {"AAAAA", "ABBBA", "ABCBA", "ABBBA", "AAAAA"};
        assertEquals(3, countLayers(rug));
    }

    @Test
    public void testMaxLayersAllDifferentRows() {
        String[] rug = {"A", "B", "C", "D", "E"};
        assertEquals(5, countLayers(rug));
    }

    @Test
    public void testTwoDistinctOuterLayers() {
        String[] rug = {"AAAA", "ABBA", "AAAA"};
        assertEquals(2, countLayers(rug));
    }

    @Test
    public void testEmptyInput() {
        String[] rug = {};
        assertEquals(0, countLayers(rug));
    }

    @Test
    public void testSingleRowRug() {
        String[] rug = {"A"};
        assertEquals(1, countLayers(rug));
    }

    @Test
    public void testUniformRowsNoAdditionalLayers() {
        String[] rug = {"AAAA", "AAAA", "AAAA", "AAAA"};
        assertEquals(1, countLayers(rug));
    }

    @Test
    public void testNonSymmetricPattern() {
        String[] rug = {"ABCD", "BCDC", "CDDC", "DCBA"};
        assertEquals(4, countLayers(rug)); // Adjust based on expected behavior
    }

    @Test
    public void testAlternatingLayers() {
        String[] rug = {"AAAA", "ABBA", "AAAA", "ABBA", "AAAA"};
        assertEquals(2, countLayers(rug));
    }
}


