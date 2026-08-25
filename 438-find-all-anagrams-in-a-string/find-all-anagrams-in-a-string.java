class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> list = new ArrayList<>();
      int plength = p.length();
      int slength = s.length();
      int loop_length = s.length()-plength;
      char[] ans = p.toCharArray();
      Arrays.sort(ans);
      String sortedp = new String(ans);
      for (int i = 0; i <=loop_length; i++) {
          String str = s.substring(i,plength);
          char [] arr = str.toCharArray();
          Arrays.sort(arr);
          String sorted = new String(arr);
          if(sorted.equals(sortedp)){
            list.add(i);
          }
          plength++;
      }

      return list;
    }
}