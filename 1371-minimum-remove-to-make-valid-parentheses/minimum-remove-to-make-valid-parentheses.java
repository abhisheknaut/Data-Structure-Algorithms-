class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0 ;i<s.length();i++){
            if(!stk.isEmpty() && s.charAt(stk.peek())== '(' && s.charAt(i)==')'){
                stk.pop();
                continue;
            }
            if (s.charAt(i)=='(' || s.charAt(i)==')') {
                stk.push(i);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while(!stk.isEmpty()){
            sb.deleteCharAt(stk.pop());
        }
        return sb.toString();
    }
}