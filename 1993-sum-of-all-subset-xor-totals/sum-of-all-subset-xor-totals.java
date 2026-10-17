class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    public int backtrack(int [] nums, int i , int xorSum ){
        if(i==nums.length){
            return xorSum;
        }
        int in  = backtrack(nums,i+1,xorSum^nums[i]);
        int out  = backtrack(nums,i+1,xorSum);
        return in+out;
    }
}