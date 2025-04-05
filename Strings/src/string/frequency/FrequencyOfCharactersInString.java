package string.frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Program to Count the Occurrences of Each Character in a String
 * Author: https://www.javaguides.net/
 */
public class FrequencyOfCharactersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Use a HashMap to track character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();


//        getOrDefault(c, 0):
//        Checks if the character c is already a key in the map.
//        If c is present, it retrieves the current count.
//        If c is not present, it defaults to 0.

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Display the character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
