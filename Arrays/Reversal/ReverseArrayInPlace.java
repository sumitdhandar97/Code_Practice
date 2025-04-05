package Reversal;

import java.util.Arrays;

/**
 * Java Program to Reverse an Array Without Using Another Array
 * Author: https://www.javaguides.net/
 */
public class ReverseArrayInPlace {

    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] array = {1, 2, 3, 4, 5};

        // Step 2: Reverse the array in-place
        reverseArray(array);

        // Step 3: Display the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array in-place
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements at left and right pointers
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}