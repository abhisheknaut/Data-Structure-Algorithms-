class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int i =0 ;
        int j = 0;
        for(int num : nums){
            if(num>0){
                pos[i] = num;
                i++;
            }else{
                neg[j] = num;
                j++;
            }
        }
        int idx = 0;
        int first = 0;
        while(first<pos.length){
            nums[idx] = pos[first];
            idx++;
            nums[idx] = neg[first];
            idx++;
            first++;
        }
        return nums;
    }
}