class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arr_alice = convert(arriveAlice);
        int arr_bob = convert(arriveBob);
        int leave_alice = convert(leaveAlice);
        int leave_bob= convert(leaveBob);
        
        int start = Math.max(arr_alice , arr_bob);
        int end= Math.min(leave_alice , leave_bob);

        if(start>end) return 0;
        return end-start+1;
    }
     private int convert(String s){
        int month = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3));
        return (275 * month) /9 -2 *((month+9)/12) + day-30;
    }
}