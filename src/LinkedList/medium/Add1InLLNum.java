package LinkedList.medium;

import java.util.Stack;

public class Add1InLLNum {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(9);
        Node node = addOne(head);
        Node current = node;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();

    }

    public static Node addOne(Node head) {
        head = reverse(head);
        Node tmp=head;
        int carry=1;

        Node dummyNode = new Node(-1);
        Node curr = dummyNode;

        while (tmp!=null){
            int sum=carry;
            if (tmp!=null){
                sum+=tmp.data;
                tmp=tmp.next;
            }

            Node newNode=new Node(sum%10);
            carry=sum/10;

            curr.next = newNode;
            curr = curr.next;

        }
        if(carry==1) {
            Node newnode = new Node(carry);
            curr.next=newnode;

        }
        Node result = reverse(dummyNode.next);

        return result;
    }

    public static Node reverse(Node head){
        Node tmp=head;
        Stack<Integer> stack= new Stack<>();
        while (tmp!=null){
            stack.push(tmp.data);
            tmp=tmp.next;
        }
        tmp=head;
        while (tmp!=null){
            tmp.data=stack.pop();
            tmp=tmp.next;
        }
        return head;
    }
}
