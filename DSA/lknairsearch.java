package com.company;

public class LenairSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,11,334,32432};
        int target = 33;
       int ans=  lenair(nums,target);
        System.out.println(ans);

    }
    //search the array return target index if found
    static int lenair(int[] arr ,int target){
        if(arr.length==0)
            return -1;
        else
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];

                if(element== target){
                    return i;
                }

            }
            return -1;
    }
}
