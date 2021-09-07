package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2DArrY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
                {23,4,5,61},
                {18,2,13,15},
                {1,2,3,45,12,21}
        };
        int target = sc.nextInt();
        int[ ] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                  return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
