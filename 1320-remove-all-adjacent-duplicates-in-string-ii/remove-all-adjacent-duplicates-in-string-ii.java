class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(int i =0 ;i<s.length();i++){
            int chr = (int) s.charAt(i);
            if(!st.isEmpty() && st.peek()[0] == chr){
                st.peek()[1]++;
                if(st.peek()[1]==k){
                    st.pop();
                }
            }else{
                st.push(new int[] {chr,1});
            }
        }
        String ans="";
        while(!st.isEmpty()){
            int n = st.peek()[1];
            char b =(char) st.pop()[0];
            for(int i =0;i<n;i++){
                ans = b+ans;
            }
        }
        return ans;
    }
}