import java.util.*;
public class P1 {
public static void main(String[] args) {
	int [] arr = {};
findElement(arr);
}
/*static int find(int[] arr) {
	
	int j, m= 0;
	Arrays.sort(arr);
	for ( j=0; j < arr.length; j++) {
		if(arr[j] == arr[j+1]) {
			m = arr[j];
			break;
		}
	}
	return m;
}
*/
static void findElement(int[] arr) {
	int i, m =0;
	if(arr.length==0) {
		System.out.println("Empty Array");
	}
	else if(arr.length==1) {
		System.out.println("There is only 1 element in the array");
		
	}
	
	elsearr.length ==0|| {
	for ( i = 0; i < arr.length-1; i++) {
		for (int j =i+1; j < arr.length; j++) {
			
				if(arr[i]==arr[j]) {
					m = arr[i];
					break;
				}
			}
		}
	if(m==0) {
		System.out.println("No duplicate elements");
	}
	else
		System.out.println(m+" is the first duplicate element");
	}
		
	return ;
}
}
