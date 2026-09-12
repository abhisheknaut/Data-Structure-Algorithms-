class Solution {
    public int[] replaceElements(int[] arr) {
        int [] num = new int[arr.length];
        for(int i =0 ;i<arr.length;i++){
            int Max = -1;
            for(int j = i+1;j<arr.length;j++){
                Max = Math.max(Max,arr[j]);
            }
            num[i] = Max;
        }
        return num;
    }
}