class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) +1);
        }
        for(int key : hm.keySet()){
            if(hm1.containsKey(hm.get(key))){
                return false;
            }
            hm1.put(hm.get(key),0);
        }
        return true;
    }
}