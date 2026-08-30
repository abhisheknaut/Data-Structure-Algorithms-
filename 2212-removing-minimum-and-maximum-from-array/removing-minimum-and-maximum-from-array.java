class Solution {
    public int minimumDeletions(int[] nums) {
        int Max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        int Min = Integer.MAX_VALUE;
       for(int i = 0;i<nums.length;i++){
            if(Min>nums[i]){
                left = i;
                Min = nums[i];
            }
            if(Max <nums[i]){
                right = i;
                Max = nums[i];
            }
       } 
        if(left>right){
            int temp = right;
            right = left;
            left = temp;
        }
        
        int num = Integer.MAX_VALUE;
        num = Math.min(num , right+1);
        num  = Math.min(num , nums.length-left);
        num = Math.min(num , (left+1)+(nums.length-right));
        return num;
    }
}