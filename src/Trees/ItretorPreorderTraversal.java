package Trees;

import java.util.ArrayList;
import java.util.Stack;

// using stack
//             1
//           /   \
//           2     3
//           /  \
//           4    5

//Output: 1 2 4 5 3

public class ItretorPreorderTraversal {

    // Function to print elements of a list
    static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ItretorPreorderTraversal i = new ItretorPreorderTraversal();
        ArrayList<Integer> result = i.preOrder(root);

        System.out.println("Level Order Traversal of Tree:");

        for (Integer list:result){
            System.out.print(list+" ");
        }

    }
    public static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root==null) return ans;
        stack.push(root);

        while (!stack.isEmpty()){
           root=stack.pop();
           ans.add(root.val);
           if (root.right !=null){
               stack.push(root.right);
           }
           if (root.left!=null){
               stack.push(root.left);
           }

        }
        return ans;
    }
}
