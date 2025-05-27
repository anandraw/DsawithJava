package GggeksForGeeks.Ocnntest;

import java.util.Stack;

public class StringAfterOprations {
    public static void main(String[] args) {
        String input = "babbbab";
        String result = processString(input);
        System.out.println(result);  // Should print "aba"

    }
    public static String processString(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean changed;

        do {
            changed = false;  // Reset the flag each time

            // Traverse from index 1 to len-1
            for (int i = 1; i < sb.length() - 1; i++) {
                // Check if characters at i-1 and i+1 are the same
                if (sb.charAt(i - 1) == sb.charAt(i + 1)) {
                    // If so, delete the characters at i-1 and i+1
                    sb.deleteCharAt(i + 1);
                    sb.deleteCharAt(i - 1);
                    changed = true;  // Mark that a change has occurred
                    break;  // Break the loop to restart from the beginning
                }
            }
        } while (changed);  // Continue if any changes were made in the current pass

        return sb.toString();
    }
}
