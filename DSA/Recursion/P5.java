package Recursion;

public class P5 {
    public static void main(String[] args) {
        backRev(5,5);
    }
    static void backRev(int i, int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        backRev(i-1,n);

    }
}
