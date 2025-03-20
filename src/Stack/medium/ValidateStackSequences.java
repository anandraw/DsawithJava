package Stack.medium;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
       int[] pushed = {1,2,3,4,5}, popped = {4,5,3,1,2};
        boolean b = validateStackSequences(pushed, popped);
        System.out.println(b);
    }
    public static  boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for (int ele:pushed){
            stack.push(ele);
            while (!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
