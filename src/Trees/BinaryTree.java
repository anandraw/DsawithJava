package Trees;

import java.util.Scanner;

class Node{
    int val;
    Node left, right;

     Node(int data){
         this.val=data;
         left=right=null;
     }
}
public class BinaryTree {
    Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter root node");
        int val=scanner.nextInt();
        root=new Node(val);
        printlate(scanner,root);
    }

    private void printlate(Scanner scanner, Node node){
        System.out.println("Dou you want left of "+ node.val );
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Eneter the value of left node: "+node.val);
            int value= scanner.nextInt();
            node.left=new Node(value);
            printlate(scanner,node.left);
        }
        System.out.print("Do you want right of " + node.val + "? (true/false): ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter the value of right node of " + node.val + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            printlate(scanner, node.right);
        }
    }
    public void display(){
        displayTree(root," ");
    }

    private void displayTree(Node node, String indent){
        if (node == null) {
            return;
        }

        System.out.println(indent + node.val);
        displayTree(node.left, indent + "  ");
        displayTree(node.right, indent + "  ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}
