class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DequeInsertFront {
    static Node front = null, rear = null;

    static void insertFront(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        newNode.next = front;
        front = newNode;
    }

    public static void main(String[] args) {
        insertFront(10);
        insertFront(20);
        insertFront(30);

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
