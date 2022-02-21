package com.company;

public class binarySearch {
    public static void main(String[] args) {
int [] arr = {1,23,45,65,78,98};
int ans = search(arr,98);
        System.out.println(ans);
    }
    //return index
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            int mid = start + (end-start)/2;
        if(target>arr[mid]){
            start = mid +1;
        }
       else if(target<arr[mid]){
            end = mid -1;
        }
        else return mid;
        }

        return -1;
    }
}
