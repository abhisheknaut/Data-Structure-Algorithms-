class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        min = Math.min(value,min);
        st1.push(min);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st1.pop();
            st.pop();
        }
        if(!st1.isEmpty()){
            min = st1.peek();
        }else{
            min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
       return !st.isEmpty()? st.peek() :0; 
    }
    
    public int getMin() {
        return st1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */