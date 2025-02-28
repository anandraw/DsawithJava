package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}


public class LL {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};

        Node head = covertArray2LL(arr);
//        Node tmp = head;
//        while (tmp!=null){
//            System.out.print(tmp.data+" ");
//            tmp=tmp.next;
//        }
//        System.out.println();

        int length = lengthOfLL(head);
        System.out.println("length of LL: "+length);

        boolean checked = checkIfPresent(head, 4);
        System.out.println(checked);

//        Node removehead = removehead(head);
//        System.out.println(removehead.data);
//
//        Node head1 = removeTail(head);
//        System.out.println(head1.data);
//
//        Node node = remveKthElemnt(head, 3);
//        System.out.println(node.data);

//        node = insertFirstNode(head, 1);
//        System.out.println(node.data);

        Node head2 = insertLastLl(head, 10);
        System.out.println(head2.data);

        insertKthElement(head, 15, 3);
//
//        Node tmp = head;
//        while (tmp!=null){
//            System.out.print(tmp.data+" ");
//            tmp=tmp.next;
//        }
//        System.out.println();

//        Node node = deleyeHead(head);
//        System.out.println(node.data);

//        delettLastLl(head);
//
//        Node tmp = head;
//        while (tmp!=null){
//            System.out.print(tmp.data+" ");
//            tmp=tmp.next;
//        }
//        System.out.println();

        deleteKthElement(head,3);


        Node tmp = head;
        while (tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();


    }


    public static Node covertArray2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node tmp = new Node(arr[i]);
            mover.next=tmp;
            mover=tmp;
        }
        return head;
    }

    public static int lengthOfLL(Node head){
        int cnt=0;
        Node tmp = head;
        while (tmp!=null){
            cnt++;
            tmp=tmp.next;
        }
        return cnt;
    }

    static boolean checkIfPresent(Node head, int val){
        Node tmp = head;
        while (tmp!=null){
            if(tmp.data==val) return true;
            tmp=tmp.next;
        }
        return false;
    }

    // deletion of LL

    public static Node removehead(Node head){
        head =head.next;
        return head;
    }

     public static Node removeTail(Node head){
         Node tmp= head;
         while (tmp.next.next!=null){
             tmp=tmp.next;
         }
         tmp.next=null;
         return head;
     }

     public static Node remveKthElemnt(Node head, int k){
         if (head==null) return head;
         if (k==1){
            head =head.next;
            return head;
         }
         int cnt=0;
         Node tmp=head;
         Node prev=null;
         while (tmp!=null) {
             cnt++;
             if (cnt == k) {
                 prev.next = prev.next.next;
                 break;
             }
             prev = tmp;
             tmp = tmp.next;
         }
         return head;
     }

     // insertion of LL

    public static Node insertFirstNode(Node head, int val){
        return new Node(val,head);
    }


    static Node insertLastLl(Node head, int val){
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        Node newNode = new Node(val);
        tmp.next=newNode;
        return head;
    }

    static void insertKthElement(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return;
            } else {
                return;
            }
        }
        if(k==1){
            return;
        }


        int cnt =0;
        Node tmp= head;
        while (tmp!=null){
            cnt++;
            if(cnt==k-1){
                Node newNode= new Node(val,tmp.next);
                tmp.next=newNode;
                break;
            }
            tmp=tmp.next;
        }

    }

    //Deletion in LL
    static Node deleyeHead(Node head){
        if(head==null) return head;
        Node tmp = head;
        head=head.next;
        return head;
    }

    static Node delettLastLl(Node head){
        if(head==null || head.next==null) return null;
        Node tmp = head;
        while (tmp.next.next!=null){
            tmp=tmp.next;
        }
        tmp.next=null;
        return head;
    }

    static Node deleteKthElement(Node head, int k){
        if (head == null) {
            return null;
        }

        if (k == 1) {
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node tmp = head;
        while (tmp != null) {
            cnt++;
            if (cnt == k - 1) {
                if (tmp.next != null) {
                    tmp.next = tmp.next.next;
                } else {
                    break;
                }
                return head;
            }
            tmp = tmp.next;
        }

        return head;
    }

    public Node insertInMiddle(Node head, int x) {
        Node temp = head;
        Node newNode = new Node(x);

        if (temp == null) return newNode;

        int middleIndex = getMiddleIndex(head);

        if (middleIndex != 0){
            for (int i = 0; i < middleIndex; i++)
                temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }

    int getMiddleIndex(Node head) {
        Node temp = head;
        int counter = 0, middleIndex;

        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return middleIndex = (counter - 1)/2;
    }

}
