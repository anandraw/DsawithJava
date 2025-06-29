package Trees.DFS;

public class ValidateBT {
    public static void main(String[] args) {

        Node node =new Node(5);
        node.left=new Node(1);
        node.right=new Node(4);
        node.right.left=new Node(3);
        node.right.right=new Node(6);

        System.out.println(isValifBT(node));

    }
    public static boolean isValifBT(Node root){
        return helper(root,null,null);
    }

    public static boolean helper(Node node, Integer low, Integer high){
        if (node ==null) return true;
        if (low!=null&&node.data<=low){
            return false;
        }
        if (high!=null&&node.data>=high){
            return false;
        }

        boolean leftTree=helper(node.left,low, node.data);
        boolean rigthTree = helper(node.right, node.data,high);

        return leftTree && rigthTree;

    }
}
