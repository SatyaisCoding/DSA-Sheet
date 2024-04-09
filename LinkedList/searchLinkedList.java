package LinkedList;

public class searchLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp.next != null) {
            if (temp.data == key) {
                return i; // idx at which Node is found
            }
            temp = temp.next;
            i++;
        }
        return -1; // NOT Found
    }

    // In, recursive search , the helper function is used to search the node from
    // linked list
    // if the head.data == key , then return 0 and track the index for the next
    // element and if the idx == -1 then we will return -1 else w'll add +1 into idx
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);

    }

}
