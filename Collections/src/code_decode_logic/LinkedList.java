package code_decode_logic;

public class LinkedList {

    static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data +
//                    ", next=" + next +
//                    '}';
//        }
    }

    public static void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node reverseList(Node head) {

            if (head == null || head.next == null) {
                return head; // Handle empty or single-node lists
            }
        Node prev = head.next;
        Node next = head.next.next;
        head.next = null;

        while(prev !=null) {
            prev.next=head;
            head = prev;
            prev = next;
            if(next !=null)
                next = next.next;
        }
        return head;
    }



    public static void main(String[] args) {
        //LinkedList list = new LinkedList();  commented as it is never used

        // creating and inserting node data
        LinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Connection of Nodes
        LinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        LinkedList.printNode();
        LinkedList.head = LinkedList.reverseList(LinkedList.head);
        //System.out.println("  head value is --> " + LinkedList.head);
        LinkedList.printNode();
    }



}
