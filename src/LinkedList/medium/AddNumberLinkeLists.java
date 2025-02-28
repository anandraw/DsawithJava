package LinkedList.medium;

public class AddNumberLinkeLists {
    public static void main(String[] args) {

      Node head1 = createLinkedList(new int[]{4, 5});
      Node head2 = createLinkedList(new int[]{3, 4, 5});

        Node node = addTwoLists(head1, head2);
        printLinkedList(node);

    }

    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverseLinkedList(num1);
        num2 = reverseLinkedList(num2);

        Node dummyNode = new Node(-1);
        Node curr = dummyNode;

        Node tmp1 = num1;
        Node tmp2 = num2;

        int carry = 0;

        while (tmp1 != null || tmp2 != null) {
            int sum = carry;
            if (tmp1 != null) {
                sum += tmp1.data;
                tmp1 = tmp1.next;
            }
            if (tmp2 != null) {
                sum += tmp2.data;
                tmp2 = tmp2.next;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;
        }

        if(carry==1) {
            Node newnode = new Node(carry);
            curr.next=newnode;

        }
        Node result = reverseLinkedList(dummyNode.next);

        return result;


    }

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

    public static void printLinkedList(Node head) {
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
