package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class insertBeginning {

    private static Node insertFirst(Node head, int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        return head;

    }

    private static void display(Node head) {

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

        head = insertFirst(head, 5);
        System.out.print("After:  ");
        display(head);

    }

}

// Time Complexity : O(1)
