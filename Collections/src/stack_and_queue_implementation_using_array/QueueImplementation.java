package stack_and_queue_implementation_using_array;

//public class Queue {
//    private int front, rear, size;
//    private int capacity;
//    private int[] array;
//
//    public Queue(int capacity) {
//        this.capacity = capacity;
//        front = this.size = 0;
//        rear = capacity - 1;
//        array = new int[this.capacity];
//    }
//
//    // Enqueue function
//    public void enqueue(int item) {
//        if (isFull()) {
//            System.out.println("Queue is full!");
//            return;
//        }
//        rear = (rear + 1) % capacity;
//        array[rear] = item;
//        size++;
//    }
//
//    // Dequeue function
//    public int dequeue() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty!");
//            return Integer.MIN_VALUE;
//        }
//        int item = array[front];
//        front = (front + 1) % capacity;
//        size--;
//        return item;
//    }
//
//    // Check if the queue is empty
//    public boolean isEmpty() {
//        return (size == 0);
//    }
//
//    // Check if the queue is full
//    public boolean isFull() {
//        return (size == capacity);
//    }
//
//    // Get the front item
//    public int front() {
//        if (isEmpty())
//            return Integer.MIN_VALUE;
//        return array[front];
//    }
//}

//What it Means: The error occurs because there is a public class named Queue, but it's not declared in a file named Queue.java.
//This is a requirement in Java for public classes.
//Why Java Requires This: This rule facilitates easier management of code and simplifies the task for the Java compiler and other
//developers to locate source files containing specific public classes. It ensures a one-to-one mapping between public class names
//and their corresponding source file names.


public class QueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}