class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];

        for(int i=0;i<words.length;i++){
            int num = words[i].length()-1;
            int position = words[i].charAt(num) - '0';
            arr[position-1] = words[i].substring(0,num);    
        }
        String l =  String.join(" ",arr);
        return l;
    }
}