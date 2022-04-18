package Recursion;
//Print name n times.
public class P1 {
    public static void main(String[] args) {
        name(0,5);
    }
   static  void name(int i,int n){
        if(i>n){
            return;
        }
       System.out.println("Sarthak "+i);
        name(i+1,n);
   }
}
