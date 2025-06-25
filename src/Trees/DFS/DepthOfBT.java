package Trees.DFS;

//104: depth of binary tree
public class DepthOfBT {
    public static void main(String[] args) {
        Node node = new Node(4);
        node.left=new Node(9);
        node.right=new Node(20);
        node.right.left=new Node(6);
        node.right.right=new Node(15);

        int ans = maxDepth(node);
        System.out.println(ans);
    }
    public static int maxDepth(Node root) {
        if (root==null) return 0;

        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        int depth=Math.max(left,right)+1;
        return depth;

    }
}
