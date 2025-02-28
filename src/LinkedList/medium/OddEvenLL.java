package LinkedList.medium;

public class OddEvenLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(8);

        Node node = oddEvenList(head);
        printLinkedList(node);

    }
    public static Node oddEvenList(Node head) {
        Node evenNode = new Node(-1), evenTail=evenNode;
        Node oddNode = new Node(-1), oddTail=oddNode;
        Node curr= head,tmp;

        while (curr!=null){
            tmp=curr;
            curr=curr.next;
            tmp.next=null;

            if(tmp.data%2!=0){
                oddTail.next=tmp;
                oddTail=tmp;
            }else{
                evenTail.next=tmp;
                evenTail=tmp;
            }
        }
         evenTail.next=oddNode.next;
        return evenNode.next;

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
