package Stack;

public class StackUsingArray {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(12);
        s.push(13);
        s.push(14);
        System.out.println("top of the stack before deleteting any element : "+ s.top());
        System.out.println("size of the stack before deleting any element : "+ s.size());
        System.out.println("the element deleted is : " + s.pop());
        System.out.println("top of the stack before deleteting any element : "+ s.top());
        System.out.println("size of the stack before deleting any element : "+ s.size());

    }

    static class Stack{

        int size=100;
        int[] arr = new int[size];
        int top=-1;

        void push(int ele){
            top++;
            arr[top]=ele;
        }

        int pop(){
            int ele = arr[top];
            top--;
            return ele;
        }
        int top(){
            return arr[top];
        }

        int size(){
            return top+1;
        }

    }
}


