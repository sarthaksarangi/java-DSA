package com.company;

public class cielingOfANo {
    public static void main(String[] args) {
        int [] arr = {2,34,56,78,99};
        int target = 45;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<= end) {
            if(target>arr[arr.length-1]){
                return -1;
            }
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else start = mid+1;
        }
        return arr[start];
    }
}
