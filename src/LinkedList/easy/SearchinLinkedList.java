package LinkedList.easy;

public class SearchinLinkedList {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        int key=9;
        Node node = covertArray2LL(arr);
        System.out.println(node.data);

        boolean b = searchKey(node, key);
        System.out.println(b);

    }

    public static Node covertArray2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node tmp = new Node(arr[i]);
            mover.next=tmp;
            mover=tmp;
        }
        return head;
    }

    static boolean searchKey(Node head, int key) {
        Node tmp = head;
        while (tmp!=null){
            if (tmp.data==key){
                return true;
            }
            tmp=tmp.next;
        }
        return false;
    }
}
