package TestingShastra;


class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head  = convert2LL(arr);
//        printEle(head);
//        System.out.println();
//        int ans  = lengthOfLL(head);
//        System.out.println(ans);




    }

    public static Node convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node curr=head;

        for (int i = 1; i <arr.length ; i++) {
            Node tmp = new Node(arr[i]);
            curr.next=tmp;
            curr=tmp;
        }
       return head;
    }

    public static int lengthOfLL(Node head){
        int cnt=0;
        Node curr=head;

        while (curr!=null){
            cnt++;
            curr=curr.next;
        }
        return cnt;
    }

    static boolean checkIfPresent(Node head, int val){
        Node tmp=head;
        while (tmp!=null){
            if (tmp.data==val) return true;
            tmp=tmp.next;
        }
        return false;
    }





    public static void printEle(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }

    }
}


