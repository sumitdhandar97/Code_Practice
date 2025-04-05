package string.palindrome;

import java.util.Scanner;

/**
 * Java Program to Check Palindrome String using StringBuilder
 * Author: https://www.javaguides.net/
 */
public class PalindromeCheckStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Step 2: Check if the string is a palindrome using StringBuilder's reverse method
        String reversed = new StringBuilder(input).reverse().toString();

        // Step 3: Display the result
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}