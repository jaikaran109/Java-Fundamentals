//9. Linked List Cycle
//        Problem
//        Given head, determine if the linked list has a cycle.
//Return true if there is a cycle.
//Code Stub

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
