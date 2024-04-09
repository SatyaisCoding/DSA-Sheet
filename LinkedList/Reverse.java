package LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse {
    public static Node head;
    public static Node tail;

    public static Node reverseLinkedList(Node head) { // Total time Compleexity --> O(n)+O(n) = O(n)
        Node temp = head; // Space Compleaxity -- > O(n)

        Stack<Integer> stack = new Stack<>();
        while (temp != null) { // O(n)
            stack.push(temp.data); // putting the element into the stack
            temp = temp.next;
        }
        temp = head;
        while (temp != null) { // O(n)
            temp.data = stack.pop(); // removing the elements from stack in reverse order
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");   // printing the linked list   eg:  1->2->3->4->5->null
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // 1->2->3->4 -> null
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printList(head);
    }

    // 2nd Method

    public void reverseLinkedList2(Node head) {   // TC : O(n)  && SC : O(1)
        Node curr = tail = head;
        Node prev = null;
        Node next;
                                    //      prev    curr      next 
        while (curr!=null) {        ///     1   ->   2   ->    3
            next = curr.next;
            curr.next = prev;            
            prev =curr;
            curr = next;
        }
        head = prev;
    }



    // 3rd Method 

    public static Node reverseRecursion(Node head) {  // TC : O(n)  && SC : O(1)
        if(head == null || head.next == null){
            return head;

        }
        Node newHead = reverseRecursion(head.next);   //   1->2->3->4->5->null
                                                     //  1->null
        Node front = head.next;                      // null<-1<-2 ---> newHead
        front.next = head;                             // null<-1<-2<-3 ---> newHead
        head.next = null;                                  // null<-1<-2<-3<-4 ---> newHead
        return newHead;                                 //// null<-1<-2<-3<-4<-5 ---> newHead
    }
    

}
