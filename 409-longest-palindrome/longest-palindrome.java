class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character ,Integer>hm = new HashMap<>();
            int length = 0;
            for(int i = 0 ;i < s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            int mid = 0;

            for (char key : hm.keySet()) {
                int ch = hm.get(key);
                if(ch==1){
                    mid = ch;
                }
                if(ch%2==0){
                    length += ch;
                } 
                if(ch%2!=0){
                   mid =1;
                   length +=ch -1;
                }
            }
            length = mid+length;
            return length;
    }
}