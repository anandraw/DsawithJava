package String.easy;

public class LongestPalindromeSimple {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "banana";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
    }

}
