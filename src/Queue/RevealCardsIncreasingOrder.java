package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Input: deck = [17,13,11,2,3,5,7]
//Output: [2,13,3,11,5,17,7]
public class RevealCardsIncreasingOrder {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        for (int i : deckRevealedIncreasing(deck)) {
            System.out.print(i+" ");
        }

    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;

        Queue<Integer> que = new LinkedList<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            que.offer(i);
        }

        Arrays.sort(deck);

        for (int i = 0; i < n; i++) {
            int idx = que.poll();
            result[idx] = deck[i];

            if (!que.isEmpty()) {
                que.offer(que.peek());
                que.poll();
            }
        }

        return result;
    }
}
