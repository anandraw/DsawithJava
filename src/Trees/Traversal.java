package Trees;

// This is BFS : level by level
public class Traversal {
    public static void main(String[] args) {


        // Sample tree manually created for test
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.rigth = new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root); // left-root-right
        System.out.println();
        preorder(root); // root-left-right
        System.out.println();
        postorder(root); // left-right-root


    }

    public static void inorder(Node node){
        if (node==null) return;
        inorder(node.left);
        System.out.print(node.val+"->");
        inorder(node.rigth);
    }

    public static void preorder(Node node){
        if (node==null) return;

        System.out.print(node.val+"->");
        preorder(node.left);
        preorder(node.rigth);
    }

    public static void postorder(Node node){
        if (node==null) return;

        postorder(node.left);
        postorder(node.rigth);
        System.out.print(node.val+"->");
    }
}
