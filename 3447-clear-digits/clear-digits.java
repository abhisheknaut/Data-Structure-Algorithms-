class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
            i++;
        }

        String ans="";
        while(!st.isEmpty()){
            ans = st.pop()+ ans;
        }
        return ans;
    }
}