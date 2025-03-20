package Stack.medium;

import java.util.Stack;

public class CheckParenthesesStringCanBeValid {
    public static void main(String[] args) {
        String s = "(((())(((())", locked = "111111010111";
        boolean b = canBeValid(s, locked);
        System.out.println(b);
    }
    public static boolean canBeValid(String s, String locked) {
        int n = s.length();

        if (n % 2 != 0) { // odd
            return false;
        }

        Stack<Integer> open = new Stack<>();
        Stack<Integer> openClose = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                openClose.push(i);
            } else if (s.charAt(i) == '(') {
                open.push(i);
            } else if (s.charAt(i) == ')') {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!openClose.isEmpty()) {
                    openClose.pop();
                } else {
                    return false;
                }
            }
        }

        while (!open.isEmpty() && !openClose.isEmpty() && open.peek() < openClose.peek()) {
            open.pop();
            openClose.pop();
        }

        return open.isEmpty(); // true
    }
}
