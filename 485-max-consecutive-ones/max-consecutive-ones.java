class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max = 0;
        for(int n : nums){
            if(n==0){
                ans=0;
            }else{
                ans++;
            }
            max= Math.max(ans,max);
        }
        return max;
    }
}