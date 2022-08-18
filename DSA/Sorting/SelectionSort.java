package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]=  {5,4,3,6,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
