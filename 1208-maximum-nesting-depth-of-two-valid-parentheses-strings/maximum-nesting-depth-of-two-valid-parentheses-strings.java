class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Character> st = new Stack<>();
        int []arr = new int[seq.length()];
        int depth = 0;
        for(int i =0 ;i<seq.length();i++){
            if(!st.isEmpty() && st.peek()=='(' && seq.charAt(i)=='('){
                depth++;
            }
            arr[i]= depth%2 ==0 ? 0 : 1 ;
            if(!st.isEmpty() && st.peek()=='(' && seq.charAt(i)==')'){
                st.pop();
                depth--;
            }
            else{
                st.push(seq.charAt(i));
            }
        }
        
        return arr;
    }
}