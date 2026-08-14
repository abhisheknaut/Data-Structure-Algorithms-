class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        };

       int length = needle.length();
         for (int i = 0; i <=haystack.length()-length; i++) {
            String chr = haystack.substring(i,i+length);
            if(needle.equals(chr)){
                return i;
            }
        }
        return -1;
    }
}