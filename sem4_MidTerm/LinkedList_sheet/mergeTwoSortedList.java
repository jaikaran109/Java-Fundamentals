//2. Merge Two Sorted Lists
//Problem
//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list.
//Example
//        Input
//list1 = 1→2→4
//list2 = 1→3→4
//Output
//1→1→2→3→4→4
//Code Stub
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;
        while (list1 != null && list2 != null) {
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return dummy.next;
    }
}
