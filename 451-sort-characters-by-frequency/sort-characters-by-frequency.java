class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer>hm = new HashMap<>();
        String str = "";
        for(int i =0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        while(!hm.isEmpty()){
            char ch = ' ';
            int freq = Integer.MIN_VALUE;
            for(char key : hm.keySet()){
                if(freq<hm.get(key)){
                    freq = hm.get(key);
                    ch = key;
                }
            }

            for(int i = 0; i<freq;i++){
                str+=ch;
            }
            hm.remove(ch);
        }
        return str;
    }
}