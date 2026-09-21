class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        int n = 0;
        while(i < word.length()){
            if(word.charAt(i)==ch){
                n = i;
                break;
            }
            i++;
        }

        String k = "";
        for(int j =0 ; j<word.length() ; j++){
            if(j <= n){
                st.push(word.charAt(j));
            }else{
                k += word.charAt(j);
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans  += st.pop();
        }
        return ans+k;
    }
}