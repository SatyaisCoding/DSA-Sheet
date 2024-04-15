// Brute Force Approach 

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { // T.C : O(m*n)
        
         while(headB != null){
            ListNode temp = headA;
            while(temp!=null){
                if(temp == headB){
                    return headB;
                }
                temp = temp.next;
            }
            headB = headB.next;
         }
        return null;
    }
}


// Optimal Approach 

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {  // T.C : O(n)  && S.C : O(n)
     HashSet<ListNode> st=new HashSet<>();
    while(headA != null) {
       st.add(headA);
       headA = headA.next;
    }
    while(headB != null) {
        if(st.contains(headB)) return headB;
        headB = headB.next;
    }
    return null;        
    }
}

//optimised approach

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {   // T.C : O(2max(length of list1,length of list2))+O(abs(length of list1-length of list2))+O(min(length of list1,length of list2))
                                                                            // S.C : O(n)
     int diff = getDifference(headA,headB);
        if(diff < 0) 
            while(diff++ != 0) headB = headB.next; 
        else while(diff-- != 0) headA = headA.next;
        while(headA != null) {
            if(headA == headB) return headA;
            headB = headB.next;
            headA = headA.next;
        }
        return headA; 
    }

    static int getDifference(ListNode headA,ListNode headB) {
     int len1 = 0,len2 = 0;
        while(headA != null || headB != null) {
            if(headA != null) {
                ++len1; headA = headA.next;
            }
            if(headB != null) {
                ++len2; headB = headB.next;
            }
            
        }
        return len1-len2;
    }
}


// Best Approach 

static Node intersectionPresent(Node head1,Node head2) {  // T.C : O(2*max(length of list1,length of list2));  && S.C : O(1)
    Node d1 = head1;
    Node d2 = head2;
    
    while(d1 != d2) {
        d1 = d1 == null? head2:d1.next;
        d2 = d2 == null? head1:d2.next;
    }
    
    return d1;
}
