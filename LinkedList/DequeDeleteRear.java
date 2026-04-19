class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DequeDeleteRear {
    static Node front = null, rear = null;

    static void deleteRear() {
        if (front == null) return;
        if (front == rear) {
            front = rear = null;
            return;
        }
        Node temp = front;
        while (temp.next != rear) {
            temp = temp.next;
        }
        temp.next = null;
        rear = temp;
    }

    public static void main(String[] args) {
        front = new Node(10);
        front.next = new Node(20);
        front.next.next = new Node(30);
        rear = front.next.next;

        deleteRear();

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
