    class Solution {
        public int firstMissingPositive(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
       
        for(int i=1;i<=nums.length;i++){
            if(!hm.containsKey(i)){
                return i;
            }
        }
        return nums.length+1;
        }
    }