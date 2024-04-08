package LinkedList;

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

        while(fast!=null && fast.next!=null && fast.next.next !=null){  //--> finding mid 
            slow = slow.next;
            fast = fast.next.next;


            // when fast == null then slow auto reacged at the mid i.e = slow node is at mid
        }
        temp.next = slow.next;       // Linking the newNode with the node agter the mid 
        slow.next = temp;  //  finishing the link

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
        for (int i = 0; i < idx-2; i++) {    // traveling to the 2nd last index 
            temp = temp.next;
        }
        temp.next = temp.next.next; // deleting the last elements by  removing the link with the 2nd last element
        return head;
    }





    public boolean detectLoop(Node head){  // here we are usign slow - fast pointer to detect the loop
        Node fast = head;
        Node slow = head;

        while(fast.next!= null && fast.next.next !=null){ 
            slow = slow.next;
            fast=fast.next.next;

            // slow travel 1 node while fast travel 2 node at once , if the linked list contain cycle 
            // there is always a a where slow and fast pointer mett each other and when they meet , hence it will coinfirm that ,
            // LL contain cycle
            if(slow==fast){    

                return true;
            }
            
        }
        return false;
    }
}
    

 