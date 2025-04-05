package stack_and_queue_implementation_using_array;

class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to store stack elements
    private int top; // Index of the top element

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push an element to the top of the stack
    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push element.");
        }
        stackArray[++top] = x; // Increment top and insert element
    }

    // Pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop element.");
        }
        return stackArray[top--]; // Return element and decrement top
    }

    // Peek the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek element.");
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a maximum size of 5

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack
        stack.display(); // Output: Stack elements: 10 20 30 40 50

        // Peek the top element
        System.out.println("Top element: " + stack.peek()); // Output: Top element: 50

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 50
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 40

        // Display the stack
        stack.display(); // Output: Stack elements: 10 20 30

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull()); // Output: Is stack full? false
    }
}