class Node{
  int data;
  Node prev;
  Node next;
  Node(int x){
    data = x;
    next= prev= null;
  }
}
    public static Node insertbegin(Node head, int data){
  Node temp = new Node(data);
  temp.next = head;
  if(head!= null){
    head.prev = temp;
    return temp;
  }
}
