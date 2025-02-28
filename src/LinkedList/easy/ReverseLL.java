package LinkedList.easy;


import static LinkedList.easy.IdenticalLinkedLists.createLinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        Node head1 = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
//        Node node = reverseLinkedList(head1);
          Node node = reverse(head1);
          Node tmp = node;
          while (tmp!=null){
              System.out.print(tmp.data+" ");
              tmp=tmp.next;
          }
//          System.out.println(node.data);


    }

    // optiomal - I
    static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // optimal - II(recursion)

    static Node reverse(Node head){
           if(head==null || head.next==null) return head;

           Node newHead= reverse(head.next);
           Node front = head.next;
           front.next=head;
           head.next=null;

           return newHead;
    }
}
