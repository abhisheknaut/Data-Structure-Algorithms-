class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int num = Integer.MIN_VALUE;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }if(s.charAt(i)==')'){
                count--;
            }
            num = Math.max(num , count);
        }
        return num;
    }
}