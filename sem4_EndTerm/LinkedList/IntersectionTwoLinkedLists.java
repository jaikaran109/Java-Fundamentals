public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while(A != B){
            if(A == null) A = headB;
            else A = A.next;
            if(B == null) B = headA;
            else B = B.next;
        }
        return A;
    }
}










// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode tempA = headA;
//         while(tempA != null){
//             ListNode tempB = headB;
//             while(tempB != null){
//                 if(tempA == tempB) return tempA;
//                 tempB = tempB.next;
//             }
//             tempA = tempA.next;
//         }
//         return null;
//     }
// }
