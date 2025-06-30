package Trees.BFS;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.right = new Node(100);
        root.right.left = new Node(90);
        ArrayList<Integer> list = bottomView(root);
        System.out.println(list);
    }

    public static ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it=q.poll();
            Node node=it.node;
            int line=it.line;
            map.put(line,node.val);
            if(node.left!=null)q.add(new Pair(node.left,line-1));
            if(node.right!=null)q.add(new Pair(node.right,line+1));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())ans.add(entry.getValue());
        return ans;
    }
}

