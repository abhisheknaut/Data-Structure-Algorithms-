class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int j =0 ;
        Queue<Integer> q = new LinkedList<>();
        for(int i  =0 ;i<students.length;i++){
            q.offer(students[i]);
        }
        int round =0;
        while(!q.isEmpty()){
            if(round>q.size()){
                break;
            }
            int l = q.poll();
            if(l==sandwiches[j]){
                j++;
                round = 0 ;
            }
            else{
                round++;
                q.offer(l);
            }
        }
        return q.size();
    }
}