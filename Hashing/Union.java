package Hashing;
import java.util.*;
//Union of two arrays using Hashing
public class Union {
    public static void main(String[] args) {

    }
    static int Union(int[] a,int[]b){
        Set<Integer> set = new HashSet<>();
        for(int x :a){
            set.add(x);
        }
        for(int x :b){
            set.add(x);
        }
        return set.size();
    }

}
