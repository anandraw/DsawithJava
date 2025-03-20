package Stack.easy;

import java.util.Stack;

public class NestedDepthOfParenthsis {
    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";
        int ans = maxDepth(s);
        System.out.println(ans);

        int r = maxDepthOptimal(s);
        System.out.println(r);

    }
    public static int maxDepth(String s) {

        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int ans=0;

        for (char c : ch){
            if (c == '(') {
                stack.push(c);
            }else if (c==')'){
                 ans = Math.max(ans, stack.size());
                 stack.pop();
            }
        }
        return ans;
    }

    public static int maxDepthOptimal(String s) {


        char[] ch = s.toCharArray();
        int ans=0, ctOpening=0;

        for (char c : ch){
            if (c == '(') {
               ctOpening++;
            }else if (c==')'){
               ctOpening--;
            }
            ans=Math.max(ans,ctOpening);
        }
        return ans;
    }

}
