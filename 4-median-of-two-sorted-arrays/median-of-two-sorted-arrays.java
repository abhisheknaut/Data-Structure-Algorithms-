class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int i =0 ;
        int sum = nums1.length+nums2.length;
        int[]arr = new int[sum];
        while(left <nums1.length && right < nums2.length){
            if(nums1[left]<=nums2[right]){
                arr[i] = nums1[left];
                left++;
            }
            else{
                arr[i] = nums2[right];
                right++;
            }
            i++;
        }
        while(left<nums1.length){
            arr[i] = nums1[left];
            i++;
            left++;
        }
        while(right<nums2.length){
            arr[i] = nums2[right];
            right++;
            i++;
        }
        double ans = 0;
        if(sum%2==0){
            ans = Math.abs(arr[sum/2] + arr[(sum/2 -1)]);
            ans = ans /2;
        } else{
           ans =  arr[sum/2];
        }
        return ans;
    }
}