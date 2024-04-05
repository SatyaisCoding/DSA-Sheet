
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
    public void addLast(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = tail =null;
            return;
        }
        tail.next = newNode; // creating linke with newNode
        tail = newNode;

    }
    public Node insertInMid(Node head, int data){
        Node temp = new Node(data);
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        slow.next = temp;

        return head;
    }
    public Node deleteMiddle(int data , int idx){
        if(head ==null  || head.next == null){
            return head;
        }
        if (idx==1) {
            return head.next;
            
        }
        Node temp =head;
        for (int i = 0; i < idx-2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
    

