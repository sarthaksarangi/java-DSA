package Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.print(maxSum(arr));
    }
    public static int maxSum(int [] arr){
        int  currSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int start = i;
            for (int j = 0; j < arr.length ; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k<=end; k++ ){
                   currSum += arr[k];

                }
                System.out.println(currSum);// printing all subarrays sum
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
}
