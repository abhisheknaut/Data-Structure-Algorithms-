class Solution {

    public int countMaxOrSubsets(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        maxOr(nums , 0 ,0,hm);
        int max = 0;
        for(int key: hm.keySet()){
            max = Math.max(max ,hm.get(key));
        }
        return max;
    }
    public void maxOr(int[] nums , int i ,int ans, HashMap<Integer,Integer> hm){
        if(i==nums.length){
              hm.put(ans, hm.getOrDefault(ans, 0) + 1);
            return;
        }
        maxOr(nums ,i+1, ans|nums[i] ,hm);

        maxOr(nums ,i+1, ans ,hm);

    }
}