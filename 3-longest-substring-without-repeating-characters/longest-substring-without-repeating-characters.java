class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxNum = Integer.MIN_VALUE;
        HashMap <Character,Integer > hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
           if(hm.containsKey(s.charAt(i))){
            left = Math.max(left, hm.get(s.charAt(i))+1);
           }
           hm.put(s.charAt(i), i);
           maxNum = Math.max(maxNum, i-left+1);
        }
        return maxNum= maxNum == Integer.MIN_VALUE ?0 : maxNum;
    }
}
