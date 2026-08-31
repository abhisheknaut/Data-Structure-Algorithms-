class Solution {
    public  String longestPalindrome(String s) {
        String odd = oddLength(s);
        String even = evenLength(s);

        return odd.length()>even.length() ? odd : even;
    }
    public  String evenLength(String s) {
        int maxLength =0;
        int start=0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                int length = right - left - 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = left + 1;
                }
            }
        }
        return s.substring(start, start+maxLength);
        }

        public  String oddLength(String s) {
        int maxLength = 0;
        int start=0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                int length = right - left - 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = left + 1;
                }
            }
        }
        return s.substring(start, start+maxLength);
        }
}