package Recursion;
//Print only one subsequence whose sum is 2;
import java.util.*;
public class P12 {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array");
    int n = sc.nextInt();
    ArrayList<Integer> li = new ArrayList<>();
        System.out.println("Input the elements of array");
        for (int i = 0; i < n; i++) {
        li.add(sc.nextInt());
    }

    ArrayList<Integer> arr = new ArrayList<>();
    printSubSum(0,arr,0,2,li,n);

}
    static boolean printSubSum (int i, ArrayList<Integer> arr, int s ,int sum,ArrayList<Integer> li, int n ){
        if(i==n){
            if(s==sum){
                System.out.println(arr);
                return true;
            }
            return false;
        }
        arr.add(li.get(i));
        s+=li.get(i);
        if(  printSubSum(i+1,arr,s,sum,li,n)==true) return true;

        arr.remove(li.get(i));
        s-=li.get(i);
        if(printSubSum(i+1,arr,s,sum,li,n)==true) return true;
       return false;

    }
}
