class Solution {
    public List<List<Integer>> subsets(int[] nums) { 
        return subset(nums,new ArrayList<>(),0);
    }
    public List<List<Integer>> subset(int[] nums, List<Integer>current,int i){
        List<List<Integer>> hm = new ArrayList<>();
        if(i==nums.length){
            hm.add(new ArrayList<>(current));
            return hm;
        }
        current.add(nums[i]);
        hm.addAll(subset(nums,current,i+1));
        current.remove(current.size()-1);

        hm.addAll(subset(nums,current,i+1));
        
        return hm;
    }
}