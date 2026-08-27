class Solution {
    public int beautySum(String s) {
    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
    HashMap <Character,Integer>hm = new HashMap<>();
      for (int j = i; j <s.length(); j++) {
        hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)+1);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(char key : hm.keySet()){
            max= Math.max(max,hm.get(key));
            min= Math.min(min,hm.get(key));
          }
          ans += (max-min); 
       }
    }
    return ans;
    }
}