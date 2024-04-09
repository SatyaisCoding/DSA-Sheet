package LinkedList;

public class deleteMiddleNode {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;



    public Node deleteMiddle(Node head) {
        Node slow = head, fast = head, prev =null;
        if(head == null || head.next == null){
            return null;
        }

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = prev.next.next;
        return head;


        
    }
    
}
