//4. Middle of the Linked List
//        Problem
//Given the head of a linked list, return the middle node.
//If there are two middle nodes, return the second middle node.
//Example
//        Input
//1 → 2 → 3 → 4 → 5
//Output
//3
//Code Stub
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
