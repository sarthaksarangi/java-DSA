package com.company;

public class SumOfElementsOfArray {
    static int arr[] = { 1, 2, 3, 4, 5 };
    static int findSum(int A[],int n){
        if(n<=0)
            return 0;
        else
            return (findSum(A,n-1) +A[n-1]);


    }

    public static void main(String[] args) {
        System.out.println(findSum(arr, arr.length));
    }
}
