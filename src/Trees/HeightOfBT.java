package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBT {
    public static void main(String[] args) {
        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(height(root));
    }
    public static  int height(Node node) {
        if (node==null) return 0;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        int height=0;

        while (!queue.isEmpty()){
            int size= queue.size();

            for (int i = 0; i <size ; i++) {
                Node currNode=queue.poll();
                if (currNode.left!=null) queue.add(currNode.left);
                if (currNode.right !=null) queue.add(currNode.right);
            }
            height++;
        }
        return height-1;
    }
}
