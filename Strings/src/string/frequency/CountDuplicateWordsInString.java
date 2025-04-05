package string.frequency;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWordsInString {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun. Programming in Java is great.";

        // Split the string into words using a regular expression
        String[] words = input.toLowerCase().split("\\W+");

        // Use a HashMap to store each word and its count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the duplicate words and their counts
        System.out.println("Duplicate words in the string:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}