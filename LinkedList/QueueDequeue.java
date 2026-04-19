class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueDequeue {
    static Node front = null, rear = null;

    static int dequeue() {
        if (front == null) return -1;
        int data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public static void main(String[] args) {
        front = new Node(10);
        front.next = new Node(20);
        rear = front.next;

        System.out.println("Dequeued: " + dequeue());
        
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
