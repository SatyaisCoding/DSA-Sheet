package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;


    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data= data;
        this.next =null;
    }
}

public class Reverse {

    public static Node reverseLinkedList(Node head) {
        Node temp = head;
        
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);   // putting the element into the stack 
            temp=temp.next;
        }
        temp =head;
        while (temp!=null) {
            temp.data = stack.pop(); // removing the elements from stack in reverse order
            temp=temp.next;
        }
        return head;
    }
    public static void printList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        // 1->2->3->4
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

    
}
