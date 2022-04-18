package Recursion;
// 1-n order using backtracking
public class P4 {
    public static void main(String[] args) {
        backRev(5,5);
    }
    static void backRev(int i, int n){
        if(i<1){
            return;
        }
        backRev(i-1,n);
        System.out.println(i);
    }


}
