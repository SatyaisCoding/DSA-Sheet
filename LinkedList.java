
public class LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data); // -> creating new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // -->making head;
        head = newNode;
    }
}
    

