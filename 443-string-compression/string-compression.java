class Solution {
    public int compress(char[] chars) {
      HashMap<Character , Integer> hm = new HashMap<>();

      String s = "";
      hm.put(chars[0],1);
      for (int i = 1; i <chars.length; i++) {
         if(!hm.containsKey(chars[i])){
            s +=chars[i-1];
            if(hm.get(chars[i-1])>1){
               s += hm.get(chars[i-1]);
            }
            hm.remove(chars[i-1]);
            hm.put(chars[i],1);
         }else{
            hm.put(chars[i], hm.getOrDefault(chars[i], 0) + 1);
         }
      }

      
      
      for(char key : hm.keySet()){
         s+=key;
         
         if(hm.get(key)>1){
            s += hm.get(key);
         }
      }
      for (int i = 0; i < s.length(); i++) {
         chars[i] = s.charAt(i);
      }
      
      for (int i = 0; i < chars.length; i++) {
         System.out.println(chars[i]);
      }
      return s.length();
    }
}