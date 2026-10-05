class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st  = new Stack<>();
        int n = s.length();
        int ans = 0;
        st.push(0);
        for(int i= 0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else if(!st.isEmpty()){
                int pop = st.pop();
                int inner  = pop==0? 1 : 2 * pop;
                inner +=st.pop();
                st.push(inner);
                ans = inner;
            }
        }
        
        return ans;
    }
}