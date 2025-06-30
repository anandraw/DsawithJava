package Trees.BFS;

import java.util.*;

class Pair {
    Node node;
    int line;
    Pair(Node n, int h) {
        node = n;
        line = h;
    }
}

public class TopView {
    public static void main(String[] args) {
        Node root = new Node(10);
         root.left = new Node(20);
         root.right = new Node(30);
         root.left.left = new Node(40);
         root.left.right = new Node(60);
         root.right.right = new Node(100);
         root.right.left = new Node(90);
         ArrayList<Integer> list = topView(root);
         System.out.println(list);


    }
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.line;

            // Add to map if horizontal distance is not yet present
            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }

        // Extract values from map in sorted order of HD
        for (int val : map.values()) {
            ans.add(val);
        }

        return ans;
    }
}
