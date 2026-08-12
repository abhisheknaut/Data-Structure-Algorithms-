class Solution {
    public boolean detectCapitalUse(String word) {
         String ch = "";
        String chr = "";
        String uperletter = word.toUpperCase();
        String Lowerletter = word.toLowerCase();
        ch+=Character.toUpperCase(word.charAt(0));
        chr+=Character.toUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            ch += Character.toUpperCase(word.charAt(i));
            chr += Character.toLowerCase((word.charAt(i)));
        }

        if(word!=uperletter && word !=Lowerletter && !word.equals(ch) && !word.equals(chr)){
            return false;
        }
        return true;
    }
}   