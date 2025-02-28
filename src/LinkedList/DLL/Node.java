package LinkedList.DLL;

public class Node {
    public int data;
    public Node next;
    public Node back;


    public Node(int data, Node next, Node back)
    {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.back = null;
    }

}
