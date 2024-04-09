package LinkedList;

public class lengthLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static int length(Node head){
        int idx =0;

        Node temp = head;
        while(temp!=null){
            idx++;
            temp = temp.next;

        }
        return idx;
    }
    
}
