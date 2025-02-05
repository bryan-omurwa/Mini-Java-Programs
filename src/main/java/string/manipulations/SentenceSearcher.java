package string.manipulations;

public class SentenceSearcher {
    public String sentenceSearcher(String str, int n) {

        // Remove punctuation (.,!?) but keep words intact
        String cleanedSentence = str.replaceAll("[.,!?]", "");

        // Split by whitespace
        String[] words = cleanedSentence.split("\\s+");
        // Convert negative index to positive
        if (n < 0) {
            n = words.length + n; // -1 becomes last index, -2 becomes second last, etc.
        }

        // If index is out of bounds, return empty string
        if (n < 0 || n >= words.length) {
            return "";
        }
        String word = words[n]; // Get the word at the given index

        //  Split into sentences while keeping full stops
        String[] sentences = str.split("(?<=[.!?])\\s+");

        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence.trim();
        }

        return ""; // If no sentence found (shouldn't happen)
    }
}
