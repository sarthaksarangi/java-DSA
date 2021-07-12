class Node1{
    int data;
    Node1 prev;
    Node1 next;
    Node1(int x){
        data = x;
        next = prev = null;
    }
}
 class dll{
public static Node1 insertEnd(Node1 head,int data){
    Node1 temp = new Node1 (data);
    if(head== null)
        return temp;
    Node1 curr = head;
    while(curr.next!= null){
        curr = curr.next;
    }
    curr.next = temp;
    temp.prev = curr;
    return head;
}

     public static void main(String[] args) {


         Node1 head =new Node1(10);
         Node1 temp1=new Node1(20);
         Node1 temp2=new Node1(30);
         head.next=temp1;
         temp1.prev=head;
         temp1.next=temp2;
         temp2.prev=temp1;
         head = insertEnd(head,50);
         printlist(head);


     }
     public static void printlist(Node1 head){
         Node1 curr=head;
         while(curr!=null){
             System.out.print(curr.data+" ");
             curr=curr.next;
         }System.out.println();
     }
