//Return subsequence whose sum is equal to sum
package Recursion;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class P11 {
    public static void main(String[] args) {

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
    /*   static void printSubSeq(int i , int sum, ArrayList<Integer> li, ArrayList<Integer> list,int n,int s){

         if(i==n){
             if(s==sum){
                 System.out.println(list);
             }

             return;
         }

         list.add(li.get(i));
         s +=li.get(i);
         printSubSeq(i+1,sum,li,list,n,s);
         s -=li.get(i);
         list.remove(li.get(i));
         printSubSeq(i+1,sum,li,list,n,s);
     }
 }

      */
 static void printSubSum (int i, ArrayList<Integer> arr, int s ,int sum,ArrayList<Integer> li, int n ){
    if(i==n){
        if(s==sum){
            System.out.println(arr);
        }
        return;
    }
        arr.add(li.get(i));
        s+=li.get(i);
        printSubSum(i+1,arr,s,sum,li,n);
        arr.remove(li.get(i));
        s-=li.get(i);
        printSubSum(i+1,arr,s,sum,li,n);


        }
    }
