package Trees;

//116. Populating Next Right Pointers in Each Node
class MyNode{
    int val;
    MyNode left;
    MyNode right;
    MyNode next;

    MyNode(int data){
        this.val=data;
        left=right=next=null;
    }
}

public class PopulatingNextRight {
    public static void main(String[] args) {

        MyNode root = new MyNode(1);
        root.left=new MyNode(2);
        root.right= new MyNode(3);
        root.left.left=new MyNode(4);
        root.left.right=new MyNode(4);
        root.right.left=new MyNode(6);
        root.right.right=new MyNode(7);

        MyNode connect = connect(root);
        System.out.println(connect.val);

    }

    public static MyNode connect(MyNode root){
         if(root==null) return null;

         MyNode leftMost=root;

         while (leftMost.left!=null){
             MyNode currNode=leftMost;
             while (currNode!=null){
                 currNode.left.next=currNode.right;
                 if (currNode.next!=null){
                     currNode.right.next=currNode.next.left;
                 }
                 currNode=currNode.next;
             }
             leftMost=leftMost.left;
         }
         return root;
    }
}
