package LinkedList.medium;

public class RoatateLLAtKele {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = rotate(head, 3);
        printList(head);
    }

    public static Node rotate(Node head, int k) {

        if (k == 0 || head == null)
            return head;

        Node curr = head;
        int len = 1;

        // Find the length of linked list
        while (curr.next != null) {
            curr = curr.next;
            len += 1;
        }

        // Modulo k with length of linked list to handle
        // large values of k
        k %= len;

        if (k == 0)
            return head;

        // Make the linked list circular
        curr.next = head;

        // Traverse the linked list to find the kth node
        curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        // Update the (k + 1)th node as the new head
        head = curr.next;

        // Break the loop by updating next pointer of kth node
        curr.next = null;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
