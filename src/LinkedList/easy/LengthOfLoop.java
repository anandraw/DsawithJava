package LinkedList.easy;

public class LengthOfLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // This creates a loop
        fifth.next = second;

        int loopLength = countNodesinLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }

    }
    public static int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return findLength(slow , fast);
            }
        }
        return 0;

    }

    static int  findLength(Node slow , Node fast){

        int cnt=1;
        fast=fast.next;
        while(fast!=slow){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
}
