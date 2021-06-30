class Node{
    int data;
    Node next;
    Node (int x){
        data =x;
        next=null;
    }
}
    public class LLrecursion {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(200);
        head.next.next = new Node(2000);
        rPrint(head);
    }
        public static void rPrint(Node head) {
            if (head != null) {
                System.out.print(head.data + " ");
                rPrint(head.next);
            }
        }

    }

