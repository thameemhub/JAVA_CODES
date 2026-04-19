class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteFromBeginning {
    static Node head = null;

    static void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        deleteFromBeginning();

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
