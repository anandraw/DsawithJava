package Trees.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//199. Binary Tree Right Side View
//             1
//           /   \
//           2     3
//           /  \
//           4    5

//Output: 1 2 4
public class LeftSideViewOFBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> list = rightSideView(root);
        System.out.println(list);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root==null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0; i <levelSize ; i++) {
                TreeNode currNode = queue.poll();
                if (i==0){  // this my last node
                    ans.add(currNode.val);
                }
                if (currNode.left!=null) queue.offer(currNode.left);
                if (currNode.right!=null) queue.offer(currNode.right);
            }
        }
        return ans;
    }
}
