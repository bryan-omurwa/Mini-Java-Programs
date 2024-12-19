package string.manipulations;

public class UnmixString {
    public String unmixString(String str) {
        StringBuilder unmixed = new StringBuilder();     // Use StringBuilder to modify the string

        // Loop through the string in steps of 2
        for (int i = 0; i < str.length(); i += 2) {

            // If there's an odd number of characters, append the last character to unmixed,
            //since it doesn't have a swap character
            if (i == str.length() - 1) {
                unmixed.append(str.charAt(i));
                continue;
            }

            // Swap even and odd characters
            unmixed.append(str.charAt(i + 1));
            unmixed.append(str.charAt(i));
        }
        return unmixed.toString();
    }
}