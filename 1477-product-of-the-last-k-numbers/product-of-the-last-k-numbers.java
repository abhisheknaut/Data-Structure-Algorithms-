class ProductOfNumbers {
    ArrayList<Integer> st = new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        st.add(num);
    }
    
    public int getProduct(int k) {
        int times = 1;
        int product = 1;
        for(int i = st.size()-1;i>=0;i--){
            if(times>k){
                break;
            }
            product *= st.get(i);
            times++;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */