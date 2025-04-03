package SlidingWindow;

public class MaximumNumberOfVowels {
    public static void main(String[] args) {
         String s = "leetcode"; int k = 3;
         int ans = maxVowels(s,k);
         System.out.println(ans);

    }
    public static int maxVowels(String s, int k) {
        int i = 0, j = 0;
        int maxV = 0;
        int count = 0;

        while (j < s.length()) {
            if (isVowel(s.charAt(j))) {
                count++;
            }

            if (j - i + 1 == k) {
                maxV = Math.max(maxV, count);
                if (isVowel(s.charAt(i))) {
                    count--; // Remove leftmost character if it's a vowel
                }
                i++;
            }

            j++;
        }
        return maxV;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
