class Solution {
    public int maxVowels(String s, int k) {
        int max_length = 0;
        int count = 0;
        int vowels = 0;
        int left =0;
        for(int i =0;i<s.length();i++){
            count++;
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                vowels++;
            }
            if(count==k){
                count--;
                char chr = s.charAt(left);
                left++;
                max_length = Math.max(max_length,vowels);
                if(chr=='a'||chr=='e'|| chr=='i'|| chr=='o'||chr=='u'){
                    vowels--;
                }
            }
        }
        return max_length;
    }
}