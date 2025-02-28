package LinkedList.DLL;

public class ConstructDLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node node = constructDLL(arr);
        Node tmp=node;
        while (tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }


    }
    static Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node tmp = new Node(arr[i], null, prev);
            prev.next = tmp;
            prev = tmp;
        }
        return head;
    }
}
