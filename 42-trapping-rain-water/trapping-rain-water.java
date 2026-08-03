class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int leftArr[] = new int[n];
        leftArr[0] = height[0];

        for(int i= 1;i<n;i++){
            leftArr[i] = Math.max(height[i],leftArr[i-1]);
        }

        int RightArr[] = new int[n];
        RightArr[n-1] = height[n-1];

        for(int i= n-2;i>=0;i--){
            RightArr[i] = Math.max(height[i],RightArr[i+1]);
        }

        int traped_water = 0;
        for(int i= 0; i<n;i++){
            int waterlevel = Math.min(leftArr[i],RightArr[i]);
            traped_water += (waterlevel-height[i]);
        }
        return traped_water;
    }
}