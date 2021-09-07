package com.company;

public class evenNumbers {
    public static void main(String[] args) {
        
        int [] arr = {1,23,432,432,43433,33};
        System.out.println(findNumbers(arr));
        System.out.println(digits(13456));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num = 0; num < nums.length ; num++) {
            if(even(num)){
                count++;
            }
        }

        return count;
    }

     static boolean even(int num) {
         int noofdigits = digits(num);
         return noofdigits % 2 == 0;
     }

    static int digits(int n) {
         int count = 0;
         while (n>0){
              count++;
          n= n/10;
          }
         return count;
    }
}
