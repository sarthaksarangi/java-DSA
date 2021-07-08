class Node {
    int data ;
    Node next;
    Node(int x){
        data = x;
        next= null;
    }
}
class searchLinkedList{
    public static void main(String[] args) {
        Node head= new Node (10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Linked List to be searched.");
        printlist(head);
        System.out.println("Position = " +search(head,40));
    }
    public static int search(Node head,int x){
        if (head== null)
            return -1;
        if (head.data==x)
            return 1;
        else{
            int res= search(head.next,x);
            if(res==-1)
                return -1;
            else return(res+1);

        }
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
