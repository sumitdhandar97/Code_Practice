package string.palindrome;

import java.util.Scanner;

/**
 * Java Program to Check Palindrome String using Recursion
 * Author: https://www.javaguides.net/
 */
public class PalindromeCheckRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Step 2: Check if the string is a palindrome using recursion
        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        // Step 3: Display the result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;  // Base case: all characters have been checked
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;  // Characters do not match
        }
        return isPalindrome(str, left + 1, right - 1);  // Recurse for next characters
    }
}