class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i =0 ;i<t.length();i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i =0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)-1);
            }
        }
        char ch = '\0';
        for(char key : hm.keySet()){
            if(hm.get(key)>0){
                ch = key;
            }
        }
        return ch;
    }
}