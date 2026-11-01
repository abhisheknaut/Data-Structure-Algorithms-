class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int num:nums){
            max = Math.min(num,max);
        }

        long ans= 0;
        for(int i  = 0;i<nums.length;i++){
            ans += (nums[i]-max);
        }
        return (int) ans;
    }
}