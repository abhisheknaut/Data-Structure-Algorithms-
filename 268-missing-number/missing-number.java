class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<nums.length;i++){
            hm.put(nums[i],i);
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        if(!hm.containsKey(0)){
            return 0;
        }
        for(int i=min;i <=max;i++){
            if(!hm.containsKey(i)){
                return i;
            }
        }
        return max+1;
    }
}