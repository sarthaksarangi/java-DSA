package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=  {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int [] arr){
        int swap =0;
        for (int turns = 0; turns < arr.length-1; turns++) { //There will always be < n-1 turns which means n-2 turns
            for (int j = 0; j < arr.length-1-turns; j++) { // After one complete iteration we do not need to compare for the last element
                if(arr[j]>arr[j+1]){ //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }
            }
            if (swap==0){
                System.out.println("Array is already sorted");
                return;
            }
            System.out.println("No. of swaps = "+swap);
        }


    }
}
