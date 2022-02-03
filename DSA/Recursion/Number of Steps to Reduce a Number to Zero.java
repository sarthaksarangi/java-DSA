//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class Solution {
    int c=0;
    public int numberOfSteps(int num) {
        
        if(num==0){
            return c;
        }
        if(num%2==0){
            c=c+1;
            return numberOfSteps(num/2);
}
        else{
             c=c+1;
            return numberOfSteps(num-1);
        }
            
            
        
    }
    
}
