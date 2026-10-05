class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    ArrayList<Integer> arr = new ArrayList<>();
    public int ping(int t) {
        int n = 0;
        arr.add(t);
        for(int i =0 ;i<arr.size();i++){
            if(arr.get(i) >= t-3000  && arr.get(i) <=t){
                n++;
            }
        }
        return n;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */