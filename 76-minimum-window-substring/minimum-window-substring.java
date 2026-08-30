class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        HashMap<Character , Integer>hm = new HashMap<>();
        HashMap<Character , Integer>map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)+1);
        }
        int count = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        String str = "";
        for(int right = 0; right<s.length();right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);

            if(hm.containsKey(s.charAt(right)) && map.get(s.charAt(right)) <= hm.get(s.charAt(right))){
                count++;
            }

            while(count==t.length()){
                if(right-left+1<minLength){
                    minLength = right-left+1;
                    start = left;
                }

                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                if (hm.containsKey(s.charAt(left))
                    && map.get(s.charAt(left)) < hm.get(s.charAt(left))) {
                count--;
             }
            left++;
            }   
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
         }

        return s.substring(start,start+minLength);
    }
}