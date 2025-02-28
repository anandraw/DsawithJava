package LinkedList.easy;


public class IdenticalLinkedLists {
    public static void main(String[] args) {

        Node head1 = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        Node head2 = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        boolean ans = areIdentical(head1, head2);
        System.out.println(ans);


    }
    public static boolean areIdentical(Node head1, Node head2) {
        Node tmp1=head1;
        Node tmp2=head2;

        //frist trypinng to fnd length of both;
        int cnt1=0;
        while (tmp1!=null){
            cnt1++;
            tmp1=tmp1.next;
        }

        int cnt2=0;
        while (tmp2!=null) {
            cnt2++;
            tmp2=tmp2.next;
        }

        if(cnt1!=cnt2){
            return false;
        }
        while (head1!=null){
            if (head1.data!= head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;

        }
        return true;
    }

    public static Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }
}
