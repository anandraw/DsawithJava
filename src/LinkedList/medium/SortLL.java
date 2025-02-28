package LinkedList.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static LinkedList.medium.AddNumberLinkeLists.printLinkedList;

public class SortLL {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Sort the linked list
       // head = sortLL(head);
        head= sortLLOptimal(head);

        System.out.print("Sorted Linked List: ");
        printLinkedList(head);

    }

    public static Node sortLL(Node head) {

        //bruteforce apporch -> O((N)+O(NlogN)+O(N)
        List<Integer> list = new ArrayList<>();

        Node tmp = head;
        while (tmp != null) {
            list.add(tmp.data);
            tmp = tmp.next;
        }

        Collections.sort(list);

        tmp = head;

        for (int i = 0; i < list.size(); i++) {
            tmp.data = list.get(i);
            tmp = tmp.next;
        }
        return head;
    }


    //optimal apporach - using mergesort
    public static Node sortLLOptimal(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        //claculate millde of LL
        Node middle = findMiddle(head);

        //Devide and cocqure - devide into two part
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        // Recursively sort the left and right halves
        left = sortLLOptimal(left);
        right = sortLLOptimal(right);

        return mergeTwoSortedLinkedLists(left, right);

    }

    private static Node mergeTwoSortedLinkedLists(Node list1, Node list2) {

        Node dummyNode = new Node(-1);
        Node tmp = dummyNode;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }

            tmp = tmp.next;
        }
        //stil we have elemtn in list1
        if (list1!=null){
            tmp.next=list1;
        }
        if(list2!=null){
            tmp.next=list2;
        }

        return dummyNode.next;
    }
        static Node findMiddle (Node head){

            if (head == null || head.next == null) return head;

            //hire and tortoise algotrithm
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

    }
