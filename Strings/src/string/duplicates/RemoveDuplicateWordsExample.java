package string.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsExample {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun and Java is powerful";

        // Using Traditional Approach
        String resultTraditional = removeDuplicateWordsTraditional(input);
        System.out.println("Using Traditional Approach:");
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + resultTraditional);

        // Using Java 8 Streams
        String resultStreams = removeDuplicateWordsStreams(input);
        System.out.println("\nUsing Java 8 Streams:");
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + resultStreams);
    }

    public static String removeDuplicateWordsTraditional(String input) {
        String[] words = input.split("\\s+");
        Set<String> wordSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!wordSet.contains(word)) {
                wordSet.add(word);
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static String removeDuplicateWordsStreams(String input) {
        Set<String> wordSet = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return String.join(" ", wordSet);
    }
}