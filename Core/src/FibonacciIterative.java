import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        getFabonacci(n);
        scanner.close();//is used to release the system resources (like memory, input streams) that the Scanner object is using — especially if it was reading from System.in, a file, or a stream.
    }

    public static void getFabonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
