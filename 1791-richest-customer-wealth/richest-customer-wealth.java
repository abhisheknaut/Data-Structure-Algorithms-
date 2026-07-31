class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j =0;j<accounts[0].length;j++){
                sum += accounts[i][j];
            }
            maxSum  = Math.max(maxSum,sum);
            sum = 0;
        }
        return maxSum;
    }

}