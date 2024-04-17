/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node deleteLastNode(Node head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or contains only one element
        }
        
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        Node newtail = tail.prev;
        
        newtail.next = null;
        tail.prev = null;
        
        return head;
    }
}
