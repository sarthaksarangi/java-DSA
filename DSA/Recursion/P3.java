package Recursion;
//Print form n to 1
public class P3 {
    public static void main(String[] args) {
        lenair(1,10);
    }
    static void lenair(int i , int n){
        if(i>n){
            return;
        }
        lenair(i+1,n);
        System.out.print(i+" ");

    }
}
