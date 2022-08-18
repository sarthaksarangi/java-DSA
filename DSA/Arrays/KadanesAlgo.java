package Arrays;

public class KadanesAlgo {
    public static void main (String [] args){
        int arr[] = {1,-2,6,-1,3};
        int negArr [] = {-1,-5,-2,-4,-5};

        kadanes(negArr);

    }
    public static void kadanes(int [] arr){
        //Special Case for array containing all negative numbers
        int j = 0;
        int negSum = 0;
        while (j<arr.length){
            negSum += arr[j];
            if(arr[j]<0){
                if(j== arr.length-1 ){
                    System.out.println( negSum);
                    return;
                }
                j++;
            }
        }
        //General Case
        int currSum= 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
           if (currSum<0){
               currSum = 0;
           }
           if(maxSum<currSum){
               maxSum = currSum;
           }
        }
        System.out.println(maxSum);
    }
}
