class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[n-k+1];
        int count = 0;
        int j =0;
        for(int i =0;i<n;i++){
            count++;
            while(!dq.isEmpty() && nums[dq.peekLast()] <=nums[i]){
                dq.pollLast();
            }

            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            dq.offerLast(i);
            if(count==k){
                arr[j] = nums[dq.peekFirst()];
                j++;
                count--;
            }
        }
        return arr;
    }
}