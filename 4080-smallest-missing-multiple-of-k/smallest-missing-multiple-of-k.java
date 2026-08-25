class Solution {
    public int missingMultiple(int[] nums, int k) {
         int max = Integer.MIN_VALUE;
        HashMap <Integer,Integer>hm =new HashMap<>();

       boolean found =false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==k){
               found=true;
            }

         }
         if(found==false){
            return k;
         }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%k==0){
               hm.put(nums[i], 1);
               max = Math.max(max, nums[i]);
            }
        }
         max= max+k;
        int ans = 0;
        for(int i = 1 ; i<=max;i++){
         if(!hm.containsKey(k*i)){
            return k*i;
         }
        }
        return ans;
    }
}