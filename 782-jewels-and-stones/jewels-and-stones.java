class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int count = 0;
        HashMap <Character,Integer> hm = new HashMap<>();

        for(int i = 0;i<n;i++){
            hm.put(jewels.charAt(i),i);
        }
        for(int i = 0;i<stones.length();i++){
            if(hm.containsKey(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}