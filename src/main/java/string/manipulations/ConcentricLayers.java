package string.manipulations;

import java.util.Arrays;
import java.util.HashSet;

public class ConcentricLayers {
    public int countLayers(String[] rug) {

        // Use a HashSet collection framework to remove duplicates from the array
        HashSet<String> layers = new HashSet<>(Arrays.asList(rug));

        return layers.size();   // return the size of the set
    }
}
