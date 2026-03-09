//5. Remove Linked List Elements
//Problem
//Remove all nodes of the linked list that have value val.
//        Example
//        Input
//head = 1→2→6→3→4→5→6
//val = 6
//Output
//1→2→3→4→5
//Code Stub
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = temp;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return temp.next;
    }
}
