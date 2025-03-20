package Stack.medium;

import java.util.Stack;

// input=(abcd) and output="dcba"
public class ReverseSubstringsBetPairParentheses {
    public static void main(String[] args) {
        String s = "(u(love)i)";
        String result = reverseParenthese(s);
        System.out.println(result);

    }
    public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder builer = new StringBuilder();

        char[] ch = s.toCharArray();
        for (char c:ch){
            if (c=='('){
                stack.push(builer.length());
            }else if (c==')'){
                int start = stack.pop();
                revers(builer,start,builer.length()-1);
            }else {
                builer.append(c);
            }
        }
        return builer.toString();
    }

    private static void revers(StringBuilder str, int start, int end) {
        while (start<end){
            char temp = str.charAt(start);
            str.setCharAt(start++, str.charAt(end));
            str.setCharAt(end--, temp);
        }
    }


    ///anotehr apporach
    public static String reverseParenthese(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder curr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c=='('){
                stack.push(curr);
                curr = new StringBuilder();
            } else if (c==')') {
                StringBuilder last = stack.pop();
                curr.reverse();
                last.append(curr);
                curr=last;
            }else{
                curr.append(c);
            }
        }

        return curr.toString();

    }
}
