package LinkedList.easy;

public class MiddleOfLL {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        Node head1 = findMidlleOfll(head);
        System.out.println(head1.data);

    }

    static Node findMidlleOfll(Node head){

        if (head==null || head.next==null){
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}
