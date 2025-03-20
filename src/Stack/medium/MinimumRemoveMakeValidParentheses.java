package Stack.medium;


import java.util.HashSet;
import java.util.Stack;

public class MinimumRemoveMakeValidParentheses {
    public static void main(String[] args) {
        String  s = "lee(t(c)o)de)";
        String ans  = minRemoveToMakeValid(s);
        System.out.println(ans);

    }
    public  static String minRemoveToMakeValid(String s) {

        int n = s.length();

        HashSet<Integer> toRemove = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(i);
            else if(ch == ')') {
                if(st.isEmpty())
                    toRemove.add(i);
                else
                    st.pop();
            }
        }

        while(!st.isEmpty())
            toRemove.add(st.pop());

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(!toRemove.contains(i))
                result.append(s.charAt(i));
        }

        return result.toString();
    }
}
