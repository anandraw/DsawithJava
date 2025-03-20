package Stack.easy;

import java.util.Stack;

public class ClearDigits3174 {
    public static void main(String[] args) {
            String s = "cb34";
            String s1 = clearDigits(s);
            System.out.println(s1);
    }
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
        }

}
