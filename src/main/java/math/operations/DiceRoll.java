package math.operations;

import java.util.HashMap;
import java.util.Map;

public class DiceRoll {

    // Memoization map to store computed results
    private static final Map<String, Integer> memo = new HashMap<>();

    public int diceRoll(int numDice, int targetSum) {
        return countWays(numDice, targetSum);
    }

    private int countWays(int dice, int sum) {
        // Base Case: No dice left
        if (dice == 0) {
            return sum == 0 ? 1 : 0;
        }

        // Memoization Key
        String key = dice + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int ways = 0;
        // Iterate through all possible dice face values (1-6)
        for (int face = 1; face <= 6; face++) {
            if (sum >= face) {
                ways += countWays(dice - 1, sum - face);
            }
        }

        // Store in memoization map
        memo.put(key, ways);
        return ways;
    }
}
