package LinkedList.medium;

import static LinkedList.medium.DeleteMidlleOfLL.printLL;

public class DeleteNNodeFormEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = removeNthFromEnd(head, N);
        printLL(head);

    }
    public static  Node removeNthFromEnd(Node head, int n) {
        // Create two pointers, fastp and slowp
        Node fastp = head;
        Node slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < n; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;

    }
}
