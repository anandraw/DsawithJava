package LinkedList.easy;

public class DeletctLoopInLL {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        boolean ans = hasCycle(head);
        System.out.println(ans);

    }
    public static boolean hasCycle(Node head) {
        Node slow=head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
