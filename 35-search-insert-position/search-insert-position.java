class Solution {
    public int searchInsert(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<nums.length;i++){
            max = Math.max(nums[i],max);
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        if(max<target){
            return nums.length;
        }
        return -1;
    }
}