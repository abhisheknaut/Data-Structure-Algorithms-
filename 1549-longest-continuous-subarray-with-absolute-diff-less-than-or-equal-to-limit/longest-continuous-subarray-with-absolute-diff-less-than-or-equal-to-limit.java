class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left =0;    
        Deque<Integer> dq_max = new ArrayDeque<>();
        Deque<Integer> dq_min = new ArrayDeque<>();
        int max = 0;
        for(int right =0; right<nums.length;right++){
            while(!dq_max.isEmpty() && nums[dq_max.peekLast()] <= nums[right]){
                dq_max.pollLast();
            }
            dq_max.offerLast(right);
            while(!dq_min.isEmpty() && nums[dq_min.peekLast()] >= nums[right]){
                dq_min.pollLast();
            }
            dq_min.offerLast(right);

            while (nums[dq_max.peekFirst()]-nums[dq_min.peekFirst()] > limit) {
                left++;
                if (dq_max.peekFirst() < left)
                    dq_max.removeFirst();

                if (dq_min.peekFirst() < left)
                    dq_min.removeFirst();
                
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}