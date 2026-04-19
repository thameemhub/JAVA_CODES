class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackPop {
    static Node top = null;

    static int pop() {
        if (top == null) return -1;
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        top = new Node(30);
        top.next = new Node(20);
        top.next.next = new Node(10);

        System.out.println("Popped: " + pop());
        
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
