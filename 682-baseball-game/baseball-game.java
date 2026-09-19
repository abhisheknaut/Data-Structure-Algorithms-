class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        for(String num : operations){
            if(num.equals("C")){
                st.pop();
            }else if(num.equals("D")){
                st.push(st.peek() * 2);
            }
            else if(num.equals("+")){
                int top = st.pop();
                int sec  =st.pop();
                st.push(sec);
                st.push(top);
                st.push(top+sec);
            }else{
                 st.push(Integer.parseInt(num));
            }
        }
        int allsum = 0;    
        while(!st.isEmpty()){
            allsum +=st.pop();
        }
        
        return allsum;
    }
}