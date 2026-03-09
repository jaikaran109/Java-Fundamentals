//10. Convert Binary Number in a Linked List to Integer
//        Problem
//The linked list contains 0s and 1s representing a binary number.
//Return the decimal value.
//Example
//        Input
//1 → 0 → 1
//Output
//5
//Code Stub

class Solution {
    public int getDecimalValue(ListNode head) {

        int ans = 0;
        ListNode temp = head;

        while(temp != null){
            ans = ans * 2 + temp.val;
            temp = temp.next;
        }

        return ans;
    }
}
