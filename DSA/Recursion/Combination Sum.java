//https://leetcode.com/problems/combination-sum/
class Solution {
   
    private void findCombination(int ind , int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        
    if( arr[ind]<= target){
        ds.add(arr[ind]);
        findCombination(ind,arr,target-arr[ind],ans,ds);//Pick the index many times. After picking check if target == 0 by subtracting the index value from the target element.
        ds.remove(ds.size()-1);// To not pick the index we have to first remove the element form the data-structure.
        
    }
        findCombination(ind+1,arr,target,ans,ds);//Not pick the current index and move to pick the next index
        
    }
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
