package LinkedList;

public class countNodes {
    private static int count(Node head){
        int c = 0 ;
        Node temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Count: " + count(head));

    }
}
