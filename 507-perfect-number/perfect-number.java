class Solution {
    public boolean checkPerfectNumber(int num) {
        int div = 0;
        for(int i =1;i<num;i++){
            if(num%i==0){
                div+=i;
            }
        }
        if(div==num){
            return true;
        }
        return false;

    }
}