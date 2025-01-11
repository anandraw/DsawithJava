package Array.medium;

import java.util.ArrayList;

public class LeadersinArray {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        ArrayList<Integer> list = leadersinArray(arr);
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    static ArrayList<Integer> leadersinArray(int[] arr){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            boolean leader = true;
            for (int j = i+1; j <n ; j++) {
                if (arr[i]< arr[j]){
                   leader=false;
                   break;
                }
            }
            if (leader){
                result.add(arr[i]);
            }
        }

        return result;

    }

}
