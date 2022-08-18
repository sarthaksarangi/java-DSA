package Arrays;

public class MaxSubArrayPrefix {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println( maxPrefixArr(arr));

    }
    public static int maxPrefixArr(int [] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // calculate prefix array
        int prefix [] = new int [arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ arr[i];
        }

        //formula for calculating prefix sum
        // currSum = prefix[end] - prefix [start-1];

        for(int i = 0; i< arr.length;i++){
            int start = i;
            for(int j = 0; j< arr.length; j++ ){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }

        }
        return maxSum;
    }
}
