/*Problem: Given an array containing 0s, 1s and 2s. Write an algorithms to sort
array so that 0s come first followed by 1s and then 2s in the end.
First solution: You can use a counter for 0s, 1s and 2s. Then replace the values
in the array. This will take two pass. What if we want to do this in single pass?
Second solution: The basic approach is to use three index. First left, second
right and third to traverse the array. Index left starts form 0, Index right starts
from N-1. We traverse the array whenever we find a 0 we swap it with the value
at start and increment start. And whenever we finds a 2 we swaps this value with
right and decrement right. When traversal is complete and we reach the right
then the array is sorted.
*/
import java.util.Arrays;

public class Q2 {
public static void main(String[] args) {
	int [] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
	sortArray(arr,arr.length);
	System.out.println(Arrays.toString(arr));
}
static void sortArray(int arr[],int n) {
	int left = 0;
	int i = 0;
	int right = n-1;
	while(i<=right) {
		if(arr[i]==0) {
			swap(arr,i,left);
			i++;
			left++;
		}
		else if(arr[i]==2) {
			swap(arr,i,right);
			right-=1;
		}
		else i+=1;
		
	}
	
	
}
static void swap(int[] arr,int left,int right) {
	int temp;
	temp = arr[left];
	arr[left] = arr[right];
	arr[right] =temp;
}
}
