class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1;
        int max = 0;

        for(int right = 1;right < s.length();right++){
            int left= right-1;
            if(s.charAt(left)-s.charAt(right)==-1){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max == 0 ? 1 : max;
    }
}