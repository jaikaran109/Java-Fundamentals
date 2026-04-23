package LinkedList;

class Node{
   Node next ;
   int data ;
   Node(int data){
       this.data = data;
       this.next = null;
   }
}
public class deleteFirstNode {
    private static Node deleteFirst(Node head) {
        if (head == null) return null;
        return head.next;
    }
    private static void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");

    }
    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Before: ");
        display(head);

        head = deleteFirst(head);
        System.out.print("After:  ");
        display(head);
    }
}
