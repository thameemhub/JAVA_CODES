class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Search {
    static Node head = null;

    static boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Search 20: " + search(20));
        System.out.println("Search 40: " + search(40));
    }
}
