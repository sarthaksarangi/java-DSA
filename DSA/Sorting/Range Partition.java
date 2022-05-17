/*Problem: Given an array of integer and a range. Write an algorithms to partition
array so that values smaller than range come to left, then values under the range
followed with values greater than the range.
First solution: The basic approach is to use three index. First left, second right
and third to traverse the array. Index left starts form 0, Index right starts from N-
1. We traverse the array whenever we find a value lower than range we swap it
with the value at start and increment start. And whenever we finds a value
greater than range we swaps this value with right and decrement right. When
traversal is complete we have the array partitioned about range.
*/
import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		int arr[] = { 1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11
		};
		sortArray(arr,arr.length,9,12);
		System.out.println(Arrays.toString(arr));

		

}
	static void sortArray(int arr[],int n,int lower, int higher) {
		int start = 0;
		int i = 0;
		int right = n-1;
		while(i<=right) {
			if(arr[i]<lower) {
				swap(arr,i,start);
				i=i+1;
				start+=1;
			}
			else if(arr[i]>higher) {
				swap(arr,i,right);
				right-=1;
			}
			else { 
				i+=1;
			
			}
			
		}
		
		
	}
	static void swap(int[] arr,int left,int right) {
		int temp;
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] =temp;
	}
}
