//8. Intersection of Two Linked Lists
//        Problem
//Given the heads of two linked lists, return the node where the two lists intersect.
//If no intersection exists, return null.
//Code Stub


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode x = headA;
        while(x != null) {
            ListNode y = headB;
            while(y != null){
                if(x == y) return x;
                y = y.next;
            }
            x = x.next;
        }
        return null;
    }
}
