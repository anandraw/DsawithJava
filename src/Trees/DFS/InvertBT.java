package Trees.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBT {
    public static void main(String[] args) {
        Node node = new Node(4);
        node.left=new Node(2);
        node.right=new Node(7);
        node.left.left=new Node(1);
        node.left.right=new Node(3);
        node.right.left=new Node(6);
        node.right.right=new Node(9);

        System.out.println("Original Tree:");
        printTree(node);

        Node node1 = invertTree(node);

        System.out.println("\nInverted Tree:");
        printTree(node1);

    }
    public static Node invertTree(Node root) {
        if (root==null) return null;

        Node left=invertTree(root.left);
        Node right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;

    }

    public static void printTree(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // to print level by level
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println(); // new line for each level
        }
    }
}
