class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> nestedList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i<nums.length-3;i++){
            for(int j = i+1;j<nums.length-2;j++){
                int k = nums.length-1;
                int l = j+1;
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                 if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(l<k){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        nestedList.add(Arrays.asList(nums[i],nums[j],nums[l],nums[k]));
                        l++;
                        k--;
                        while(l<k && nums[l] ==nums[l-1]){
                            l++;
                        }
                        while(l<k && nums[k]==nums[k+1]){
                            k--;
                        }
                    }else if(sum<target){
                        l++;
                    }else{
                        k--;
                    }
            }
            
            }
            
            
        }
        return nestedList;
    }
}