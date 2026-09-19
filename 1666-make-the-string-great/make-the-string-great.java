class Solution {
    public String makeGood(String s) {
         Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            String k = String.valueOf(c);
            if(!st.isEmpty() && Math.abs(k.compareTo(String.valueOf(st.peek()))) ==32){
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