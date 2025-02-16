package BinarySearch.OnAnswer;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int n = weights.length;
        int ans = leastWeightCapacity(weights, n,d);
        System.out.println("The minimum capacity should be: " + ans);


    }
    static int leastWeightCapacity(int[] arr, int n, int d) {

        // bruteforce apporch
//        int sum = Arrays.stream(arr).sum();
//        int maxi = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            maxi=Math.max(maxi,arr[i]);
//        }
//        for (int i = maxi; i <= sum; i++) {
//            if (findDays(arr, i) <= d) {
//                return i;
//            }
//        }
//        return -1;

        //optimal-binaySearch Algo

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(arr, mid);
            if (numberOfDays <= d) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;

    }

    private static int findDays(int[] arr, int cap) {
        int days = 1;
        int toatalWeight=0;
        for (int j = 0; j < arr.length; j++) {
            if (toatalWeight+arr[j]>cap){
                days+=1;
                toatalWeight=arr[j];
            }else{
                toatalWeight+=arr[j];
            }
        }
        return days;
    }
}
