/*https://practice.geeksforgeeks.org/tracks/DSASP-LinkedList/?batchId=154*/

class Node{
    int data;
    Node next;
    Node(int x){
        data= x;
        next= null;
    }
}
class LinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println("Linked list before insertion: ");
        printlist(head);
        int data = 45, pos = 4;
        head = insertPos(head,pos,data);
        System.out.println("Linked list after" + " insertion of 45 at position 4: ");
        printlist(head);
    }
    static Node insertPos(Node head,int pos,int data){
        Node temp = new Node (data);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        for (int i=1;i<=pos-2 && curr!=null;i++){
            curr= curr.next;
        }
        if(curr == null)
            return head;
        temp.next= curr.next;
        curr.next= temp;
        return head;
    }
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
