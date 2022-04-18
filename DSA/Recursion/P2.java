package Recursion;
//Print lenairly form 1 to n
public class P2 {
    public static void main(String[] args) {
        lenair(1,10);
    }
    static void lenair(int i , int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        lenair(i+1,n);
    }

}
