package LinkedList;

//class Node{
//    int data ;
//    Node next ;
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}

public class ReverseLL {
    static Node head;

    static void insertLast(int val){
        Node newVal = new Node(val);
        if(head == null){
            head = newVal;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newVal;
    }
    private static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("End -- ");
    }
    static void reverse(){
        Node pre = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }
    static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        list.display();
        list.reverse();
        list.display();
    }
}









////    10 Easy Linked List Problems
////1. Reverse Linked List
////        Problem
////Given the head of a singly linked list, reverse the list and return the reversed list.
////        Example
////        Input
////1 → 2 → 3 → 4 → 5
////Output
//
//
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        Node curr = head;
//        Node pre = null;
//        Node next = null;
//        while(curr != null){
//            next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        return pre;
//    }
//}
