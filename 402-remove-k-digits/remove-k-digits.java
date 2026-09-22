class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0 ;i<num.length();i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) -'0' && k>0){
                k--;
                st.pop();
            }
            if(!st.isEmpty() || num.charAt(i)-'0'!=0){
                 st.push(num.charAt(i)-'0');
            }
        }
        while(!st.isEmpty() && k!=0){
            k--;
            st.pop();
        }
        String l = "";
        while(!st.isEmpty()){
            l = st.pop() +l;
        }
        if(l.equals("")){
            return "0";
        }
        return l;
    }
}