//Iterative Method

class Node{
    int data;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }
}

public class searchLinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node (30);
        head.next.next.next = new Node (40);
        System.out.println("Linked List to be searched.");
        printlist(head);
        System.out.println("Number to be searched = 30 ");
        System.out.println("Position = "+ searchLL(head,30));
    }
    public static int searchLL(Node head,int x){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if (curr.data == x){
                return pos;
            }
            else {
                pos++;
                curr= curr.next;
            }
        }
        return -1;
    }
    public static void printlist(Node head){
        Node curr= head;
        while (curr!= null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
