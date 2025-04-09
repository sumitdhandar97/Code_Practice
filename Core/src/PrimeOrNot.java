
import java.util.Scanner;

    //Java Program to Check if a Number is Prime
    public class PrimeOrNot {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Prompt the user for input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Step 2: Check if the number is prime
            boolean isPrime = isPrime(number);

            // Step 3: Display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }

            // Check divisibility from 2 to the square root of the number
            //for (int i = 2; i <= num / 2; ++i) // A number can’t be divisible by anything greater than its half except itself.
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // If divisible, the number is not prime
                }
            }
            return true; // If no divisors found, the number is prime
        }
    }
