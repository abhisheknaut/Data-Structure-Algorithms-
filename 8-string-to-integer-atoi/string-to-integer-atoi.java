class Solution {
    public int myAtoi(String s) {
    s = s.trim();

    if (s.length() == 0) {
        return 0;
    }

    int sign = 1;
    int i = 0;
    int ans = 0;

    // sign
    if (s.charAt(i) == '+' || s.charAt(i) == '-') {
        if (s.charAt(i) == '-') {
            sign = -1;
        }
        i++;
    }

    // digits
    while (i < s.length() && Character.isDigit(s.charAt(i))) {

        int digit = s.charAt(i) - '0';

        // overflow
        if (ans > Integer.MAX_VALUE / 10 ||
            (ans == Integer.MAX_VALUE / 10 && digit > 7)) {

            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        ans = ans * 10 + digit;
        i++;
    }

    return ans * sign;
    }
}