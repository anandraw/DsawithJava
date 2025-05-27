package GggeksForGeeks;

//Strings Rotations of Each Other
public class Day19 {
    public static void main(String[] args) {
        String s1 = "abcd",s2 = "cdab";
        boolean b = areRotations(s1, s2);
        System.out.println(b);
    }

    public static boolean areRotations(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//        return (s1 + s1).contains(s2);

        String txt = s1 + s1;
        String pat = s2;

        // search the pattern string s2 in the concatenation string
        int n = txt.length();
        int m = pat.length();

        // Create lps[] that will hold the longest prefix suffix
        // values for pattern
        int[] lps = computeLPSArray(pat);

        int i = 0;
        int j = 0;
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }

            if (j == m) {
                return true;
            }

            // Mismatch after j matches
            else if (i < n && pat.charAt(j) != txt.charAt(i)) {

                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return false;
    }
    static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];

        // Length of the previous longest prefix suffix
        int len = 0;

        // lps[0] is always 0
        lps[0] = 0;

        // loop calculates lps[i] for i = 1 to n-1
        int i = 1;
        while (i < n) {

            // If the characters match, increment len
            // and extend the matching prefix
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }

            // If there is a mismatch
            else {

                // If len is not zero, update len to
                // last known prefix length
                if (len != 0) {
                    len = lps[len - 1];
                }

                // No prefix matches, set lps[i] = 0
                // and move to the next character
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
        }
}

