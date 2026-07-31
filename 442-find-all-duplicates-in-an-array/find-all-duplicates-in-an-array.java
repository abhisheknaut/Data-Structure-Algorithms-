class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List <Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int j = i+1;
            if(nums[i]==nums[j]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}