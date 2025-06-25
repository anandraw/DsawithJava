package Trees.BFS;

import java.util.LinkedList;
import java.util.Queue;

//                 20
//              /      \
//              10       26
//              /  \     /   \
//              4     18  24    27
//              /  \
//              14   19
//              /  \
//              13  15
//
//Input : 24
//Output : 27
// means next to right. first add children then watch if present or not
public class LevelOrderSuccOfNode {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.left.left = new Node(4);
        root.left.right = new Node(18);
        root.right = new Node(26);
        root.right.left = new Node(24);
        root.right.right = new Node(27);
        root.left.right.left = new Node(14);
        root.left.right.left.left = new Node(13);
        root.left.right.left.right = new Node(15);
        root.left.right.right = new Node(19);

        Node key = root.right.left; // node 24

        Node res = levelOrderSuccessor(root, key);

        if (res != null)
            System.out.println("LevelOrder successor of "
                    +key.val + " is " + res.val);
        else
            System.out.println("LevelOrder successor of "
                    +key.val + " is NULL");


    }

    static Node levelOrderSuccessor(Node root, Node key) {
        if (root==null) return null;
        Queue<Node> q = new LinkedList<> ();
        q.add(root);
        while (!q.isEmpty()) {
            Node nd = q.peek();
            q.remove();
            if (nd.left != null) {
                q.add(nd.left);
            }
            if (nd.right != null) {
                q.add(nd.right);
            }
            if (nd == key)
                break;
        }
        return q.peek();
    }
}