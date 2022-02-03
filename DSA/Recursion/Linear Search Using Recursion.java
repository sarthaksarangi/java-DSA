package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(search(arr,4,arr.length-1));
    }
    //ascending order lenair search
    //returning boolean
    /*static boolean search(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target|| search(arr,target,i+1);
    }
    //retuning index
    static int searchIndex(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return  searchIndex(arr,target,i+1);
    }

     */
    //check form end
    static boolean search(int[] arr,int target,int i){
        if(i==-1){
            return false;
        }
        return arr[i]==target || search(arr,target,i-1);
    }

}
