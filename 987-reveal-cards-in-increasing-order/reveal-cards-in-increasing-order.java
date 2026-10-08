class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] num = new int[n];
        Arrays.sort(deck);
        Queue<Integer> q=  new LinkedList<>();

        for(int i =0 ;i<n;i++){
            q.offer(i);
        }
        int j = 0;
        int pop =0;
        while(q.size()>1){
            pop = q.poll();
            num[pop] = deck[j];
            j++;
            q.offer(q.poll());
        }
        num[q.poll()] = deck[j];
        return num;
    }
}
