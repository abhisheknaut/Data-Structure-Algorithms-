class Solution {
    public int maxDepth(String s) {
        int bracket = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bracket++;
                max = Math.max(bracket,max);
            }
            if(s.charAt(i)==')') bracket--;
        }
        return max==Integer.MIN_VALUE? 0 : max;
    }
}