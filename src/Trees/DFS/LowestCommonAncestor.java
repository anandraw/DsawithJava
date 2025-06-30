package Trees.DFS;

//235:lowest common ancestor of binary tree
public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(8);
        root.left.left=new Node(0);
        root.left.right=new Node(4);
        root.left.right.left=new Node(3);
        root.left.right.right=new Node(5);
        root.right.left=new Node(7);
        root.right.right=new Node(9);
        Node p = root.left;       // Node with value 2
        Node q = root.left.right; // Node with value 4

        Node ans=lowestCommonAncestor(root,p,q);
        System.out.println(ans.data);



    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root==null) return null;
        if (root==p || root==q){
            return root; // I found one of this
        }
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);

        if (left!=null && right!=null) {
            return root;
        }
        return left==null ? right:left;
    }
}
