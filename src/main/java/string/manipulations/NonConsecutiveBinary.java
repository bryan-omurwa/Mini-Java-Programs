package string.manipulations;

import java.util.ArrayList;
import java.util.List;

public class NonConsecutiveBinary {

    public String generateNonconsecutive(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return String.join(" ", result);
    }

    private void generate(String prefix, int n, List<String> result) {
        if (n == 0) {
            result.add(prefix);
            return;
        }

        // Append '0' and continue
        generate(prefix + "0", n - 1, result);

        // Append '1' only if the previous character is not '1'
        if (prefix.isEmpty() || prefix.charAt(prefix.length() - 1) != '1') {
            generate(prefix + "1", n - 1, result);
        }
    }
}
