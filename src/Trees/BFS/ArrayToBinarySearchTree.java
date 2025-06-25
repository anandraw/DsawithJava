package Trees.BFS;

public class ArrayToBinarySearchTree {
    public static void main(String[] args) {
        int [] arr={-10,-3,0,5,9};
        Node root =sortedArrayToBST(arr);
        preOrderTraversal(root);
    }

    private static void preOrderTraversal(Node root) {
        if (root==null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static Node  sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    static Node helper(int[] arr,int left, int right){
        if (left>right) return null;
        int mid = left+(right-left)/2;
        // first middle ele
        Node root = new Node(arr[mid]);

        // recusivly  build the lft side and right side
        root.left=helper(arr,left,mid-1);
        root.right=helper(arr,mid+1,right);

        return root;
    }
}
