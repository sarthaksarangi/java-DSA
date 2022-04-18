package Hashing;
import java.util.*;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
 int [] arr = {1,3,4,5,3,2};

        System.out.println(countDistinct(arr));
    }
    static int countDistinct(int arr[]){
        Set<Integer> set = new HashSet<>();
        for (int element:arr) {
            set.add(element);
        }
        return set.size();
    }
    
}
