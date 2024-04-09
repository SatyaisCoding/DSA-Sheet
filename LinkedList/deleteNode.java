package LinkedList;

public class deleteNode {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteNode(Node node){   /// LeetCode No : 237
        node.data = node.next.data;
         node.next = node.next.next;
    }
    
}
