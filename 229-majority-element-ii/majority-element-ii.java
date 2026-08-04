class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }

        for(int key : hm.keySet()){
            if(hm.get(key)>n){
                list.add(key);
            }
        }
        return list;
    }
}