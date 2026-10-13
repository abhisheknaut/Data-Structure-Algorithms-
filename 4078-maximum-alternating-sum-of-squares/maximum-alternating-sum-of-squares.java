class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i =0 ;i<n;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        long sum = 0;
        while(left<right){
             sum += (nums[right]*nums[right]) - (nums[left]*nums[left]);
             left++;
             right--;
        }
        if(n%2 !=0){
            sum +=nums[n/2] * nums[n/2];
        }
        return sum;
    }
}