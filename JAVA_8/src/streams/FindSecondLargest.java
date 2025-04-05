package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindSecondLargest {
    public static void main(String[] args) {
        // Step 1: Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);
        // Steps 2, 3, and 4: Using streams to sort, remove duplicates, and find the second largest
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Removes duplicates
                .sorted((a,b)->b-a) // Sorts the stream
                //.peek(System.out::println)
                .skip(1)
                .peek(System.out::println)
                .findFirst(); // Retrieves the second largest number

        // Step 5: Displaying the second largest number
        secondLargest.ifPresent(s -> System.out.println("The second largest number is: " + s));
    }
}