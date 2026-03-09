package LinkedList;

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        }
    }


public class PalindromeLL {
    static Node Arr2LL(int[] arr){
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node newVal = new Node(arr[i]);
            temp.next = newVal;
            temp = newVal;
        }
        return head;
    }
    static Node middle(Node head){
        Node slow = head ;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    static boolean isPalindrome(Node head){
        if(head == null || head.next == null) return true;

        Node mid = middle(head);

        Node secHead = reverse(mid);

        Node first = head;

        while(secHead != null){
            if(first.data != secHead.data) return false;
            first = first.next;
            secHead = secHead.next;
        }
        return true;
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        Node head = Arr2LL(arr);
        if(isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
