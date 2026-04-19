class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DequeDeleteFront {
    static Node front = null, rear = null;

    static void deleteFront() {
        if (front == null) return;
        front = front.next;
        if (front == null) rear = null;
    }

    public static void main(String[] args) {
        front = new Node(10);
        front.next = new Node(20);
        rear = front.next;

        deleteFront();

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
