class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=1;i<nums.length;i++){
            int j = i-1;
            int diff = nums[i]-nums[j];
            max = Math.max(diff , max);
        }
        return max;
    }
}