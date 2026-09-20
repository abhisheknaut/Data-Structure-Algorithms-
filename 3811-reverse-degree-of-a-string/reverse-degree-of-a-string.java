class Solution {
    public int reverseDegree(String s) {
        int position = 1;
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            int value = "z".compareTo(String.valueOf(s.charAt(i))) +1;
            value = value * position;
            position++;
            sum +=value;
        }
        return sum;
    }
}