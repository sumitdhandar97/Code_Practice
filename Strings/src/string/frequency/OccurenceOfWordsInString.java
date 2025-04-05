package string.frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Program to Count Occurrences of Words in a String
 * Author: https://www.javaguides.net/
 */
public class OccurenceOfWordsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Split the string into words based on whitespaces (spaces, tabs, new lines etc)
        String[] words = input.toLowerCase().split("\\s+"); //In Java, the regex pattern \\s+ is used to match one or more whitespace characters in a string.
        // Step 3: Use a HashMap to track word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            //The getordefault method will return the default value of 0 if the word is not found.
            // This ensures that the count is always a valid integer, eliminating the need for null checks.
        }

        // Step 4: Display the word frequencies
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}