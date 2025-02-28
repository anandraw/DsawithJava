package LinkedList.medium;

public class Sort0s1s2s {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(0);

        Node head1 = segregate(head);

        Node current = head1;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();



    }
    static Node segregate(Node head) {
        Node tmp = head;
        int cnt0=0, cnt1=0, cnt2=0;
        while (tmp!=null){
            if(tmp.data==0) cnt0++;
            else if (tmp.data==1) cnt1++;
            else cnt2++;
            tmp=tmp.next;
        }
        tmp=head;
        while (tmp!=null){
            if(cnt0>0){
                tmp.data=0;
                cnt0--;
            } else if (cnt1>0) {
                tmp.data=1;
                cnt1--;
            }else{
                tmp.data=2;
                cnt2--;
            }
            tmp=tmp.next;
        }
        return head;
    }
}
