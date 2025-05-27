package RecursionAndBacktracking.medium;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(7);
        reverse(stack);
        System.out.println(stack.peek());

    }

    static void reverse(Stack<Integer> stack){
         // base case
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack); // Recursively reverse the remaining stack

        // Move the top element to the bottom of the stack
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        stack.push(top); // Push the top element at the bottom

        // Push back the remaining elements
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }
}
