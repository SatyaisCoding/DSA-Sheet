package LinkedList;

public class middleNode {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public Node middleNode(Node head){
        Node fast = head, slow = head;

        while (fast!=null && fast.next!=null) {
            slow =slow.next;
            fast=fast.next.next; 
        }
        return slow;
    }
    
}
