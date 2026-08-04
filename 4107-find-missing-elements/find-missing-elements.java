class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        List <Integer> list = new ArrayList<>();
        HashMap <Integer ,Integer> hm = new HashMap<>();

        for(int i = min; i<=max;i++){
            hm.put(i, 0);
        }

        for (int idx = 0; idx < nums.length; idx++) {
            if(hm.containsKey(nums[idx])){
                hm.put(nums[idx], hm.get(nums[idx])+1);
            }
        }

        for(int i=min; i< max;i++){
            if(hm.get(i)==0){
                list.add(i);
            }
        }
        return list;
}
}