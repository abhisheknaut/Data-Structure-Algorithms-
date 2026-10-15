class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i = 0;i<nums.size();i++){
            for(int j =i+1 ;j<=nums.size();j++){
                int n = new HashSet<>(nums.subList(i, j)).size();;
                ans +=n*n;
            }  
        }
        return ans;
    }
}