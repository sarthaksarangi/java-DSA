package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }

//    public static  int trappedWater(int height[] ){
//        int n = height.length;
//        //Calculate left max height
//        int [] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for (int i = 1; i <n ; i++) {
//            leftMax[i] = Math.max(leftMax[i-1] , height[i]);
//        }
//        //calculate right max height
//        int [] rightMax = new int[n];
//       rightMax[n-1] = height[n-1];
//        for (int i = n-2; i >=0 ; i--) {
//            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
//        }
//        //calculate water level
//        int trapped = 0;
//        for (int i = 0; i < n ; i++) {
//           int waterLevel = Math.min(leftMax[i],rightMax[i]);
//           trapped += waterLevel -height[i];
//        }
//         return trapped;
//    }
    public static int trappedWater(int[] height){
        //Calculate the left max height
        int n = height.length;
        int []  leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i <n ; i++) {
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        //Calculate the right max height
        int [] rightMax = new int [n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        //Calculate trapped water
        int trapped = 0;
        // Calculate water level
        for (int i = 0; i <n ; i++) {
           int waterLevel = Math.min(leftmax[i],rightMax[i]);
           trapped += waterLevel- height[i];
        }
        return trapped;
    }

}
