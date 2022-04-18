package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Print all the subsequence of an array.
public class P10 {

    public static void main(String[] args) {
        int n = 3;
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> li = new ArrayList<>();
        printSub(0,arr,3,li);

    }
    public static void printSub(int i, ArrayList<Integer>arr,int n, List<Integer> li){
        if(i==n){
            System.out.println(li);
            return;
        }
        li.add(arr.get(i));
        printSub(i+1,arr,n,li);
        li.remove(arr.get(i));
        printSub(i+1,arr,n,li);
    }

}
