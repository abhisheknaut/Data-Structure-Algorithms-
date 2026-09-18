class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='#' && !st.isEmpty()){
                st.pop();
            }if(Character.isLetter(c)){
                st.push(c);
            }
        }

        String k = "";
        while(!st.isEmpty()){
            k = st.pop() +k;
            
        }

        for(char c : t.toCharArray()){
            if(c=='#' && !st.isEmpty()){
                st.pop();
            }
            if(Character.isLetter(c)){
                st.push(c);
            }
        }

        String l = "";
        while(st.size()>0){
            l = st.pop() + l;
        }
        return k.equals(l);
    }
}