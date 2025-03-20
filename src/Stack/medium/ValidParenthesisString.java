package Stack.medium;

import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        String  s = "(*))(*";
        boolean ans = checkValidString(s);
        System.out.println(ans);


    }
    //using two stack
    public static boolean checkValidString(String s) {

        Stack<Integer> openStack = new Stack<>(); // Stores indices of '('
        Stack<Integer> starStack = new Stack<>(); // Stores indices of '*'

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else { // c == ')'
                if (!openStack.isEmpty()) {
                    openStack.pop(); // Match ')' with '('
                } else if (!starStack.isEmpty()) {
                    starStack.pop(); // Match ')' with '*'
                } else {
                    return false; // No matching '(' or '*', invalid string
                }
            }
        }

        // Now match remaining '(' with '*'
        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            // Ensure '(' appears before '*' in the string
            if (openStack.pop() > starStack.pop()) {
                return false;
            }
        }

        return openStack.isEmpty();

    }
}
