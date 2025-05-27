package Greedy;

public class BreakPalindorme {
    public static void main(String[] args) {
         String s= "aabaa";
         String ans = brealPalndrome(s);
        System.out.println(ans);

    }
    static String brealPalndrome(String str) {
        int n = str.length();

        // if string having only one char
        if (n == 1) return ""; // for ex 'a'

        char[] chars = str.toCharArray();
        for (int i = 0; i < n / 2; i++) {  // we only check for half length bcz half of legnth is mirror img
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }

        }
        chars[n - 1] = 'b';
        return new String(chars); // if not a is found or may not able to change th char
        // then simply change the lasr char 'aaaa' - simple change 'aaab';
    }
}
