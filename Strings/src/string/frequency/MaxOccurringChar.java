package string.frequency;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringChar {
    public static void main(String[] args) {
        String input = "sample string";
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Counting each character's frequency
        for (char ch : input.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        char maxOccurringChar = ' ';
        int maxFrequency = 0;

        // Finding the character with the maximum frequency
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }

        // Displaying the result
        System.out.println("Maximum occurring character: '" + maxOccurringChar + "' with a frequency of " + maxFrequency);
    }
}

