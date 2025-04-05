package string.frequency;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfEachCharacterInString {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";

        // Call the method to count character occurrences
        Map<Character, Integer> characterCountMap = countCharacterOccurrences(input);

        // Print the character count
        System.out.println("Character occurrences in the string:");
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to count occurrences of each character in a string
    public static Map<Character, Integer> countCharacterOccurrences(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Convert the string to a character array
        char[] characters = input.toCharArray();

        // Iterate through each character in the string
        for (char c : characters) {
            if (characterCountMap.containsKey(c)) {
                // If the character is already in the map, increment its count
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                characterCountMap.put(c, 1);
            }
        }

        return characterCountMap;
    }
}
