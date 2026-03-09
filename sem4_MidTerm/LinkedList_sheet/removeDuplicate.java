//7. Remove Duplicates from Sorted List
//        Problem
//Delete all duplicates such that each element appears only once.
//Example
//        Input
//1 → 1 → 2 → 3 → 3
//Output
//1 → 2 → 3
//Code Stub
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while(temp != null && temp.next != null){

            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return head;
    }
}
