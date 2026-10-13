class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0 ;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        long sum = 0;
        while(left<right){
             sum += (nums[right]*nums[right]) - (nums[left]*nums[left]);
             left++;
             right--;
        }
        if(nums.length%2 !=0){
            sum +=nums[nums.length/2] * nums[nums.length/2];
        }
        return sum;
    }
}