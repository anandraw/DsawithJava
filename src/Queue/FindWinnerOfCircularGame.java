package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindWinnerOfCircularGame {
    public static void main(String[] args) {
        int n =5,k=2;
        int ans = findTheWinner2(n,k);
        System.out.println(ans);

    }
    // simple array simulation
    static int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int i = 0;
        while (arr.size() > 1) {
            int idx = (i + k - 1) % arr.size();
            arr.remove(idx);
            i = idx;
        }
        return arr.get(0);
    }

    // simple queue simulation
    static int findTheWinner1(int n, int k){
        Queue<Integer>queue = new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            queue.add(i);
        }
        while (queue.size()>1){
            for (int count=1;count<=k-1;count++){
                queue.add(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
    static int findTheWinner2(int n, int k){
        int winner = 0;

        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1;
    }
}
