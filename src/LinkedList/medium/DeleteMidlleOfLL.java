package LinkedList.medium;



public class DeleteMidlleOfLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        // Display the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle node
        head =deleteMiddle(head);

        // Displaying the updated linked list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }

    private static Node deleteMiddle(Node head) {
        if(head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    static void printLL(Node head) {

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
