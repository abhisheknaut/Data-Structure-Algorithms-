class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> min = new ArrayList<>();
        // ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> max= new ArrayList<>();
        int pvt = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                min.add(nums[i]);
            }
            else if(nums[i]>pivot){
                max.add(nums[i]);
            }
            else{
                pvt++;
            }
        }
        // int [] arr = new int[nums.length];
        for(int i = 0;i<min.size();i++){
            nums[i] = min.get(i);
        }
        int n = min.size()+pvt;
        for(int i=min.size();i<n;i++){
            nums[i] = pivot;
        }
        int k =0;
        for(int i = n;i<nums.length;i++){
            nums[i] = max.get(k);
            k++;
        }
        return nums;
    }
}
// min-->3 , equal-->2 , max -->2