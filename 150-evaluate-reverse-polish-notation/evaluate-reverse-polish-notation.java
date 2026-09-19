class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
        
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int firstTop = st.pop();
                int sec = st.pop(); 
                
                if (s.equals("+")) st.push(sec + firstTop);
                else if (s.equals("-")) st.push(sec - firstTop);
                else if (s.equals("*")) st.push(sec * firstTop);
                else if (s.equals("/")) st.push(sec / firstTop);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.pop();
    }
}