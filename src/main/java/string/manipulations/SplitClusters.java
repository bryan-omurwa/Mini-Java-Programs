package string.manipulations;

import java.util.ArrayList;

public class SplitClusters {

    // A function that groups a string into parentheses clusters. Each cluster should be balanced.
    public String[] splitParenthesesClusters(String str) {
        StringBuilder workString = new StringBuilder();
        ArrayList<String> splitString = new ArrayList<>();
        int depth = 0;  // Tracks the depth of open parentheses

        for (char i : str.toCharArray()) {
            workString.append(i);
            if (i == '(') depth++;  // Increase depth for open parentheses
            if (i == ')') depth--;  // Decrease depth for close parentheses

            // If depth is zero, we found a complete cluster
            if (depth == 0) {
                splitString.add(workString.toString());
                workString.setLength(0);    // Reset for the next cluster
            }
        }

        return splitString.toArray(new String[0]);  // Convert arraylist to array and return the result

    }
}
