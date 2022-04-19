//Rotate array by k-th position
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70};
		
		rotateArray(arr,arr.length-2);

	}
	
	static void reverse(int[] arr, int low, int high) {
		while (low<high) {
			swap(arr,low,high);
			low++;
			high--;
		}
	}
	static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int arr[],int a, int b) {
		int temp = arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	
	}
	

}
