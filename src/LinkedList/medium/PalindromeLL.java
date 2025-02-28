package LinkedList.medium;

import java.util.Stack;

public class PalindromeLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(0);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static boolean isPalindrome(Node head) {

        Node tmp =head;
        Stack<Integer> stack = new Stack<>();

        while (tmp!=null){
            stack.push(tmp.data);
            tmp=tmp.next;
        }
        tmp=head;
        while (tmp!=null){
            if(tmp.data!=stack.peek()){
                return false;
            }
            stack.pop();
            tmp=tmp.next;
        }

        return true;

    }
}
