class Node {
    int data ;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }
} //End of Node


class MyStack{
    Node head;
    int siz;
    MyStack(){
        head = null;
        siz = 0;
    }
    int size(){
        return siz;
    }
    boolean isEmpty(){
        return (head == null);
    }
    void push(int x){
        Node temp = new Node(x) ;
        temp.next = head;
        head = temp;
        siz++;
    }
    int pop(){
        if (head==null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        siz--;
        return res;
    }
    int peek(){
        if (head== null)
            return Integer.MAX_VALUE;
        return head.data;
    }
} //End of MyStack class.

public class LLstack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        

    }
}
