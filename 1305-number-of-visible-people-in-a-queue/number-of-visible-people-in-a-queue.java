class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int arr[] =  new int[heights.length];
        for(int i =heights.length-1;i>=0;i--){
            int prev =0;
            int depth = 0;
            while(!stk.isEmpty() && stk.peek() <= heights[i]){
                prev = stk.pop();
                depth++;
            }
            if(!stk.isEmpty()) depth++;
            arr[i] = depth;
            stk.push(heights[i]);
        }
        return arr;
    }
}