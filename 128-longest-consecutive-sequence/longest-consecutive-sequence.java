class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
       int count = 1;
       int max_count = 0;
        for(int i =1;i<nums.length;i++){
            int j = i-1;
            int diff = Math.abs(nums[i]-nums[j]);
            if(diff==0) continue;
            if(diff==1){
                count++;
            }else{
                count = 1;
            }
            max_count = Math.max(max_count , count);
        }
        return max_count==0 ? 1 : max_count;
    }
}