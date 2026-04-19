class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackPeek {
    static Node top = null;

    static int peek() {
        if (top == null) return -1;
        return top.data;
    }

    public static void main(String[] args) {
        top = new Node(30);
        top.next = new Node(20);

        System.out.println("Top element: " + peek());
    }
}
