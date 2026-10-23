class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        String k = "";
        int carry = 0;
        while(i>=0 && j>=0){
            int temp = (a.charAt(i) -'0') + (b.charAt(j)-'0') + carry;
            k = temp%2 +k;
            carry  = temp /2;
            i--;
            j--;
        }
        while(j>=0){
            int temp = b.charAt(j)-'0' +carry;
            k = temp%2 +k;
            carry  = temp /2;
            j--;
        }

        while(i>=0){
            int temp = (a.charAt(i)-'0') +carry;
            k = temp%2 +k;
            carry  = temp /2;
            i--;
        }   
        return carry==1?  '1'+ k : k;
    }
}