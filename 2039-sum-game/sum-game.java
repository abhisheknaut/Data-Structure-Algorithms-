class Solution {
    public boolean sumGame(String num) {
        int half = num.length() / 2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < half; i++) {

            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = half; i < num.length(); i++) {

            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        // Odd number of ? → Alice wins
        if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }

        // Even number of ?
        return leftSum - rightSum
                != 9 * (rightQ - leftQ) / 2;
    }
}