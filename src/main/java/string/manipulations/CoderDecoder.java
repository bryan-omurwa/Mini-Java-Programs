package string.manipulations;

public class CoderDecoder {

    // Alphabet map
    private final String[] map = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"};

    // Function to encode the message
    // This method transforms the input message into an encoded form using the provided map array.
    public String encode(String message) {
        StringBuilder encoded = new StringBuilder();    // StringBuilder is used here for efficient string concatenation during the encoding process.
        for (char c : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                encoded.append(map[c - 'a']);
            } else {
                encoded.append(c); // Keep non-letter characters as is
            }
        }
        return encoded.toString();
    }

    // Function to decode the message
    // This method reverses the encoding process, recovering the original message from its encoded form.
    public String decode(String codedMessage) {
        StringBuilder decoded = new StringBuilder();    // StringBuilder is used here for efficient string concatenation during the decoding process.
        for (char c : codedMessage.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int index = findIndex(String.valueOf(c));   // Find the index of the character in the map to retrieve the original letter.
                decoded.append((char) ('a' + index));
            } else {
                decoded.append(c); // Keep non-letter characters as is
            }
        }
        return decoded.toString();
    }

    // Helper function to find the index of a character in the map
    private int findIndex(String charStr) {
        for (int i = 0; i < map.length; i++) {
            if (map[i].equals(charStr)) {
                return i;
            }
        }
        return -1; // This should not happen if the map is complete
    }
}
