class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map = new HashMap<>();
        // count the frequency of each letter in ransomnote string
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // decrease the frequency 
        for (int i = 0; i < magazine.length(); i++) {
            char ch =magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            // System.out.println(map.get(ch));
            if(map.get(ch)>0){
                return false;
                
            }
        }
        return true;
    }
}