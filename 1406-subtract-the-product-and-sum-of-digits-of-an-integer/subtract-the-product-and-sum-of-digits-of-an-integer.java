class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum = 0;
        while(n!=0){
            int x = n%10;
            mul = mul*x;
            sum =  sum+x;
            n = n/10;
        }
        return mul-sum;
    }
}