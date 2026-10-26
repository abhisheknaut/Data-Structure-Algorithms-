class Solution {
    public int xorOperation(int n, int start) {
        int []num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = start +2 *i;
        }
        int ans= num[0];
        for(int i=1;i<num.length;i++){
            ans ^= num[i];
        }
        return ans;
    }
}