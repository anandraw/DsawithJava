package GggeksForGeeks;

public class Day14 {
    public static void main(String[] args) {
        String s = "  -00123";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;
// Ignore leading whitespaces
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
// Store the sign of number
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }
// Construct the number digit by digit
        while (idx < s.length() && s.charAt(idx) >= '0'
                && s.charAt(idx) <= '9') {

            // Handling overflow/underflow test case
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append current digit to the result
            res = 10 * res + (s.charAt(idx++) - '0');
        }
        return res * sign;
    }
}
