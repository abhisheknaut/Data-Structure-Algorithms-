class Solution {
    public int[] findArray(int[] pref) {
        int []num = new int[pref.length];
        num[0] = pref[0];
        for(int i =1;i<num.length;i++){
            num[i] = pref[i-1]^pref[i];
        } 
        return num;
    }
}