package BinarySearch.OnAnswer;

import java.util.Arrays;

//hard
public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n= stalls.length;
        Arrays.sort(stalls);

        int low=1,high=stalls[n-1]-stalls[0];

        while (low<=high){
            int mid=(low+high)/2;
            if(cawWePlace(stalls,mid,k)){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return high;
    }

    private static boolean cawWePlace(int[] stalls, int dist, int caws){
        int n = stalls.length;
        int cntCwos=1;
        int last=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=dist){
                cntCwos++;
                last=stalls[i];
            }
            if(cntCwos>=caws) return true;
        }
        return false;

    }
}
