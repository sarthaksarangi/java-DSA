package com.company;

import java.util.ArrayList;

public class MultipleRecurences {
    public static void main(String[] args) {
 int arr[]= {1,2,4,4,6,8} ;
        System.out.println(search(arr,4,0,new ArrayList<>()));
    }

    static ArrayList<Integer> search(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);

        }
        return search(arr, target, index+1,list);

    }


}
