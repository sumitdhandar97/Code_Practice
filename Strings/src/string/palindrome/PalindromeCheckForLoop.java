package string.palindrome;

import java.util.Scanner;

public class PalindromeCheckForLoop {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome : ");
        String input = sc.nextLine();
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            // \" used to print " double quotes
            System.out.println("\"" + input + "\" is a Palindrome");

        } else {
            System.out.println("\"" + input + "\" is not a Palindrome");
        }


    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        System.out.println(n);
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1))
                return false;
        }
        return true;
    }




}