package Recursion;


//reverse an array
public class P7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
             revArr(arr,0,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void revArr(int arr[], int i,int n){
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        revArr(arr,i+1,n);

    }
    static void swap(int[] arr,int a, int b){

      int temp = arr[a];
       arr[a]  =arr[b];
               arr[b] = temp;
    }
}
