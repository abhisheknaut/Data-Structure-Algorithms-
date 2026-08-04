class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int arr[]  = new int[nums2.length];
        int index = 0;
        for(int i = 0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                arr[index++] =nums2[j];
                set.remove(nums2[j]);
            }
        }
        return Arrays.copyOf(arr,index) ;
    }
}