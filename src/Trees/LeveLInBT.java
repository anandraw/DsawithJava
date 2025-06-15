package Trees;

import java.util.*;

public class LeveLInBT {

    // Function to print elements of a list
    static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.rigth = new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);

        LeveLInBT leveLInBT = new LeveLInBT();
        ArrayList<ArrayList<Integer>> result = leveLInBT.levelOrder(root);

        System.out.println("Level Order Traversal of Tree:");

        for (List<Integer> level : result) {
            printList(level);
        }
    }
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            // add the notes of current level
            ArrayList<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                currLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.rigth != null) {
                    queue.add(node.rigth);
                }
            }
            ans.add(currLevel);
        }
        return ans;
    }
}
