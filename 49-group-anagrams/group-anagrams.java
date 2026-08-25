class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String sorted  =new String(arr);
            hm.putIfAbsent(sorted, new ArrayList<>());
            hm.get(sorted).add(strs[i]);  
        }
        for(String key : hm.keySet()){
         list.add(hm.get(key));
        }
        
        return list;
    }
}