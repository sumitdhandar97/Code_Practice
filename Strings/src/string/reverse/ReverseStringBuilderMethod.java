package string.reverse;

import java.util.Scanner;

public class ReverseStringBuilderMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for reversal ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("reversed String is : " + reversed);
    }
}
