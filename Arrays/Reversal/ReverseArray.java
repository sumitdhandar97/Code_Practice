package Reversal;

public class ReverseArray {
    public static void main(String[] args) {
        // Step 1: Declaring and initializing an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Step 2: Reversing the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Step 3: Displaying the reversed array
        System.out.println("\nReversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}