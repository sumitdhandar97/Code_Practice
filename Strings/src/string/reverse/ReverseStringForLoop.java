package string.reverse;

import java.util.Scanner;

public class ReverseStringForLoop {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String for reversal ");
        String input = sc.nextLine();
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for(int i=input.length()-1; i >= 0; i--){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
