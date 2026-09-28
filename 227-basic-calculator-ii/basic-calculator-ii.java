class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        char sign  = '+';
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                ans  = ans *10+(ch-'0');
            }
            if((!Character.isDigit(ch)&& ch!=' ')|| i ==s.length()-1){
                if(sign =='*'){
                     st.push(st.pop()* ans);
                    
                } 
                else if(sign=='/'){
                   st.push(st.pop()/ans);
                } 
                else if(sign=='+'){
                    st.push(ans);
                }else if(sign=='-'){
                    st.push(-ans);
                }
                sign = ch;
                ans =0;
            }
        }
        int num=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}