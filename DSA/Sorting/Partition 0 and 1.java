/*Problem: Given an array containing 0s and 1s. Write an algorithms to sort array
so that 0s come first followed by 1s. Also find the minimum number of swaps
required to sort the array.
First solution: Start from both end, left will store start index and right will store
end index. Traverse left forward till we have 0s value in the array. Then traverse
right backward till we have 1s in the end. Then swap the two and follow the
same process till left is less than right.
*/
import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		int arr[]= {0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 ,1};
    System.out.println(partition(arr));
		
    System.out.println(Arrays.toString(arr));
	}
	static int partition(int[] arr) {
		int left= 0;
		int right= arr.length-1;
		int count= 0;
		while(left<right) {
			while(arr[left]==0) {
			left+=1;
			}
			while(arr[right]==1) {
			right-=1;
			}
			if(left<right) {
			swap(arr,left,right);
			count = count+1;
			
			}
		}
		
		
		return count;
		
	}
	
	static void swap(int[] arr,int left,int right) {
		int temp;
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] =temp;
	}

}
