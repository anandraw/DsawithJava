package String.easy;

public class MetaStrings {
    public static void main(String[] args) {
        String S1 = "geeks";
        String S2 = "seekg";
        boolean b = metaStrings(S1, S2);
        System.out.println(b);
    }

     static boolean metaStrings(String S1, String S2)
    {
        if (S1.length() != S2.length()) {
            return false;
        }

        int count = 0;
        int[] mismatchIndices = new int[2];


        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                if (count >= 2) {
                    return false;
                }
                mismatchIndices[count] = i;
                count++;
            }
        }


        if (count == 2) {
            int i = mismatchIndices[0];
            int j = mismatchIndices[1];
            return S1.charAt(i) == S2.charAt(j) && S1.charAt(j) == S2.charAt(i);
        }

        return false;
        }
}
