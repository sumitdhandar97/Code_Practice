package string.duplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to find duplicate characters: ");
        String input = scanner.nextLine();

        // Step 2: Use a HashMap to track character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();
        // getOrDefault if mapping fount for the specific key return that value or return specified default value
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Identify and display duplicate characters
        System.out.print("Duplicate characters: ");
        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.print("No duplicates found.");
        }

        System.out.println();
    }
}