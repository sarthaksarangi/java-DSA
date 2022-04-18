package Hashing;
//Intersection of two arrays.
//Return the size of no. of elements which are common in both the arrays
import java.util.*;
public class Intersection {
    public static void main(String[] args) {
 int[] a= {1,2,3,4,3};
 int [] b = {4,2,3,6,7};
        System.out.println(Intersection( a,b));
    }

    static int Intersection(int[] a,int[]b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int x :a){
            set.add(x);
        }
        for(int x :b){
          if(set.contains(x)){
              count++;
              set.remove(x);
          }
        }
        return set.size();
    }
}
