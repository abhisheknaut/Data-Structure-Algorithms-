class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length*2];
        int idx = nums.length;
        for(int i = 0;i<idx;i++){
            ans[i] = nums[i];
        }
         
        for(int i = nums.length-1;i>=0;i--){
            ans[idx]  = nums[i];
            idx++;
        }
        return ans;
    }
}