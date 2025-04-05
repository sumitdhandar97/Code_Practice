
//without using String inbuilt function
package string.reverse;

import java.util.Scanner;

public class StringReversalwithTemp {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the String for reversal ");
            String input = sc.nextLine();
            String reversedString = reverseString(input);
            System.out.println(reversedString);
        }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
