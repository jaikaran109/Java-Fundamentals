package LinkedList;

class Node{
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insertEnd {
    private static Node insertLast(Node head , int val){
        Node  newNode = new Node(val);
        if (head == null) return newNode;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
    private static void display(Node head){
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Before: ");
        display(head);

        head = insertLast(head, 5);
        System.out.print("After:  ");
        display(head);
    }
}

