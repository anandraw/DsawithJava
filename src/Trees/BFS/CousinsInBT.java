package Trees.BFS;

//993. Cousins in Binary Tree
//2641

public class CousinsInBT {
    public static void main(String[] args) {
        // Sample tree:
        //      1
        //     / \
        //    2   3
        //   /
        //  4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right= new TreeNode(5);

        System.out.println(isCousins(root, 4, 3));  // false
        System.out.println(isCousins(root, 4, 5));  // false (5 not in tree)

    }
    static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode nodeX = findNode(root, x);
        TreeNode nodeY = findNode(root, y);

        if (nodeX == null || nodeY == null) return false;

        return (level(root, nodeX, 0) == level(root, nodeY, 0)) && !isSibling(root, nodeX, nodeY);
    }

    private static TreeNode findNode(TreeNode node, int x) {
        if (node == null) return null;
        if (node.val == x) return node;

        TreeNode leftResult = findNode(node.left, x);
        if (leftResult != null) return leftResult;

        return findNode(node.right, x);
    }

    private static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) return false;
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x)
                || isSibling(node.left, x, y) || isSibling(node.right, x, y));
    }

    private static int level(TreeNode node, TreeNode x, int lev) {
        if (node == null) return 0;
        if (node == x) return lev;

        int l = level(node.left, x, lev + 1);
        if (l != 0) return l;

        return level(node.right, x, lev + 1);

    }
}
