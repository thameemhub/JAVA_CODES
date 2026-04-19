class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueuePeek {
    static Node front = null, rear = null;

    static int peek() {
        if (front == null) return -1;
        return front.data;
    }

    public static void main(String[] args) {
        front = new Node(10);
        front.next = new Node(20);
        rear = front.next;

        System.out.println("Front element: " + peek());
    }
}
