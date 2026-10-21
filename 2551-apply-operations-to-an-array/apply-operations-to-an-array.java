class Solution {
    public int[] applyOperations(int[] nums) {
        for(int j = 1;j<nums.length;j++){
            int i = j-1;
            if(nums[i]==nums[j]){
                nums[i] = 2*nums[i];
                nums[j] = 0;
            }
        }
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]  =temp;
                i++;
            }
        }
        return nums;
    }
}