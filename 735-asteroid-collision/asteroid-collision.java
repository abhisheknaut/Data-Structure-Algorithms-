class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            boolean destroy = false;

            while(!st.isEmpty() && st.peek()>0 && num<0){
                if(Math.abs(num)>st.peek()){
                    st.pop();
                    continue;
                }
                else if(Math.abs(num)==st.peek()){
                    st.pop();
                    destroy = true;
                    break;
                }else{
                    destroy =true;
                    break;
                }
            }
            if(!destroy){
                st.push(num);
            }
        }
        int [] arr = new int[st.size()];
        int i = arr.length-1;
        while(!st.isEmpty()){
            arr[i] = st.pop();
            i--;
        }
        return arr;
    }

}