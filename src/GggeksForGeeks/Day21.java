package GggeksForGeeks;

import java.util.Arrays;

public class Day21 {
    public static void main(String[] args) {
      int  citations[] = {3, 0, 5, 3, 0};
      int anws = hIndex(citations);
        System.out.println(anws);
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;

        // Keep incrementing idx till citations[n - 1 - idx] > idx
//        while (idx < n && citations[n - 1 - idx] > idx) {
//            idx++;
//        }

        for (int i = n-1; i >=0 ; i--) {
            if (citations[i]> idx){
                idx++;
            }
        }
        return idx;
    }
}
