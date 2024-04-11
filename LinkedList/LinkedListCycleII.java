/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {                           // TC : O(n) and SC : O(1)
    public ListNode detectCycle(ListNode head) {   // optimal approach 
      
        ListNode slow = head;
        ListNode fast = head;

        ListNode entry = head;

        if(head == null || head.next == null){
            return null;
        }

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                while(entry!=slow){
                    slow =slow.next;
                    entry =entry.next;

                }
                return entry;
            }
        }
        return null;
        
    }
}
public class Solution {                           // TC : O(n)  and SC : O(n)
    public ListNode detectCycle(ListNode head) {   // Brute Force Approach 
        HashSet<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }

        return null;
    }
}
