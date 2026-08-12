class Solution {
    public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);

    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u';
}
   public static String reverseVowels(String s) {
        int left =0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
    
        while(left<right){
            char ch =arr[left];
            char chr = arr[right];

            if(!isVowel(ch)){
                left++;
            }
            else if(!isVowel(chr)){
                right--;
            }else{
                char temp = arr[left];  
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr); 
    }

}