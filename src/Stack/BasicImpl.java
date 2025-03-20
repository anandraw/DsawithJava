package Stack;

import java.util.Stack;

public class BasicImpl {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        stach_pop(stack);
        stack_peek(stack);
        stack_search(stack,3);

    }
    static void stack_push(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stach_pop(Stack<Integer> stack){
        System.out.println("stack pop operation");

        for (int i = 0; i <5; i++) {
           Integer ele =  stack.pop();
            System.out.println(ele);
        }
    }
    static void stack_peek(Stack<Integer> stack){
        Integer ele =  stack.peek();
        System.out.println(ele);
    }

    static void stack_search(Stack<Integer> stack,int ele){
        Integer pos = stack.search(ele);
        if (pos==-1){
            System.out.println("element is not found");
        }else{
            System.out.println("element is found at position: "+pos);
        }
    }
}
