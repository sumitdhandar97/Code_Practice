package string.reverse;

import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for reversal ");
        String input = sc.nextLine();
        String reversedString = reverseString(input);
        System.out.println("reversed String is : " + reversedString);
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str; // Base case: return the string if it's empty
        }
        // Return the reversed string directly without storing it in a variable
        return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
    }
}

// refer programiz ka recursion topic intereview_series bookmark



//For a string of length n, the total number of String objects created will be n (from substring) plus the
// final reversed string object. Thus, the total is n + 1.
//--------------------------------------------------------------------------------------------------------------------------
//If the “MyJava” is the string to reverse, then this method works like this.
//
//        1st Call —>   recursiveMethod(“MyJava”)
//2nd Call —> recursiveMethod(“yJava”) + “M”
//        3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
//        4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
//        5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
//        6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”

//After 6th call, it Stops calling itself. Because the length of passed string is 1 or blank. So, finally it returns “avaJyM”.
//--------------------------------------------------------------------------------------------------------------------------

//reverseString("World") calls reverseString("orld") and appends 'W'.
//reverseString("orld") calls reverseString("rld") and appends 'o'.
//reverseString("rld") calls reverseString("ld") and appends 'r'.
//reverseString("ld") calls reverseString("d") and appends 'l'.
//reverseString("d") calls reverseString("") and appends 'd'.
//reverseString("") returns "".

//Java maintains a special area in the heap called the "string pool". When a string literal is created, Java checks the pool first;
// if an identical string already exists there, the new variable will point to the existing string instead of creating a new object.
// This mechanism does not apply to strings created by concatenation at runtime unless they are explicitly interned using the String.intern()
// method.

//In the context of your recursive function, each recursive call concatenates strings using the + operator. This results in the creation of new
// string objects in the heap (outside the string pool) because the concatenation at runtime generally does not use interning. Each concatenated
// string is a new object and consumes memory.

//For more efficient string concatenation, especially within loops or recursive functions, it's generally recommended to use StringBuilder or StringBuffer.
// These classes are designed for mutable sequences of characters and provide a more memory-efficient way of manipulating strings because they do not create
// a new object for each concatenation but rather modify the existing sequence of characters in place.

//-----------------------------------------------------------

//How It Works
//For example, if you call reverseString("hello"), the following happens:
//
//reverseString("hello") calls reverseString("ello") and appends 'h'.
//reverseString("ello") calls reverseString("llo") and appends 'e'.
//reverseString("llo") calls reverseString("lo") and appends 'l'.
//reverseString("lo") calls reverseString("o") and appends 'l'.
//reverseString("o") calls reverseString("") and appends 'o'.
//reverseString("") returns "".
//The calls then resolve in reverse order, resulting in the final string: "olleh".
//
//String Object Creation
//Substring Creation:
//
//Each call to str.substring(1) creates a new String object. This means that for a string of length n, there will be n substring calls, resulting in n new String objects.
//Character Access:
//
//The call to str.charAt(0) does not create a new String object; it simply accesses the character at index 0.
//Total String Objects Created
//For a string of length n, the total number of String objects created will be n (from substring) plus the final reversed string object. Thus, the total is n + 1.
//Performance Considerations
//Time Complexity:
//
//The time complexity of this method is O(n^2) because each call to substring creates a new string, and there are n recursive calls. Each substring operation takes O(n) time in the worst case.
//Space Complexity:
//
//The space complexity is O(n) due to the call stack from recursion and the additional space used for the substring objects.
//        Alternative Approach
//For better performance, especially for longer strings, consider using an iterative approach or a StringBuilder: