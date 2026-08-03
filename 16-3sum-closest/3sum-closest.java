class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i =0;i<nums.length-2;i++){
            int j = i+1;
            int k =nums.length-1;

            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                }
                
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }
            }
        }
        return closest;
    }
}