class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isDecreasing=true;
        boolean isIncreasing =true;

        for(int i = 0;i<nums.length-1;i++){
            int j = i+1;
            if(nums[i]>nums[j]){
                isIncreasing = false;
                
            }
            if(nums[i]<nums[j]){
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}