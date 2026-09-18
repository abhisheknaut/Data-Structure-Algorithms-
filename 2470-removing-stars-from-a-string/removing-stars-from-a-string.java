class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }

        String k = "";

        while(!st.isEmpty()){
            k = st.pop() + k;
        }
        return k;
    }
}