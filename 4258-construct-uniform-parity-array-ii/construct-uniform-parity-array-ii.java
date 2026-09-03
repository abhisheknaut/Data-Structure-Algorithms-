class Solution {
    public boolean uniformArray(int[] nums1) {
        int Smallestodd = Integer.MAX_VALUE;
        boolean odd = true;
        boolean even = true;
        for(int i =0 ;i<nums1.length;i++){
            if(nums1[i]%2==0){
                odd = false;
            }else{
                even = false;
            }
        }
        if(even==true && odd==false){
            return true;
        }
        if(even==false && odd==true){
            return true;
        }
        for(int i =0 ;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                Smallestodd = Math.min(Smallestodd, nums1[i]);
            }
        }

        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                if(nums1[i]<Smallestodd){
                    return false;
                }
            }
        }
        return true;
    }
}