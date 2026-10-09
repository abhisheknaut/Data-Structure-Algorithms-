class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int[] prefix = new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            prefix[i+1] = nums[i]+prefix[i];
        }
        int res = nums.length+1;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<prefix.length;i++){
            while(!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) {
                res = Math.min(res, i - dq.pollFirst());
            }
            while(!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.add(i);
        }
        return res<= nums.length ? res:-1;
    }
}