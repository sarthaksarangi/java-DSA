package com.company;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PosOfElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};

        System.out.println(ans(arr,10));
    }
    static int ans(int[] arr,int target){
//finding the range
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end +1;
            //doubling the range
            // the new end now is prev end + (end-(start-1))*2
            end = ( end-start+1)*2;
            start = newStart;

        }
        return search(arr,target,start,end);
    }

    static int search(int[] arr, int target,int start,int end){
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

