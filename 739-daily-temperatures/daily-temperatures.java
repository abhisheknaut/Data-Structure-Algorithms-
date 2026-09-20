class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int []arr  = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i= temperatures.length-1 ;i>=0 ;i--){
            while(st.size() >0  && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] =st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}