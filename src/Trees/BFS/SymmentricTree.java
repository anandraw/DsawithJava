package Trees.BFS;

//101.Symmetric Tree(mirror img)

//        1        true
//      /   \
//     2     2
//    / \   / \
//   3  4  4   3

import java.util.LinkedList;
import java.util.Queue;

//        1          false
//      /   \
//     2     2
//      \      \
//       3      3
public class SymmentricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean ans = isSymmetric(root);
        System.out.println(ans);

    }
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if (left==null && right==null){
                continue;
            }
            if (left==null || right==null){
                return false;
            }
            if (left.val!=right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
