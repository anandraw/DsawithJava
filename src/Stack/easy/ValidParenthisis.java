package Stack.easy;

import java.util.Stack;

public class ValidParenthisis {
    public static void main(String[] args) {
            String s = "[{()}]"; // true
            boolean ans  = isBalanced(s);
            System.out.println(ans);
    }
    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        char[] charArr =  s.toCharArray();

        for (char ch : charArr ){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) return false;
                char ele = stack.pop();
                if((ch==')' && ele=='(')  || (ch=='}' && ele=='{') || (ch==']' && ele=='[')){
                    continue;
                }else{
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
