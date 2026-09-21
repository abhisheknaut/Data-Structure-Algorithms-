class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack <Integer> st = new Stack<>();
        int[] arr = new int[n];

        for(int i = 2* n-1; i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] <=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i%n] = -1;
            }else{
                arr[i%n] = nums[st.peek()];
            }
            st.push(i%n);
        }
        return arr;
    }
}