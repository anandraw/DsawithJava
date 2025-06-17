package Trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BTZigzagLevelTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BTZigzagLevelTraversal obj = new BTZigzagLevelTraversal();
        List<List<Integer>> zigzagOrder = obj.zigzagLevelOrder(root);

        for (List<Integer> level : zigzagOrder) {
            System.out.println(level);
        }

    }
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<Node> nodeDeque = new LinkedList<>();
        nodeDeque.offer(root);
        boolean reverse = false;

        while (!nodeDeque.isEmpty()) {
            int levelSize = nodeDeque.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    Node currNode = nodeDeque.pollFirst();
                    currLevel.add(currNode.val);
                    if (currNode.left != null) nodeDeque.addLast(currNode.left);
                    if (currNode.right != null) nodeDeque.addLast(currNode.right);
                } else {
                    Node currNode = nodeDeque.pollLast();
                    currLevel.add(currNode.val);
                    if (currNode.right != null) nodeDeque.addFirst(currNode.right);
                    if (currNode.left != null) nodeDeque.addFirst(currNode.left);
                }
            }
            result.add(currLevel);
            reverse = !reverse;
        }
        return result;
    }
}
